const URL_API = "http://localhost:8080/mascotas";
let update_data = {
    update: false,
    id: null
}

function get_data_from(evt) {
    //Indicar por medio del evento que no recargue pagina
    evt.preventDefault();
    const from = evt.target;
    const mascota = {
        nombre: from.nombre.value,
        apellido: from.apellido.value,
        tipo_mascota: from.tipo_mascota.value,
        raza: from.raza.value,
        edad: from.edad.value,
        observacion: from.observacion.value
    }
    if (update_data.update) {
        mascota.id = update_data.id;
        update(mascota);
    } else {
        create(mascota);
    }
    clear(from);
}

async function create(mascota) {
    //Enviar peticion
    const resp = await fetch(URL_API, {
        method: "POST",
        headers: {
            'Content-type': 'application/json'
        },
        body: JSON.stringify(mascota)
    });

    const text = await resp.text();
    alert(text);
}

async function update(mascota) {
    //Enviar peticion
    const resp = await fetch(URL_API, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(mascota)
    });
    const text = await resp.text();
    alert(text);
    window.location.href = "index.html";
}

function clear(from) {
    from.nombre.value = "";
    from.apellido.value = "";
    from.tipo_mascota.value = "";
    from.raza.value = "";
    from.edad.value = "";
    from.observacion.value = "";

}

function set_from(from, mascota) {
    from.nombre.value = mascota.nombre;
    from.apellido.value = mascota.apellido;
    from.tipo_mascota.value = mascota.tipo_mascota;
    from.raza.value = mascota.raza;
    from.edad.value = mascota.edad;
    from.observacion.value = mascota.observacion;

}
//Actualizar por medio de parametros de la url
function get_params() {
    const search = window.location.search;
    const url = new URLSearchParams(search);
    const param_mascota = url.get("mascota");
    if (param_mascota) {
        const mascota = JSON.parse(param_mascota);
        const from = document.getElementById("from");
        set_from(from, mascota);
        update_data.update = true;
        update_data.id = mascota.id;
        document.getElementById("btn-from").innerText = "Actualizar";
        document.getElementById("link-create").innerText = "Actualizar Mascota";
    }
}

get_params();