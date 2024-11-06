<?php
try{
    $pdo = new PDO("mysql:host=localhost;dbname=demo", "root", "",);
    $pdo -> setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    echo "Conexion realizada. Informacion del Host: " . $pdo -> getAttribute(constant("PDO::ATTR_CONNECTION_STATUS"));
} catch(PDOException $e){
    die("ERROR: No se pudo conectar. " . $e -> getMessage());
}

?>