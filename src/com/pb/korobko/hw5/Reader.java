package com.pb.korobko.hw5;

import sun.util.calendar.BaseCalendar;

public class Reader {
    private final String name;
    private final int number;
    private final String faculty;
    private final String birthday;
    private final String phone;

    public Reader(String name, int number, String faculty, String birthday, String phone) {
        this.name = name;
        this.number = number;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }

    String getReader() {
        return "ФИО читателя: " + name + ", номер читательского билета: " + number +
                ", факультет: " + faculty + ", дата рождения: " + birthday +
                ", телефон: " + phone;
    }

    public void takeBook(int num){
        System.out.println();
        System.out.print(name + " взял " + num + " книги");
    }

    public void takeBook(String ... title ){
        System.out.println();
        System.out.print(name + " взял книги: ");
        for(int i = 0; i < title.length; i++) {
            System.out.print(title[i] + " ");
        }
    }

    public void takeBook(Book ... book ){
        System.out.println();
        System.out.print(name + "  взял книги: ");
        for(int i = 0; i < book.length; i++) {
            System.out.print(book[i].getBook_take() + " ");
        }
    }

    public void returnBook(int num){
        System.out.println();
        System.out.print(name + " вернул " + num + " книги");
    }

    public void returnBook(String ... title ){
        System.out.println();
        System.out.print(name + " вернул книги: ");
        for(int i = 0; i < title.length; i++) {
            System.out.print(title[i] + " ");
        }
    }

    public void returnBook(Book ... book ){
        System.out.println();
        System.out.print(name + "  вернул книги: ");
        for(int i = 0; i < book.length; i++) {
            System.out.print(book[i].getBook_return() + " ");
        }
    }

}