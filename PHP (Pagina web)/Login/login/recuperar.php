<?php
require 'PHPMailer/src/Exception.php';
require 'PHPMailer/src/PHPMailer.php';
require 'PHPMailer/src/SMTP.php';

use PHPMailer\PHPMailer\PHPMailer;
use PHPMailer\PHPMailer\Exception;

$conn = new mysqli("localhost", "root", "", "registro");

if ($conn->connect_error) {
    die("Error de conexión: " . $conn->connect_error);
}

$message = '';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $usuario = $conn->real_escape_string(trim($_POST['usuario']));

    // Verificar si el usuario existe
    $sql = "SELECT nombre, apellido FROM personas WHERE usuario='$usuario'";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        $row = $result->fetch_assoc();
        $nombre = $row['nombre'];
        $apellido = $row['apellido'];
        $token = bin2hex(random_bytes(50)); // Generar un token único

        // Guardar el token en la base de datos
        $expiracion = date("Y-m-d H:i:s", strtotime("+1 hour"));
        $sql = "INSERT INTO recuperacion (usuario, token, expiracion) VALUES ('$usuario', '$token', '$expiracion')";
        $conn->query($sql);

        // Enviar el correo
        $mail = new PHPMailer(true);
        try {
            $mail->isSMTP();
            $mail->Host = 'smtp.gmail.com';
            $mail->SMTPAuth = true;
            $mail->Username = 'tu_correo@gmail.com'; // Tu correo
            $mail->Password = 'tu_contraseña'; // Tu contraseña de correo
            $mail->SMTPSecure = 'tls';
            $mail->Port = 587;

            $mail->setFrom('tu_correo@gmail.com', 'Tu Nombre');
            $mail->addAddress($usuario);

            $link = "http://localhost/login/restablecer.php?token=$token"; // Enlace de restablecimiento
            $mail->isHTML(true);
            $mail->Subject = 'Recuperación de Contraseña';
            $mail->Body    = "Hola $nombre $apellido, haz clic en el siguiente enlace para restablecer tu contraseña: <a href='$link'>$link</a>";

            $mail->send();
            $message = "Se ha enviado un enlace para restablecer la contraseña a tu correo electrónico.";
        } catch (Exception $e) {
            $message = "No se pudo enviar el correo. Error: {$mail->ErrorInfo}";
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
    <title>Recuperar Contraseña</title>
    <link rel="stylesheet" href="styles.css"> <!-- Asegúrate de que el archivo CSS esté en la ubicación correcta -->
</head>
<body>
    <h1>Recuperar Contraseña</h1>
    <form method="post" action="">
        <div>
            <label for="usuario">Correo electrónico:</label>
            <input type="email" name="usuario" required>
        </div>
        <button type="submit">Enviar enlace</button>
    </form>
    <?php if ($message): ?>
        <div class="message"><?php echo $message; ?></div>
    <?php endif; ?>
</body>
</html>
