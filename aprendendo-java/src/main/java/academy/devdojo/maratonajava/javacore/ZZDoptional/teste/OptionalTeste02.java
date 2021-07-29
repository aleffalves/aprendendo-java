package academy.devdojo.maratonajava.javacore.ZZDoptional.teste;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepositorio;

import java.util.Optional;

public class OptionalTeste02 {
    public static void main(String[] args) {
        Optional<Manga> byTitle = MangaRepositorio.findByTitle("Naruto");
        byTitle.ifPresent(manga -> manga.setTitle("Naruto Shippuden"));
        System.out.println(byTitle);

        Manga mangaById = MangaRepositorio.finById(2).orElseThrow(IllegalAccessError::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepositorio.findByTitle("One Piece")
                .orElse(new Manga(3, "One Piece", 947));
        System.out.println(newManga);
    }
}
