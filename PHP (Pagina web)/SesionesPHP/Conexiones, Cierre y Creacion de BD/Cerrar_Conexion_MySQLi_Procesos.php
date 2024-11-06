<?php
$link = mysqli_connect("localhost", "root", "", "demo");

//Verificar conexion
if($link == false){
    die("ERROR: No se pudo conectar a la base de datos." . mysqli_connect_error());
}

//Conexion exitosa
echo "Conexion exitosa con MySQLi Procesos. Informacion del Host" . mysqli_get_host_info($link);

//Cerrar la conexion
mysqli_close($link);
echo "</p></p></p> En esta instancia se ha cerrado la conexion de la base de datos con MySQLi en linea de procedimientos"
?>