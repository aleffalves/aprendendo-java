package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 Alocao espaco em memoria do objeto
    // 2 Cada atriburo de classe é criado e inicializado com valores defalt ou o quer for passado
    // 3 O bloco de inicialização é executado
    // 4 Construtor é executado


    {
        System.out.println("dentro do bloco");
        episodios = new int [100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;
        }


        for (int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
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
