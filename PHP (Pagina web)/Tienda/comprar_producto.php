<!DOCTYPE html>
<html>
<head>
    <title>Lista de Productos</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h2>Lista de Productos</h2>

    <?php
    $conexion = new mysqli("localhost", "root", "", "tienda");

    if ($conexion->connect_error) {
        die("Conexión fallida: " . $conexion->connect_error);
    }

    $productos_por_pagina = 5;

    $pagina_actual = isset($_GET['page']) ? (int)$_GET['page'] : 1;

    $offset = ($pagina_actual - 1) * $productos_por_pagina;

    if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['nombre']) && isset($_POST['cantidad_vender'])) {
        $nombre = $_POST['nombre'];
        $cantidad_vender = $_POST['cantidad_vender'];

        $sql = "SELECT cantidad FROM productos WHERE nombre='$nombre'";
        $resultado = $conexion->query($sql);
        $row = $resultado->fetch_assoc();

        if ($row) {
            $cantidad_actual = $row['cantidad'];

            if ($cantidad_actual >= $cantidad_vender) {
                $nueva_cantidad = $cantidad_actual - $cantidad_vender;

                $sql_actualizar = "UPDATE productos SET cantidad='$nueva_cantidad' WHERE nombre='$nombre'";
                if ($conexion->query($sql_actualizar) === TRUE) {
                    echo "<p><strong>Compra exitosa. Quedan $nueva_cantidad unidades del producto '$nombre'.</strong></p>";

                    if ($nueva_cantidad == 0) {
                        $conexion->query("DELETE FROM productos WHERE nombre='$nombre'");
                    }
                } else {
                    echo "<p><strong>Error al actualizar el producto: " . $conexion->error . "</strong></p>";
                }
            } else {
                echo "<p><strong>Stock insuficiente. Solo hay $cantidad_actual unidades del producto '$nombre'.</strong></p>";
            }
        } else {
            echo "<p><strong>Producto no encontrado.</strong></p>";
        }
    }

    $sql_total = "SELECT COUNT(*) as total FROM productos";
    $resultado_total = $conexion->query($sql_total);
    $row_total = $resultado_total->fetch_assoc();
    $total_productos = $row_total['total'];

    $total_paginas = ceil($total_productos / $productos_por_pagina);

    $sql = "SELECT nombre, precio, itbis, cantidad FROM productos LIMIT $productos_por_pagina OFFSET $offset";
    $resultado = $conexion->query($sql);

    if ($resultado->num_rows > 0) {
        echo "<table border='1'>
            <tr>
                <th>Nombre</th>
                <th>Precio</th>
                <th>ITBIS</th>
                <th>Cantidad Disponible</th>
                <th>Comprar</th>
            </tr>";

        while ($row = $resultado->fetch_assoc()) {
            echo "<tr>
                <td>" . $row['nombre'] . "</td>
                <td>" . $row['precio'] . "</td>
                <td>" . $row['itbis'] . "</td>
                <td>" . $row['cantidad'] . "</td>
                <td>
                    <form method='post'>
                        <input type='hidden' name='nombre' value='" . $row['nombre'] . "'>
                        <input type='number' name='cantidad_vender' placeholder='Cantidad' required>
                        <input type='submit' value='Comprar'>
                    </form>
                </td>
            </tr>";
        }
        echo "</table>";
    } else {
        echo "<p>No hay productos registrados.</p>";
    }

    echo "<div class='button-container'>";
    for ($i = 1; $i <= $total_paginas; $i++) {
        if ($i == $pagina_actual) {
            echo "<strong>$i</strong> ";
        } else {
            echo "<a href='comprar_producto.php?page=$i'>$i</a> ";
        }
    }
    echo "</div>";

    $conexion->close();
    ?>
</body>
</html>
