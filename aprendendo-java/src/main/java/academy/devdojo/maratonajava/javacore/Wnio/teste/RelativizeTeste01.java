package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTeste01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/aleff");
        Path clas = Paths.get("/home/aleff/devdojoacademy/OlaMundo.java");
        Path relativize = dir.relativize(clas);
        System.out.println(relativize);

        Path absoluto1 = Paths.get("/home/aleff");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/aleff/devdojoacademy/OlaMundo.java");
        Path relative = Paths.get("temp");
        Path relative2 = Paths.get("temp/temp.2021921");

        System.out.println("1 " + absoluto1.relativize(absoluto3));
        System.out.println("2 " + absoluto3.relativize(absoluto1));
        System.out.println("3 " + absoluto1.relativize(absoluto2));
        System.out.println("4 " + relative.relativize(relative2));
        //System.out.println("5 " + relative2.relativize(relative));
    }
}
