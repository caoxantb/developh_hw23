package hw7;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

@SuppressWarnings("all")
public final class HW7 {
    static String JSON_FILE = "hw7.json";
    static int maxDirectingCount = 0;
    static String highestDirector = "";

    public static void execute(JSONArray films) {
        ArrayList<Object> vietnameseFilm = new ArrayList<>();
        HashMap<Object, Integer> directors = new HashMap<>();
        int watchedFilms = 0;

        for (Object film : films) {
            JSONObject f = (JSONObject) film;
            if (f.get("country").equals("Vietnam"))
                vietnameseFilm.add(f.get("name"));

            Object dirr = f.get("director");
            if (directors.containsKey(dirr)) {
                int count = (int) directors.get(dirr);
                directors.put(dirr, count + 1);
            }
            else directors.put(dirr, 1);

            if ((boolean) f.get("watchedStatus"))
                watchedFilms++;
        }

        directors.forEach((dirr, count) -> {
            if (count > maxDirectingCount) {
                maxDirectingCount = count;
                highestDirector = (String) dirr;
            }
        });

        System.out.println(vietnameseFilm);
        System.out.println(highestDirector);
        System.out.println(watchedFilms);
    }

    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(JSON_FILE));
            JSONArray data = (JSONArray) obj;

            execute(data);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}