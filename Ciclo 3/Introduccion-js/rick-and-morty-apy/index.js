async function get_chatacters(url_api) {
    // fetch(url_api){
    //     method: 'GET', 'POST', 'PUT', 'DELETE'
    // }
    //Enviar peticion Get
    const resp = await fetch(url_api, {
        method: 'GET'
    });
    //Obtener datos 
    const data = await resp.json();
    return data.results;
}

function show_characters(characters) {
    let cards = '';
    //Iterar arreglo
    for (let i = 0; i < characters.length; i++) {
        cards += `<article class="cards">
            <img src="${characters[i].image}" alt="imagen">
            <div class="body-card">
                <h2>${characters[i].name}</h2>
                <span>
                    <b>Specie: ${characters[i].species} </b> 
                </span>
                <span>
                    <b>Status: ${characters[i].status}</b> 
                </span>
                <span>
                    <b>Gender: ${characters[i].gender}</b>    
                </span>
                <span>
                    <b>Origin: ${characters[i].origin.name}  </b>
                </span>
            </div>
        </article>`;
    }
    document.getElementById('section-cards').innerHTML = cards;
}

async function main() {
    const url = "https://rickandmortyapi.com/api/character";
    const characters = await get_chatacters(url);
    show_characters(characters);
}

main();