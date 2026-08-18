package day1;

public class Operators {
    public static void main(String[] args) {
//        Arithmetic Operators
//        int a =20 , b=10;
//        System.out.println("The addition of a and b is "+(a+b));  //30
//        System.out.println("The substract of a and b is "+(a-b));  //10
//        System.out.println("The multiplication of a and b is "+(a*b));  //200
//        System.out.println("The division of a and b is "+(a/b));  //2
//        System.out.println("The remainder of a divided by b is "+(a%b));  //0
//        // Relational/Comparison Operators

//        System.out.println(a>b);   //True
//        System.out.println(a>=b);  //True
//        System.out.println(a<b);   //False
//        System.out.println(a<=b);  //False
//        System.out.println(a==b);  //False
//        System.out.println(a!=b);  //True
        //        Logical operators      &&      ||      !
//        boolean x=true , y=false;
//        System.out.println(x&&y);    //false
//        System.out.println(x||y);   // true
//        System.out.println(!x);     //false
//        System.out.println(!y);     //true
//        int a = 10;
//        int b = a--;
//        System.out.println(a); //9
//        System.out.println(b); //10
        //        int a = 10;
//        a+=5;       //a=a+5  15
//        a-=5;       //a=a-5  10
//        a*=5;       //a=a*5  50
//        a/=5;       //a=a/5  10
//        a%=5;       //a=a%5  0
//        System.out.println(a);
        int age = 12;
//        var = exp ? true : false
        String status =age>18?"Eligible":"Not Eligible";
        System.out.println(status);
//

        if(age>18){
            status = "Eligible";
        }
        else {
            status = "Not Eligible";
        }
    }
}