package exam01;

public class Ex01 {
    public static void main(String[] args) {

        int result = add2((num1, num2)-> {
                return num1+num2;
        },10,20);
         /*
           @Override
           public int add(int num1, int num2) {
               return num1+num2;
           }

       };
       int result = add2(cal,10,20);
       System.out.println(result);
   }*/

        System.out.println(result);

    }
    public static int add2 (Calculator cal,int num1, int num2){

        return cal.add(num1, num2);
    }
}


