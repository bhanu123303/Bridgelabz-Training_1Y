package com.gla.inheritance;

public class LibraryDemo {
    public static void main(String[] args) {
        Author bookWithAuthor = new Author(
                "Clean Code",
                2008,
                "Robert C. Martin",
                "Software engineer and author known as 'Uncle Bob'."
        );

        bookWithAuthor.displayInfo();
    }
}
