const fetchJSON = async () => {
    try {
        const res = await fetch("hw7.json");
        const data = await res.json();
        execute(data);
    }
    catch (e) {
        e.printStackTrace();
    }
}

function execute(films) {
    const vietnameseFilm = [];
    const directors = {};
    let maxDirectingCount = 0;
    let highestDirector = "";
    let watchedFilms = 0;

    for (let film of films) {
        if (film.country === "Vietnam") 
            vietnameseFilm.push(film.name);

        //initiate {} directors - key: dir_name, value: dir_count
        let dirr = film.director;
        if (dirr in directors) directors[dirr]++; // {"Wim Wenders": 1, "Tony Bui": 1, ...., "Tran Anh Hung": 2, "Bong": 1}
        else directors[dirr] = 1;

        if (film.watchedStatus) watchedFilms++;
    }

    //{"Wim Wenders": 1, "Tony Bui": 1, ...., "Tran Anh Hung": 2, "Bong": 1}
    for (let dirr in directors) {
        if (directors[dirr] > maxDirectingCount) {
            maxDirectingCount = directors[dirr];
            highestDirector = dirr;
        }
    }

    console.log(vietnameseFilm);
    console.log(highestDirector);
    console.log(watchedFilms);
}

fetchJSON();
