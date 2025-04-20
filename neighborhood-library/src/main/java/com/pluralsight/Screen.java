package com.pluralsight;

import java.util.Scanner;

public class Screen {
   private books[] inventory = new books[20];

    public Screen() {
        inventory[0] = new books(1, "978-0-123456-01-0", "The Great Gatsby");
        inventory[1] = new books(2, "978-0-123456-02-1", "To Kill a Mockingbird");
        inventory[2] = new books(3, "978-0-123456-03-2", "1984");
        inventory[3] = new books(4, "978-0-123456-04-3", "Dance of Dragons");
        inventory[4] = new books(5, "978-0-123456-05-4", "The Hobbit");
        inventory[5] = new books(6, "978-0-123456-06-5", "The Catcher in the Rye");
        inventory[6] = new books(7, "978-0-123456-07-6", "Song of Fire");
        inventory[7] = new books(8, "978-0-123456-08-7", "Brave New World");
        inventory[8] = new books(9, "978-0-123456-09-8", "Jane Eyre");
        inventory[9] = new books(10, "978-0-123456-10-9", "The Odyssey");
        inventory[10] = new books(11, "978-0-123456-11-0", "Game of Thrones");
        inventory[11] = new books(12, "978-0-123456-12-1", "Brave Heart");
        inventory[12] = new books(13, "978-0-123456-13-2", "Hamlet");
        inventory[13] = new books(14, "978-0-123456-14-3", "Crime and Punishment");
        inventory[14] = new books(15, "978-0-123456-15-4", "The Brothers Karamazov");
        inventory[15] = new books(16, "978-0-123456-16-5", "Don Quixote");
        inventory[16] = new books(17, "978-0-123456-17-6", "War and Peace");
        inventory[17] = new books(18, "978-0-123456-18-7", "Anna Karenina");
        inventory[18] = new books(19, "978-0-123456-19-8", "The Divine Comedy");
        inventory[19] = new books(20, "978-0-123456-20-9", "İçimizdeki Şeytan");
    }
    public void showAvailableBooks() {
        System.out.println("Available Books:");
        for (books book : inventory) {
            if (book != null && (book.getCheckedOutTo() == null || book.getCheckedOutTo().isEmpty())) {
                System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle());
            }
        }
    }

    public void promptCheckOut() {
    }

    public void promptCheckIn() {
    }

    public static class screen {
        private books[] inventory = new books[20];

        public screen() {
            //
            inventory[0] = new books(1, "978-0-123456-01-0", "The Great Gatsby");
            //
            inventory[19] = new books(20, "978-0-123456-20-9", "Les Misérables");
        }

        public void showAvailableBooks() {
            System.out.println("Available Books:");
            for (books book : inventory) {
                if (!Boolean.parseBoolean(book.getCheckedOutTo())) {
                    System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle());
                }
            }
        }

        public void promptCheckIn() {
            Scanner scanner = new Scanner(System.in);

            showAvailableBooks();  // Müsait kitapları göster

            System.out.print("Enter the ID of the book you want to check out: ");
            int selectedId = scanner.nextInt();
            scanner.nextLine(); // Buffer temizle

            books selectedBook = null;
            for (books book : inventory) {
                if (book.getId() == selectedId && (book.getCheckedOutTo() == null || book.getCheckedOutTo().isEmpty())) {
                    selectedBook = book;
        }
    }

}

    }
}
