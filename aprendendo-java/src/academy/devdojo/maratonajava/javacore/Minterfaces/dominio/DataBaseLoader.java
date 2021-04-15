package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando Banco de Dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo Banco de Dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }


    public static void retrieveMaxDataSize(){
        System.out.println("Dentro de retrieveMaxDataSize DataBaseLoader ");
    }
}
