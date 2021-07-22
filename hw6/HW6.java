package hw6;

import java.util.Map;
import java.util.HashMap;

public final class HW6 {
    private HW6() {
        //
    }

    public static Map<String, String> makePlaylist(String[] songs, String[] artists) {
        Map<String, String> playlist = new HashMap<>();
        for (int i = 0; i < songs.length; i++) {
            playlist.put(songs[i], artists[i]);
        }

        return playlist;
    }
}
