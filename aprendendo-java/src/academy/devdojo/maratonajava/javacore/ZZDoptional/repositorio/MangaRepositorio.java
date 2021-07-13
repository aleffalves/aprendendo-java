package academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepositorio {
    private static List<Manga> list = List.of(
            new Manga(1,"Naruto", 550),
            new Manga(2,"DragonBall",350));

    private static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;
        for(Manga manga : list){
            if (predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }

    public static Optional<Manga> finById(Integer id){
        return findBy(i -> i.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title){
        return findBy(t -> t.getTitle().equals(title));
    }
}
