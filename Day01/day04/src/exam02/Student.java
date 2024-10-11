package exam02;

public class Student {
    int id;
    String name;
    String major;
    /*
    *  따로 정의하지 않으면 기본적으로 생산되는 생성자
    * 자동으로 생성 된다
    */
    public Student(){
        //객체 생성 이후 실행
        // 객체의 변수의 초기화
        id=1000;
        name="이이름";
        major="영어";
    }//defalut 생성자, 따로 정의 안해도 컴파일러가 추가함
    public void showInfo(){
        System.out.printf("id=%d, name=%s, major=%s%n",id,name,major);
    }
}
