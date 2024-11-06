<?php
$mysqli = new mysqli("localhost", "root", "", "demo");

//Verificar conexion
if($mysqli === false){
    die("ERROR: No se pudo conectar a la base de datos" . $mysqli -> connect_error);
}


//Conexion exitosa
echo "Conexion exitosa con MySQLi con POO: " . $mysqli -> host_info;
?>