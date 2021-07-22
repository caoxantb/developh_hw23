function makePlaylist(songs, artists) {
    const playlist = {};
    for (let i = 0; i < songs.length; i++) {
        playlist[songs[i]] = artists[i];
    }

    return playlist;
}
