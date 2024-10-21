package exam02;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String[] value();//기본설정 항목
    int max()default 10;
    int min()default 1;
}
