package com.gla.inheritance;

public class Author extends Book {
    private String authorName;
    private String bio;

    public Author(String title, int publicationYear,
                  String authorName, String bio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  // show book info
        System.out.println("Author: " + authorName);
        System.out.println("Bio: " + bio);
    }
}
