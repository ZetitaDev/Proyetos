<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabla de Nómina</title>
    <link rel="stylesheet" href="estilos.css">
</head>
<body>

<h2>Tabla de Nómina</h2>

<table border="1">
<thead>
    <tr>
        <th>Nombre</th>
        <th>Apellido</th>
        <th>Cédula</th>
        <th>Posición</th>
        <th>Sueldo Bruto (RD$)</th>
        <th>Incentivo</th>
        <th>Seguro Vida (RD$)</th>
        <th>Seguro Pensiones (RD$)</th>
        <th>Plan Odontológico (RD$)</th>
        <th>Seguro Familiar (RD$)</th>
        <th>Descuentos Funerarios (RD$)</th>
        <th>Retiro Complementario (RD$)</th>
        <th>ISR (RD$)</th>
        <th>Total Descuentos (RD$)</th>
        <th>Sueldo Neto (RD$)</th>
    </tr>
</thead>
<tbody>
    <?php
    $conn = new mysqli("localhost", "root", "", "nomina");

    if ($conn->connect_error) {
        die("Conexión fallida: " . $conn->connect_error);
    }

    $sql = "SELECT nombre, apellido, cedula, posicion, sueldo_bruto, incentivo, 
                   seguro_vida, seguro_pensiones, plan_odontologico, seguro_familiar, 
                   descuentos_funerarios, retiro_complementario, isr_mensual, descuento_total, sueldo_neto 
            FROM empleados";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        while ($row = $result->fetch_assoc()) {
            echo "<tr>";
            echo "<td>" . $row["nombre"] . "</td>";
            echo "<td>" . $row["apellido"] . "</td>";
            echo "<td>" . $row["cedula"] . "</td>";
            echo "<td>" . $row["posicion"] . "</td>";
            echo "<td>" . number_format($row["sueldo_bruto"], 2) . "</td>";
            echo "<td>" . number_format($row["incentivo"], 2) . "</td>";
            echo "<td>" . number_format($row["seguro_vida"], 2) . "</td>";
            echo "<td>" . number_format($row["seguro_pensiones"], 2) . "</td>";
            echo "<td>" . number_format($row["plan_odontologico"], 2) . "</td>";
            echo "<td>" . number_format($row["seguro_familiar"], 2) . "</td>";
            echo "<td>" . number_format($row["descuentos_funerarios"], 2) . "</td>";
            echo "<td>" . number_format($row["retiro_complementario"], 2) . "</td>";
            echo "<td>" . number_format($row["isr_mensual"], 2) . "</td>"; // Mostrar ISR
            echo "<td>" . number_format($row["descuento_total"], 2) . "</td>";
            echo "<td>" . number_format($row["sueldo_neto"], 2) . "</td>";
            echo "</tr>";
        }
    } else {
        echo "<tr><td colspan='15'>No hay registros de empleados</td></tr>";
    }

    $conn->close();
    ?>
</tbody>
</table>

<div class="btn-container">
<a href="guardar_empleado.php" class="btn-regresar">Volver al formulario de registro</a>
</div>

</body>
</html>
