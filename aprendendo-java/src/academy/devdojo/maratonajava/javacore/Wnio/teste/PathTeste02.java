package academy.devdojo.maratonajava.javacore.Wnio.teste;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTeste02 {
    public static void main(String[] args) throws IOException {
        Path folderDois = Paths.get("folder2");
        if (Files.notExists(folderDois)){
        Path folderDirectory = Files.createDirectory(folderDois);
        }
        Path subFolderPath = Paths.get("folder2/subfolder/subsubfolder");
        Path subFolderDirectory = Files.createDirectories(subFolderPath);

        Path fileAtFolder = Paths.get(folderDois.toString(),"subfolder/file.txt");
        if(Files.notExists(fileAtFolder)) {
            Path fileFolderCreated = Files.createFile(fileAtFolder);
        }

        Path source = fileAtFolder;
        Path target = Paths.get(fileAtFolder.getParent().toString(),"file_rename.txt");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
    }


}

