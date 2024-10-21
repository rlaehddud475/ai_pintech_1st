package exam02;

@MyAnno(value = {"여기는 클래스","여기는 Student 클래스"}, max = 100,min = 10)
public class Student {
    @MyAnno(value ={"여기는 메서드","여기는 study메서드"})
    public void study(){
        
    }
}
