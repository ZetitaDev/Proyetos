<?php
/* Intento de conexión al servidor MySQL. Suponiendo que está ejecutando MySQL
servidor con configuración predeterminada (usuario 'root' sin contraseña) */
$mysqli = new mysqli("localhost", "root", "", );

// Creación de la base de datos
$sql = "CREATE DATABASE demo2";
if($mysqli->query($sql) === true){
    echo "Base de datos creada exitósamente";
} else{
    echo "ERROR: No se pudo ejecutar $sql. " . $mysqli->error;
}

?>