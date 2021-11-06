import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    MovieRepository repo = new MovieRepository();
        ArrayList<Movie> listMovie = repo.getData();
        repo.printList(listMovie);
    }
}
