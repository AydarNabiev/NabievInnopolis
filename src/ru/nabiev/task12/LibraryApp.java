package ru.nabiev.task12;

import java.io.*;

public class LibraryApp {
    private static final String fileName = "Library.bin";

    public static void main(String[] args) throws Exception {
        Library library = loadLibrary();
        //Library library = new Library(); //строчка для первого заведения библиотеки
        System.out.println("Был:");
        library.listBooks();
        Book catcherInRye = new Book("Над пропастью во ржи", "Джером Д. Сэлинджер", 1951);
        library.addBook(catcherInRye);
        Book solaris = new Book("Солярис", "Станислав Лем", 1961);
        library.addBook(solaris);
        Book hobbit = new Book("Хоббит, или Туда и обратно", "Джон Р.Р. Толкин", 1937);
        library.addBook(hobbit);

        saveLibrary(library);

        Library libraryLoad = loadLibrary();
        System.out.println("Стал:");
        libraryLoad.listBooks();

    }

    private static Library loadLibrary() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(fileName)
        )) {
            return (Library) ois.readObject();
        }
    }

    private static void saveLibrary(Library library) {
        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(fileName)
        )) {
            oos.writeObject(library);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
