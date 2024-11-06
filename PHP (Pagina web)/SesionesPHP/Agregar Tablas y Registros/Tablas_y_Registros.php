<?php
$link = mysqli_connect("localhost", "root", "", "demo");

if (!$link) {
    die("Conexión fallida: " . mysqli_connect_error());
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nombre = $_POST['nombre'];
    $apellido = $_POST['apellido'];
    $edad = $_POST['edad'];
    $estado_civil = $_POST['estado_civil'];
    $sexo = $_POST['sexo'];
    $correo = $_POST['correo'];
    $telefono = $_POST['telefono'];
    $direccion = $_POST['direccion'];

    // Verificar si el nombre ya está registrado
    $sql_verificar = "SELECT * FROM personas WHERE nombre = '$nombre'";
    $resultado = mysqli_query($link, $sql_verificar);

    if (mysqli_num_rows($resultado) > 0) {
        echo "Error: El nombre '$nombre' ya está registrado en la base de datos.";
    } else {
        // Insertar los datos en la base de datos
        $sql = "INSERT INTO personas (nombre, apellido, edad, estado_civil, correo, telefono, direccion, sexo) 
                VALUES ('$nombre', '$apellido', '$edad', '$estado_civil', '$correo', '$telefono', '$direccion', '$sexo')";

        if (mysqli_query($link, $sql)) {
            echo "Registro agregado correctamente";
        } else {
            echo "Error al agregar el registro: " . mysqli_error($link);
        }
    }
}

mysqli_close($link);
?>
