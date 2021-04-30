package chap07;

import java.util.Arrays;

class Book implements Comparable{
    int price;

    Book(int price) {
        this.price = price;
    }

    void print() {
        System.out.println("Book [price="+price+"]");
    }

    @Override
    public int compareTo(Object o) {
        Book book = (Book) o;

        if(this.price < book.price)
            return -1;
        else if (this.price > book.price)
            return 1;
        else
            return 0;
    }
}

public class Three {
    public static void main(String[] args) {
        Book[] books = {new Book(15000),new Book(50000),new Book(20000)};

        System.out.println("정렬 전");
        for (Book b : books)
            b.print();

        Arrays.sort(books);

        System.out.println("정렬 후");
        for (Book b : books)
            b.print();
    }
}
