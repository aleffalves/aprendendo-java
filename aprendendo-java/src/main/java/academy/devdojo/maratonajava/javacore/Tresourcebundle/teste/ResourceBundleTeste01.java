package academy.devdojo.maratonajava.javacore.Tresourcebundle.teste;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages",new Locale("en","US"));
        System.out.println(bundle.getString("Hello"));
        System.out.println(bundle.getString("Good"));
        ResourceBundle bundleBR = ResourceBundle.getBundle("messages",new Locale("pt","BR"));
        System.out.println(bundleBR.getString("Hello"));
        System.out.println(bundleBR.getString("Good"));
        System.out.println(bundle.getString("hi"));
        System.out.println(bundleBR.getString("hi"));


    }
}
