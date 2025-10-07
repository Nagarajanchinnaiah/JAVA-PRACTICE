// import java.util.Scanner;
// class arguments{
//     static void display(){
//         System.out.println("full stack developer");

//     }
//     public static void main(String[]args){
//         display();
//     }
// }


//WITH ARGUMENTS ND WITH RETURN TYPE
// import java.util.Scanner;
// class arguments{
//     static int add(int a, int b, int c, int d, int e){
//         return a+b+c+d+e;
//     }
//     public static void main(String[]args){
//         System.out.println(add(90,70,100,100,100));
//     }
// }


//WITHOUT ARGUMENTS AND WITH RETURN TYPE
// import java.util.Scanner;
// class arguments {
//       static int add(){
//         int a=4000;
//         int b=1345;
//         return a+b;
//      }
//      public static void main(String[]args){
//         System.out.println(add());
//      }
// }


//WITHOUT PARAMETER AND WITHOUT RETURN TYPE
// import java.util.Scanner;
// class arguments{
//     static void add(){
//         int a=1010;
//         int b=550;
//         System.out.println(a+b);
//     }
 
//      static void sub(){
//         int a=1000;
//         int b=545;
//         System.out.println(a-b);
//     }
//      static void mul(){
//         int a=10;
//         int b=98;
//         System.out.println(a*b);
//     }
//     public static void main(String[]args){
//         add();
//         sub();
//         mul();

//     }
// }


//WITH PARAMETER WITHOUT RETURN TYPE
import java.util.Scanner;
class arguments{
    static void add(int a, int b, int c, int d, int e){
        System.out.println(a+b+c+d+e);
        System.out.println((a+b+c+d+e)/5);
     }
     public static void main(String[]args){
        add(80,90,88,100,100);
     }
}