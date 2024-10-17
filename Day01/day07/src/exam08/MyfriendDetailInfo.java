package exam08;

public class MyfriendDetailInfo extends MyfriendInfo{
    String admin;
    String phone;

    public MyfriendDetailInfo(int age, String name) {
        super(age, name);
    }

    public MyfriendDetailInfo(int age, String name, String admin, String phone) {
        super(age, name);
        this.admin = admin;
        this.phone = phone;
    }
    public void showInfo(){
        System.out.printf("이름=%s, 나이=%d, 주소=%s, 전화번호=%s%n",name,age,admin,phone);
    }
}
