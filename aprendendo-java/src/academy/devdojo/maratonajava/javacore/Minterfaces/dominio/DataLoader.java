package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 0;
    public abstract void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissoões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro de retrieveMaxDataSize DataLoader ");
    }
}
