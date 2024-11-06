<?php
$conn = new mysqli("localhost", "root", "", "registro");

if ($conn->connect_error) {
    die("Error de conexión: " . $conn->connect_error);
}

$message = '';

if (isset($_GET['token'])) {
    $token = $_GET['token'];

    // Verificar el token en la base de datos
    $sql = "SELECT usuario FROM recuperacion WHERE token='$token' AND expiracion > NOW()";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            $nueva_contrasena = trim($_POST['nueva_contrasena']);
            $nueva_contrasena_confirm = trim($_POST['nueva_contrasena_confirm']);

            if ($nueva_contrasena !== $nueva_contrasena_confirm) {
                $message = "Las contraseñas no coinciden.";
            } else {
                $usuario = $result->fetch_assoc()['usuario'];
                $contraseñaHasheada = password_hash($nueva_contrasena, PASSWORD_DEFAULT);

                // Actualizar la contraseña en la tabla personas
                $sql = "UPDATE personas SET contrasena='$contraseñaHasheada' WHERE usuario='$usuario'";
                $conn->query($sql);

                // Eliminar el token usado
                $sql = "DELETE FROM recuperacion WHERE token='$token'";
                $conn->query($sql);

                $message = "Contraseña actualizada exitosamente.";
            }
        }
    } else {
        $message = "Token inválido o expirado.";
    }
} else {
    $message = "No se ha proporcionado un token.";
}

$conn->close();
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Restablecer Contraseña</title>
    <link rel="stylesheet" href="styles.css"> <!-- Asegúrate de que el archivo CSS esté en la ubicación correcta -->
</head>
<body>
    <h1>Restablecer Contraseña</h1>
    <?php if ($message): ?>
        <div class="message"><?php echo $message; ?></div>
    <?php endif; ?>
    
    <form method="post" action="">
        <div>
            <label for="nueva_contrasena">Nueva Contraseña:</label>
            <input type="password" name="nueva_contrasena" required>
        </div>
        <div>
            <label for="nueva_contrasena_confirm">Confirmar Nueva Contraseña:</label>
            <input type="password" name="nueva_contrasena_confirm" required>
        </div>
        <button type="submit">Restablecer Contraseña</button>
    </form>
</body>
</html>
