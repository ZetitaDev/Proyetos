function actualizarDificultad() {
    const contrasena = document.getElementById('contrasena').value;
    const nivelDificultad = document.getElementById('nivelDificultad');
    let dificultad = 'Baja';

    if (contrasena.length > 0) {
        const lengthCriteria = contrasena.length >= 8;
        const upperCaseCriteria = /[A-Z]/.test(contrasena);
        const lowerCaseCriteria = /[a-z]/.test(contrasena);
        const numberCriteria = /\d/.test(contrasena);
        const specialCharCriteria = /[!@#$%^&*(),.?":{}|<>]/.test(contrasena);

        const criteriaMet = [lengthCriteria, upperCaseCriteria, lowerCaseCriteria, numberCriteria, specialCharCriteria].filter(Boolean).length;

        if (criteriaMet >= 4) {
            dificultad = 'Alta';
        } else if (criteriaMet >= 2) {
            dificultad = 'Media';
        }

        nivelDificultad.textContent = 'Nivel de Dificultad: ' + dificultad;
        nivelDificultad.style.display = 'block';
    } else {
        nivelDificultad.style.display = 'none';
    }
}

function mostrarModal() {
    const modal = document.getElementById('modalRegistro');
    modal.style.display = 'block';
}

function cerrarModal() {
    const modal = document.getElementById('modalRegistro');
    modal.style.display = 'none';
}
