package exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex04 {
    public static void main(String[] args) {
        Set<Book> items=new TreeSet<>();
        items.add(new Book("저자1",1000,"출판사1","책1"));
        items.add(new Book("저자2",1001,"출판사2","책2"));
        items.add(new Book("저자3",1002,"출판사3","책3"));
        items.add(new Book("저자4",1003,"출판사4","책4"));
        items.add(new Book("저자5",1000,"출판사5","책5"));
        items.forEach(System.out::println);
    }
}
