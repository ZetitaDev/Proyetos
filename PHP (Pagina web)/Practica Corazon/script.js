const textoAmor = document.getElementById("amor");
const modalAmor = document.getElementById("modalAmor");
const cerrarAmor = document.getElementById("cerrarAmor");

const textoToler = document.getElementById("toler");
const modalToler = document.getElementById("modalToler");
const cerrarToler = document.getElementById("cerrarToler");

const textoComp = document.getElementById("comp");
const modalComp = document.getElementById("modalComp");
const cerrarComp = document.getElementById("cerrarComp");

const textoPaz = document.getElementById("paz");
const modalPaz = document.getElementById("modalPaz");
const cerrarPaz = document.getElementById("cerrarPaz");

const textoSolid = document.getElementById("solid");
const modalSolid = document.getElementById("modalSolid");
const cerrarSolid = document.getElementById("cerrarSolid");

textoAmor.addEventListener("click", function() {
    modalAmor.style.display = "flex"
});

textoToler.addEventListener("click", function() {
    modalToler.style.display = "flex"
});

textoComp.addEventListener("click", function() {
    modalComp.style.display = "flex"
});

textoPaz.addEventListener("click", function() {
    modalPaz.style.display = "flex"
});

textoSolid.addEventListener("click", function() {
    modalSolid.style.display = "flex"
});

cerrarAmor.addEventListener("click", function() {
    modalAmor.style.display = "none";
});

cerrarToler.addEventListener("click", function() {
    modalToler.style.display = "none";
});

cerrarComp.addEventListener("click", function() {
    modalComp.style.display = "none";
});

cerrarPaz.addEventListener("click", function() {
    modalPaz.style.display = "none";
});

cerrarSolid.addEventListener("click", function() {
    modalSolid.style.display = "none";
});