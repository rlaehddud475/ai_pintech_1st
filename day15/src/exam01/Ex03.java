package exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<String> items=new LinkedList<>();
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

        Iterator<String> iter=items.iterator();
        while (iter.hasNext()){
            String item = iter.next();
            System.out.println(item);
        }
        iter=items.iterator();
        while (iter.hasNext()){
            String item = iter.next();
            System.out.println(item);
        }
    }
}