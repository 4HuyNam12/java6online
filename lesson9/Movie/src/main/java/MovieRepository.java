import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class MovieRepository {
    public ArrayList<Movie> getData() {
        ArrayList<Movie> listMovie = new ArrayList<>();
        try {
            Gson gson = new Gson();
            FileReader reader = new FileReader("movie.json");
            Type objectType = new TypeToken<ArrayList<Movie>>(){}.getType();
            listMovie = gson.fromJson(reader,objectType);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return listMovie;
    }

    public void printList(ArrayList<Movie> list) {
        for (Movie m: list) {
            System.out.println(m);
            
        }
    }
}
