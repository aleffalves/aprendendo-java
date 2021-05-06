package academy.devdojo.maratonajava.javacore.Vio.teste;
// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file,true)) {
            fw.write("Dev Dojo Academy, o melhor curso do Brasil!\n Pulando a linha\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
