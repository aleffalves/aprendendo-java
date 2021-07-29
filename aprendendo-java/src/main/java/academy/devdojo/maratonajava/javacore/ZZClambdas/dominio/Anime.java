package academy.devdojo.maratonajava.javacore.ZZClambdas.dominio;

public class Anime {
    private String title;
    private int espisodes;

    public Anime(String title, int espisodes) {
        this.title = title;
        this.espisodes = espisodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", quantity=" + espisodes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getEspisodes() {
        return espisodes;
    }
}
