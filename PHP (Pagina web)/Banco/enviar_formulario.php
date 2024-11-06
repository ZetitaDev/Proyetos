<?php

$conn = new mysqli("localhost", "root", "", "banco");

if ($conn->connect_error) {
    die("Conexión fallida: " . $conn->connect_error);
}

$nombre = $_POST['nombre'];
$apellido = $_POST['apellido'];
$correo = $_POST['correo'];
$telefono = $_POST['telefono'];
$direccion = $_POST['direccion'];
$direccion2 = $_POST['direccion2'];
$ciudad = $_POST['ciudad'];
$estado = $_POST['estado'];
$codigo_postal = $_POST['codigo_postal'];
$estado_casa = $_POST['estado_casa'];
$necesita_vender = $_POST['necesita_vender'];
$comentarios = $_POST['comentarios'];

$sql = "INSERT INTO cuentas (nombre, apellido, correo, telefono, direccion, direccion2, ciudad, estado, codigo_postal, estado_casa, necesita_vender, comentarios) 
VALUES ('$nombre', '$apellido', '$correo', '$telefono', '$direccion', '$direccion2', '$ciudad', '$estado', '$codigo_postal', '$estado_casa', '$necesita_vender', '$comentarios')";

if ($conn->query($sql) === TRUE) {
    echo "¡Registro exitoso!";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>
