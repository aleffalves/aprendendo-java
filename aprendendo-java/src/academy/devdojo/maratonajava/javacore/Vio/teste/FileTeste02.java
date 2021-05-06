package academy.devdojo.maratonajava.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;

public class FileTeste02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("folder");
        boolean isDiretorio = fileDiretorio.mkdir();
        System.out.println(isDiretorio);
        File arquivoDiretorio = new File(fileDiretorio,"arquivo.txt");
        boolean isCreatedNewFile = arquivoDiretorio.createNewFile();
        System.out.println(isCreatedNewFile);
        File fileRename = new File(fileDiretorio,"arquivo-renomeado.txt");
        boolean isRenameDiretorio = arquivoDiretorio.renameTo(fileRename);
        System.out.println(isRenameDiretorio);


    }
}
