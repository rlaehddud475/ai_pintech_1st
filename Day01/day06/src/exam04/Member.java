package exam04;

import javax.xml.namespace.QName;
import java.util.stream.Stream;

public class Member extends Vip{
    private int point;
    private String id;
    private String name;

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Member() {
    }

    public Member(String id, String name, int point){
        this.id=id;
        this.name=name;
        this.point=point;
    }
    public void Draw(){
        System.out.println(id+ name +point);
    }

    @Override
    public String toString() {
        return "Member[id="+id+","+"name="+name+","+"point="+point+"]";
    }
}
