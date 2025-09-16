package com.mycompany.librarymanagementsystem;
public class Book {
    protected int id ;
    protected String title ;
    protected String author ;
    protected boolean isAvailable ;

    public Book(int id, String title, String author, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    

    
}
