package exam01;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Study {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (x, y)->x.intValue()+y.intValue();

        ToIntFunction<Integer> add2=x->x+x;
    }
}
