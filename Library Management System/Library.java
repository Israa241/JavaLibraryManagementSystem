package com.mycompany.librarymanagementsystem;

import java.util.ArrayList;

public class Library {
    protected ArrayList<Book> Books;
    protected ArrayList<User> Users ;

    public void all_books()
    {
        for(int i =0;i<Books.size();i++)
        {
            System.out.println("Book = "+ Books[i] + books[i].isAvailable);
        }
    }
    public void all_users()
    {
        for(int i =0;i<Books.size();i++)
        {
            System.out.println("User = "+ Users[i] + Users[i].borrowedBooks);
        }
    }

    public public Library(ArrayList<Book> Books, ArrayList<User> Users) {
        this.Books = Books;
        this.Users = Users;
    }
    
}
