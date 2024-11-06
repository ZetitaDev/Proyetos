<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro de Empleados</title>
    <link rel="stylesheet" href="estilos.css">
</head>
<body>

<h2>Formulario de Registro de Empleados</h2>

<?php
$mensaje = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {

    $conn = new mysqli("localhost", "root", "", "nomina");

    if ($conn->connect_error) {
        die("Conexión fallida: " . $conn->connect_error);
    }

    $nombre = $_POST['nombre'];
    $apellido = $_POST['apellido'];
    $cedula = $_POST['cedula'];
    $posicion = $_POST['posicion'];
    $sueldo_bruto = $_POST['sueldo_bruto'];

    $seguro_vida = $sueldo_bruto * 0.02;
    $seguro_pensiones = $sueldo_bruto * 0.0287;
    $plan_odontologico = $sueldo_bruto * 0.01;
    $seguro_familiar = $sueldo_bruto * 0.02;
    $descuentos_funerarios = $sueldo_bruto * 0.01;
    $retiro_complementario = $sueldo_bruto * 0.02;

    $ganancia_anual = $sueldo_bruto * 12;
    $isr = 0;
    
    if ($ganancia_anual > 867123.01) {
        $isr = 79776.00 + 0.25 * ($ganancia_anual - 867123.01);
    } elseif ($ganancia_anual > 624329.01) {
        $isr = 31216.00 + 0.20 * ($ganancia_anual - 624329.01);
    } elseif ($ganancia_anual > 416220.01) {
        $isr = 0.15 * ($ganancia_anual - 416220.01);
    } else {
        $isr = 0;
    }
    
    $isr_mensual = $isr / 12;
    
    $isr_mensual = $isr / 12;

    $total_descuentos = $seguro_vida + $seguro_pensiones + $plan_odontologico + 
                        $seguro_familiar + $descuentos_funerarios + $retiro_complementario + 
                        $isr_mensual;

    $valor_incentivo = 0;

    if (!empty($_POST['incentivos'])) {
        foreach ($_POST['incentivos'] as $incentivo) {
            if ($incentivo == "1% por Formación") {
                $valor_incentivo += $sueldo_bruto * 0.01;
            } elseif ($incentivo == "2% por Desempeño") {
                $valor_incentivo += $sueldo_bruto * 0.02;
            } elseif ($incentivo == "3% por Años de Servicio") {
                $valor_incentivo += $sueldo_bruto * 0.03;
            }
        }
    }

    $sueldo_neto = $sueldo_bruto - $total_descuentos + $valor_incentivo;

$sql = "INSERT INTO empleados (nombre, apellido, cedula, posicion, sueldo_bruto, incentivo, 
            seguro_vida, seguro_pensiones, plan_odontologico, seguro_familiar, 
            descuentos_funerarios, retiro_complementario, isr_mensual, descuento_total, sueldo_neto) 
            VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

$stmt = $conn->prepare($sql);
$stmt->bind_param("ssssdddddddddss", $nombre, $apellido, $cedula, $posicion, 
    $sueldo_bruto, $valor_incentivo, $seguro_vida, $seguro_pensiones, $plan_odontologico, 
    $seguro_familiar, $descuentos_funerarios, $retiro_complementario, $isr_mensual, 
    $total_descuentos, $sueldo_neto);

    if ($stmt->execute()) {
        $mensaje = "Empleado registrado exitosamente.";
    } else {
        $mensaje = "Error al registrar el empleado: " . $conn->error;
    }

    $stmt->close();
    $conn->close();
}
?>

<form action="" method="POST">
    <label for="nombre">Nombre:</label>
    <input type="text" id="nombre" name="nombre" required><br><br>

    <label for="apellido">Apellido:</label>
    <input type="text" id="apellido" name="apellido" required><br><br>

    <label for="cedula">Cédula:</label>
    <input type="text" id="cedula" name="cedula" required><br><br>

    <label for="posicion">Posición:</label>
    <input type="text" id="posicion" name="posicion" required><br><br>

    <label for="sueldo_bruto">Sueldo Bruto (RD$):</label>
    <input type="number" id="sueldo_bruto" name="sueldo_bruto" required><br><br>

    <label>Incentivos:</label>
    <input type="checkbox" name="incentivos[]" value="1% por Formación"> 1% por Formación<br>
    <input type="checkbox" name="incentivos[]" value="2% por Desempeño"> 2% por Desempeño<br>
    <input type="checkbox" name="incentivos[]" value="3% por Años de Servicio"> 3% por Años de Servicio<br>

    <div class="button-container">
        <input type="submit" value="Registrar">
        <button type="reset">Cancelar</button>

        <?php if (!empty($mensaje)): ?>
            <span><?php echo $mensaje; ?></span>
            <?php if ($mensaje === "Empleado registrado exitosamente."): ?>
                <a href="ver_nomina.php">
                    <button type="button">Ver Tabla de Nómina</button>
                </a>
            <?php endif; ?>
        <?php endif; ?>
    </div>
</form>

</body>
</html>
