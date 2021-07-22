import json

try:
    with open('hw7.json') as f:
        data = json.load(f)
except ValueError as e:
    print("Decoding JSON has failed")


def execute(films):
    vietnamese_film = []
    directors = {}
    max_directing_count = 0
    watched_films = 0

    for film in films:
        if film["country"] == "Vietnam": vietnamese_film.append(film["name"])

        dirr = film["director"]
        if dirr in directors: directors[dirr] += 1
        else: directors[dirr] = 1

        if film["watchedStatus"]: watched_films += 1

    for dirr in directors:
        if directors[dirr] > max_directing_count:
            max_directing_count = directors[dirr]
            highest_director = dirr

    print(vietnamese_film)
    print(highest_director)
    print(watched_films)

if __name__ == "__main__":
    execute(data)