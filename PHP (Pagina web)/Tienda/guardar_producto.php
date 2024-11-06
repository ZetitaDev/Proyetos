<!DOCTYPE html>
<html>
<head>
    <title>Registrar Producto</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h2>Registrar Producto</h2>

    <?php
    $conexion = new mysqli("localhost", "root", "", "tienda");

    if ($conexion->connect_error) {
        die("Conexión fallida: " . $conexion->connect_error);
    }

    $mensaje_confirmacion = '';
    $mostrar_boton = false;

    if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['nombre']) && isset($_POST['precio']) && isset($_POST['cantidad'])) {
        $nombre = $_POST['nombre'];
        $precio = $_POST['precio'];
        $cantidad = $_POST['cantidad'];

        $itbis = $precio * 0.18;

        $sql = "INSERT INTO productos (nombre, precio, itbis, cantidad) VALUES ('$nombre', '$precio', '$itbis', '$cantidad')";

        if ($conexion->query($sql) === TRUE) {
            $mensaje_confirmacion = "Producto '$nombre' registrado exitosamente.";
            $mostrar_boton = true;
        } else {
            $mensaje_confirmacion = "Error al registrar el producto: " . $conexion->error;
        }
    }

    if ($mensaje_confirmacion != '') {
        echo "<p><strong>$mensaje_confirmacion</strong></p>";
    }
    ?>

    <form action="" method="post">
        <label>Nombre:</label>
        <input type="text" name="nombre" required><br><br>
        <label>Precio:</label>
        <input type="number" step="0.01" name="precio" required><br><br>
        <label>Cantidad:</label>
        <input type="number" name="cantidad" required><br><br>
        <input type="submit" value="Guardar Producto">
    </form>

    <?php if ($mostrar_boton): ?>
        <br>
        <form action="comprar_producto.php" method="get">
            <input type="submit" value="Ver Productos">
        </form>
    <?php endif; ?>

    <?php
    $conexion->close();
    ?>
</body>
</html>
