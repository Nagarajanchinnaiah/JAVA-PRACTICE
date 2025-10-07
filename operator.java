//ARITHMETIC OPERATOR 
//They work with all numeric data types such as int, float, double, long, and more. Java arithmetic operators are commonly used in calculations, loops, conditions, and data processing. Each operator takes two values (operands) and returns a result.
// class operator{
//     public static void main(String[]args){
//          int num1=10;
//          int num2=2;
//          int answer=num1+num2 ;
//         //  int answer=num1-num2;
//         //  int answer=num1*num2;
//         //  int answer=num1%num2;
//         //  int answer=num1/num2;
//          System.out.println(answer);
//          System.out.println(num1+num2);
//     }
// }
//---------------------------------------------------------------------------------------------------------
//ASSIGNMENT OPERATOR
//Java assignment operators are used to assign values to variables. These operators modify the value of a variable based on the operation performed. The most commonly used assignment operator is =, but Java provides multiple compound assignment operators for shorthand operations. The following table lists the assignment operators in Java:
// Ass.Opr - +=,-=,*=,%=,/=
class operator{
    public static void main(String[]args){
         int num1=10;
        int num2=2;
        num1+=num2;
        // num1-=num2;
        // num1*=num2;
        // num1%=num2;
        // num1/=num2;    
        System.out.println(num1);
    }
}