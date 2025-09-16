package com.mycompany.librarymanagementsystem;
public class Librarian extends User{
    public void add_book(Book b)
    {
        books.add(b);
        b.isAvailable=true;
    }
    public void remove_book(Book b)
    {
        books.remove(b);
        b.isAvailable=false;
    }

    public Librarian() {
    }
    
    
    
    
}
