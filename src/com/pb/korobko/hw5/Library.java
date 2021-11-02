package com.pb.korobko.hw5;

public class Library {
    public static void main(String[] args) {
        Book[] book = new Book[5];
        book[0] = new Book("Приключения", "Иванов А.А.", 1970);
        book[1] = new Book("Детектив", "Петров А.А.", 1989);
        book[2] = new Book("Боевик","Сидоров А.А.", 1999);
        book[3] = new Book("Роман", "Кундиренко А.А.", 2005);
        book[4] = new Book("Фельетон", "Билоус А.А.", 2018);

        for (int i = 0; i < book.length; i++){
            System.out.println(book[i].getBook());
        }

        Reader[] reader = new Reader[5];
        reader[0] = new Reader("Кравченко А.М.", 101, "химико-технологический", "01.01.2001", "+380965021423");
        reader[1] = new Reader("Лончук В.В.", 102, "физ-мат", "02.02.1998", "+380678986630");
        reader[2] = new Reader("Максютенко Р.Ю.", 109, "исторический", "03.03.1999", "+380963032154");
        reader[3] = new Reader("Жабенко И.В.", 133, "юридический", "04.04.2000", "+38936654787");
        reader[4] = new Reader("Меркушин А.В.", 110, "инжинерный.", "05.05.2001", "+380676778932");

        for (int i = 0; i < reader.length; i++){
            System.out.println(reader[i].getReader());
        }

        reader[0].takeBook(3);
        reader[1].takeBook("Приключения", "Боевик", "Роман");
        reader[2].takeBook(book[2], book[4]);

        reader[0].returnBook(3);
        reader[1].returnBook("Приключения", "Боевик", "Роман");
        reader[2].returnBook(book[2], book[4]);

    }

}