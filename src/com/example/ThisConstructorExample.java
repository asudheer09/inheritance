package com.example;

class Book{

    private int bookId;
    private String author;
    private double price;
    private String publisher;

    public Book(int bookId, String author, double price) {
        this.bookId = bookId;
        this.author = author;
        this.price = price;
    }

    public Book(String author, double price, String publisher) {
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public Book(int bookId, String author, double price, String publisher) {
        this.bookId = bookId;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public Book(){
        this("java",123.45,"oracle");
        System.out.println("default constructor");
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}


public class ThisConstructorExample {
    public static void main(String[] args) {
       Book b= new Book();
        System.out.println(b);
    }
}
