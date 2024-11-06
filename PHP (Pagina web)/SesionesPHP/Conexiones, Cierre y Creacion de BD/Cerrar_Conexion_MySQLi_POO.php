<?php
$mysqli = new mysqli("localhost", "root", "", "demo");

//Verificar conexion
if($mysqli === false){
    die("ERROR: No se pudo conectar a la base de datos" . $mysqli -> connect_error);
}

//Conexion exitosa
echo "Conexion exitosa con MySQLi con POO: " . $mysqli -> host_info;

//Cerrar conexion
$mysqli -> close();

echo "</p></p></p> En esta instancia se ha cerrado la conexion de la base de datos con MySQLi con POO"
?>