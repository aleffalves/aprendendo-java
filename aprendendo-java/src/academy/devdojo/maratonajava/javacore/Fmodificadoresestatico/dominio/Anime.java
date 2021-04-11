package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 Bloco de inicializacao é executado quando a JVM carregar  a classe
    // 1 Alocado espaco em memoria do objeto
    // 2 Cada atriburo de classe é criado e inicializado com valores defalt ou o quer for passado
    // 3 O bloco de inicialização é executado
    // 4 Construtor é executado


    static {
        System.out.println("dentro do bloco 1 ");
        episodios = new int [100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;
        }
    }
    static {
        System.out.println("dentro do bloco 2");
    }
    static {
        System.out.println("dentro do bloco 3");
    }
    {
        System.out.println("bloco não estatiico");
    }

    public Anime(String nome) {
        this.nome = nome;
    }


    public Anime() {
        episodios = new int [100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;
        }


        for (int episodio: this.episodios){
            System.out.print(episodio + " ");
        }

        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
