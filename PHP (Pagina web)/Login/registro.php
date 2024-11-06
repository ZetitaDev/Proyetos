<?php
$conn = new mysqli("localhost", "root", "", "registro");

if ($conn->connect_error) {
    die("Error de conexión: " . $conn->connect_error);
}

$mensajeError = '';
$registroExitoso = false;

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $usuario = $conn->real_escape_string(trim($_POST['usuario']));
    $contrasena = trim($_POST['contrasena']);
    $contrasenaConfirm = trim($_POST['contrasena_confirm']);
    $nombre = trim($_POST['nombre']);
    $apellido = trim($_POST['apellido']);

    if ($contrasena !== $contrasenaConfirm) {
        $mensajeError = "Las contraseñas no coinciden.";
    } else {
        $contraseñaHasheada = password_hash($contrasena, PASSWORD_DEFAULT);

        $sql = "INSERT INTO personas (usuario, contrasena, nombre, apellido) VALUES ('$usuario', '$contraseñaHasheada', '$nombre', '$apellido')";

        if ($conn->query($sql) === TRUE) {
            $registroExitoso = true;
        } else {
            $mensajeError = "Error: " . $sql . "<br>" . $conn->error;
        }
    }
}
$conn->close();
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Registro</title>
    <link rel="stylesheet" href="styles.css">
    <script src="script.js" defer></script>
    <style>
.modal {
    display: none; 
    position: fixed; 
    z-index: 1; 
    left: 0;
    top: 0;
    width: 100%; 
    height: 100%; 
    overflow: auto; 
    background-color: rgba(0, 0, 0, 0.5); 
    padding-top: 60px;
}

.modal-content {
    background-color: #e1fcff;
    margin: 5% auto; 
    padding: 20px;
    border: 1px solid #5589c4;
    width: 400px;
    border-radius: 8px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
}

.close {
    color: #aaa;
    float: right;
    font-size: 28px;
    font-weight: bold;
}

.close:hover,
.close:focus {
    color: #5589c4;
    text-decoration: none;
    cursor: pointer;
}

.modal p {
    color: #5589c4;
    text-align: center;
    margin: 0;
}

.modal-content button {
    width: 100%;
    padding: 10px;
    background-color: #5589c4;
    color: #e1fcff;
    border: none;
    border-radius: 4px;
    font-size: 16px;
    cursor: pointer;
    margin-top: 20px;
}

.modal-content button:hover {
    background-color: #98c0f6;
}

    </style>
</head>
<body>
    <h1>Registro</h1>
    <form method="post" action="">
        <div class="container">
            <label for="nombre">Nombre:</label>
            <input type="text" name="nombre" required>
        </div>
        <div class="container">
            <label for="apellido">Apellido:</label>
            <input type="text" name="apellido" required>
        </div>
        <div class="container">
            <label for="usuario">Usuario:</label>
            <input type="email" name="usuario" required>
        </div>
        <div class="container">
            <label for="contrasena">Contraseña:</label>
            <input type="password" name="contrasena" id="contrasena" required oninput="actualizarDificultad()">
            <div id="nivelDificultad" style="display: none;">Nivel de Dificultad: Baja</div>
        </div>
        <div class="container">
            <label for="contrasena_confirm">Confirmar Contraseña:</label>
            <input type="password" name="contrasena_confirm" required>
        </div>
        <button type="submit">Registrar</button>
        <p></p>
        <button type="reset">Cancelar</button>
        <p style="color: red;"><?php echo $mensajeError; ?></p>
    </form>
    <p></p>
    <a href="login.php"><button>Iniciar sesión</button></a>

    <div id="modalRegistro" class="modal">
    <div class="modal-content">
        <p>¡Registro exitoso!</p>
        <button id="okButton" onclick="cerrarModal()">OK</button>
    </div>
</div>

    <script>
        window.onload = function() {
            <?php if ($registroExitoso): ?>
                mostrarModal();
            <?php endif; ?>
        }
    </script>
</body>
</html>
