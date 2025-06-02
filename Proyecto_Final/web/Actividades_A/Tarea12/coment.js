function agregarComentario() {
    const comentario = document.getElementById("comentario").value;
    if (comentario.trim() !== "") {
        // Agregar al DOM
        const lista = document.getElementById("listaComentarios");
        const nuevoComentario = document.createElement("div");
        nuevoComentario.className = "comentario";
        nuevoComentario.textContent = comentario;
        lista.appendChild(nuevoComentario);

        // Guardar en Local Storage
        let comentarios = JSON.parse(localStorage.getItem("comentarios")) || [];
        comentarios.push(comentario);
        localStorage.setItem("comentarios", JSON.stringify(comentarios));

        document.getElementById("comentario").value = "";
    }
}

// Cargar comentarios al inicio
window.onload = function () {
    const comentarios = JSON.parse(localStorage.getItem("comentarios")) || [];
    const lista = document.getElementById("listaComentarios");
    comentarios.forEach(comentario => {
        const nuevoComentario = document.createElement("div");
        nuevoComentario.className = "comentario";
        nuevoComentario.textContent = comentario;
        lista.appendChild(nuevoComentario);
    });
};
