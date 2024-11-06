<?php

$link = mysqli_connect("localhost", "root", "",);


$sql = "CREATE DATABASE demo1";

if(mysqli_query($link,$sql)) {
    echo "Conexion creada con exito.";
}else{
    die("ERROR. No se pudo crear la base de datos. $sql" . mysqli_error($link));
}

?>