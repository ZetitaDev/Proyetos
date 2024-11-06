<?php
try{
    $pdo = new PDO("mysql:host=localhost;dbname=demo", "root", "",);

    //Estableciendo que el modo de error de PDO sea en excepcion
    $pdo -> setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    //Mostrar conexion exitosa
    echo "Conexion realizada. Informacion del Host: " . $pdo -> getAttribute(constant("PDO::ATTR_CONNECTION_STATUS"));
} catch(PDOException $e){
    die("ERROR: No se pudo conectar. " . $e -> getMessage());
}

//Cerrar la conexion
unset($pdo);
echo "</p></p></p> En esta instancia se ha cerrado la conexion de la base de datos con PDO"
?>