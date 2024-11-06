<?php
session_start();
$conn = new mysqli("localhost", "root", "", "registro");

if ($conn->connect_error) {
    die("Error de conexión: " . $conn->connect_error);
}

$message = '';

if (isset($_GET['logout'])) {
    session_destroy();
    header("Location: " . $_SERVER['PHP_SELF']);
    exit;
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $usuario = $conn->real_escape_string(trim($_POST['usuario']));
    $contrasena = trim($_POST['contrasena']);

    $sql = "SELECT contrasena FROM personas WHERE usuario='$usuario'";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        $row = $result->fetch_assoc();
        if (password_verify($contrasena, $row['contrasena'])) {
            $_SESSION['usuario'] = $usuario;
            $message = "Inicio de sesión exitoso!";
        } else {
            $message = "Contraseña incorrecta.";
        }
    } else {
        $message = "Usuario no encontrado.";
    }
}

$conn->close();
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Inicio de Sesión</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>Inicio de Sesión</h1>
    
    <?php if (isset($_SESSION['usuario'])): ?>
        <div class="welcome">
            <p>Bienvenido, <?php echo $_SESSION['usuario']; ?>!</p>
            <a href="?logout=true"><button>Cerrar Sesión</button></a>
        </div>
    <?php else: ?>
        <form method="post" action="">
            <div class="container">
                <label for="usuario">Usuario:</label>
                <input type="email" name="usuario" required>
            </div>    
            <div class="container">
                <label for="contrasena">Contraseña:</label>
                <input type="password" name="contrasena" required>
            </div>
            <button type="submit">Iniciar Sesión</button>

        </form>
        <p></p>
    <a href="recuperar.php"><button>¿Olvidaste tu contraseña?</button></a>
        <p></p>
    <a href="registro.php"><button>Registro</button></a>
    <?php endif; ?>

    <?php if ($message): ?>
        <div class="message">
            <?php echo $message; ?>
        </div>
    <?php endif; ?>
</body>
</html>
