package com.mycompany.librarymanagementsystem;

import java.util.ArrayList;

public class User extends Library{
    protected int id ;
    protected String name ;
    protected ArrayList<String> borrowedBooks ;
    
    public void Borrow_a_Book(Book b)
    {
        if(b.isAvailable)
        {
            b.isAvailable = false;
            Books.remove(b);
        }
        else
        {
            System.out.println("The Book Is Unavailable");
        }
    }
    public void Return_a_Book(Book b){
        Books.add(b);
        b.isAvailable=true;
    }

    public public User(int id, String name, ArrayList<String> borrowedBooks, ArrayList<Book> Books, ArrayList<User> Users) {
        super(Books, Users);
        this.id = id;
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }
    
    
}
