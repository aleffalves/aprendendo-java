package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFilesAttributesTeste02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("creation Time " + creationTime);
        System.out.println("last Modified " + lastModifiedTime);
        System.out.println("last Access Time " + lastAccessTime);

        System.out.println("-------");

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime fileTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime,fileTime,creationTime);


        creationTime      = fileAttributeView.readAttributes().creationTime();
         lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
         lastAccessTime   = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("creation Time " + creationTime);
        System.out.println("last Modified " + lastModifiedTime);
        System.out.println("last Access Time " + lastAccessTime);



    }
}
