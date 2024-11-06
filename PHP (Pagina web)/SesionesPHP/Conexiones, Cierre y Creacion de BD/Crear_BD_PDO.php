<?php
try{
    $pdo = new PDO("mysql:host=localhost;", "root", "");
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch(PDOException $e){
    die("ERROR: No se pudo establecer la conexión. " . $e->getMessage());
}

try{
    $sql = "CREATE DATABASE demo3";
    $pdo->exec($sql);
    echo "Base de datos creada exitósamente";
} catch(PDOException $e){
    die("ERROR: No se pudo executar la consulta $sql. " . $e->getMessage());
}
?>