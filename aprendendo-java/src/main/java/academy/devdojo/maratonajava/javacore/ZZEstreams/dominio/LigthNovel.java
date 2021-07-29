package academy.devdojo.maratonajava.javacore.ZZEstreams.dominio;

public class LigthNovel {
    private String title;
    private double price;
    private Category category;

    public LigthNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public LigthNovel(String title, double price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return title + " | preço: "
               + price + " " +
                "categoria: " + category
                ;
    }

    public Category getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
