package exam01;

import java.util.List;
import java.util.stream.Stream;

public class Ex04 {
    public static void main(String[] args) {
        List<String> items2=List.of("항목1","항목1","항목1","항목2","항목3","항목4","항목5") ;
        Stream<String> stm=items2.stream().distinct().map(s->String.format("**%s**",s));
        List<String> cItems2=stm.toList();

        System.out.println(cItems2);
    }
}
