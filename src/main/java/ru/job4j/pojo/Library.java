package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book warAndPeace = new Book("War and peace", 1286);
        Book whatToDo = new Book("What to do", 317);
        Book inTheForrest = new Book("In the forrest", 102);
        Book howToEarnAMillion = new Book("How to earn a million", 254);

        Book[] books = new Book[4];
        books[0] = warAndPeace;
        books[1] = whatToDo;
        books[2] = inTheForrest;
        books[3] = howToEarnAMillion;

        Book cleanCod = new Book("Clean code", 321);
        books[2] = cleanCod;

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getAmountOfPages() + " pages");
        }

        Book temperary = books[0];
        books[0] = books[3];
        books[3] = temperary;

        System.out.println(System.lineSeparator() + "After changes: ");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getAmountOfPages() + " pages");
        }

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(System.lineSeparator() + i + ". " + "Clean code");
            }
        }
    }
}
