package exam01;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Book[] library1 = new Book[5];
        Book[] library2 = new Book[5];
        library1[0] = new Book("태백산맥", "조정래");
        library1[1] = new Book("데미안", "헤르만 헤세");
        library1[2] = new Book("어떻게 살 것인가", "유시민");
        library1[3] = new Book("토지", "박경리");
        library1[4] = new Book("어린왕자", "생텍쥐페리");
        System.arraycopy(library1,0,library2,0,5);
        for(int i = 0; i<library2.length; i++){
            library2[i].showBookInfo();
        }

    }
}
