package com.pb.korobko.hw5;

public class Book {
    private  final String title;
    private  final String author;
    private  final int publish;

    public Book(String title, String author, int publish) {
        this.title = title;
        this.author = author;
        this.publish = publish;
    }

    String getBook() {
        return "название книги: " + title + ", автор: " + author + ", год издания: "+ publish;
    }

    String getBook_take() {
        return title + " (" + author + " "+ publish + " г.)";
    }

    String getBook_return() {
        return title + " (" + author + " "+ publish + " г.)";
    }

}