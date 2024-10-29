package exam01;

import jdk.incubator.vector.VectorOperators;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Book {
    private String title;

   public void test ( ){
       Consumer<String> opr=(s)->setTitle(s);
       Consumer<String> opr2=this::setTitle;
   }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
