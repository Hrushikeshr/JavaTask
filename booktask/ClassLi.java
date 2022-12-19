package booktask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ClassLi {
    List<Book> bookList = new ArrayList<>();

    public ClassLi() {
		addBook(new Book("test","test","test",19,20));
		addBook(new Book("rishi","Test1","Test1",29,30));
		addBook(new Book("hrushi","Test1","Test1",29,30));
	}
    public static void main(String[] args) {
        ClassLi cl = new ClassLi();
        cl.bookDetails();
    }


    public void bookDetails(){
        Iterator<Book> itr = bookList.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        Iterator<Book> itr2 = bookList.listIterator();
        while (itr2.hasNext()){
            Book book = itr2.next();

            if (book.getBookTitle().equals("rishi")){
               itr2.remove();
            }
        }

        for (Book b1: bookList){
            System.out.println(b1);
        }




    }
    public void addBook(Book book) {
        bookList.add(book);

    }
}
