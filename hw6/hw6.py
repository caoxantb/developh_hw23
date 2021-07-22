def make_playlist(songs, artists):
    playlist = {}
    for i in range(len(songs)):
        playlist[songs[i]] = artists[i]
    
    return playlist

print(make_playlist(["Tầng Thượng 102", "Đốt", "Cho Tôi Đi Theo"], ["CHH", "Ngọt", "Ngọt"]))
        