package ru.nabiev.task13;

//import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Copying {
    public static void main(String[] args) throws IOException {
        //File file = new File("utf8.txt");
        try (OutputStream os = new FileOutputStream("utf8.txt")) {
            String string = "Приветствую";
            os.write(string.getBytes());
        }

        try (OutputStream os = new FileOutputStream("koi8.txt")) {
            String string2 = new String(Files.readAllBytes(Paths.get("utf8.txt")));
            os.write(string2.getBytes(Charset.forName("KOI8")));
        }
    }
}