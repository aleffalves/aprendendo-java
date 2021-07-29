package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFilesAttributesTeste01 {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributes, DosFilesAttributes, PosixFileAttributes
        File file = new File("folder/novo.txt");
        LocalDateTime data = LocalDateTime.now().minusDays(10);
        boolean isCreated = file.createNewFile();
        file.setLastModified(data.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("folder/novo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(data.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));


    }
}
