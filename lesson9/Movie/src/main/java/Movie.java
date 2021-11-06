
public class Movie {
    int id;
    String title;
    String category;
    int length;
    String publishsingCompany;
    int releaseYear;

    public Movie(int id, String title, String category, int length, String publishsingCompany, int releaseYear) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.length = length;
        this.publishsingCompany = publishsingCompany;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", length=" + length +"m"+
                ", publishsingCompany='" + publishsingCompany + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
