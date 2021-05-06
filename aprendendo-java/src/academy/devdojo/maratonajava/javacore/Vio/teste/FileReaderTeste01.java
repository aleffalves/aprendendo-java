package academy.devdojo.maratonajava.javacore.Vio.teste;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)) {
            int i;
            while ((i=fr.read()) != -1){
                System.out.print((char)i);
            }
           // char[] c = new char[1];
          //  fr.read(c);
           // for (char in : c);
           // System.out.println(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
