// class statement{
//     public static void main(String[]args){
//         int a=1000;
//         int b=4000;
//         int c=2000;
//         if(a>b && a>c){
//             System.out.println("A is Biggest Value");
//         }
//         else if(b>a && b>c){
//             System.out.println("B is Biggest Value");
//         }
//         else if(c>a && c>b){
//             System.out.println("C is Biggest Value");
//         }
//         else{
//             System.out.println("A, B, C - Same Value");
//         }

//     }
// }
//------------------------------------------------------------------------------------------------------
//POSITIVE OR NEGATIVE 
// class statement
// {
//     public static void main(String[]args)
//     {
//         int a = 0;
//         if (a > 0) {
//             System.out.println("+Ve");
//         } else if (a < 0) {
//             System.out.println("-Ve");
//         }
//         else {
//             System.out.println("Zero");
//         }
        
//     }
// }
//---------------------------------------------------------------------------------------------------
//MARKS 
// class statement{
//     public static void main(String[]args){
//          int mark = 80;
//         if (mark >= 35) {
//             System.out.println("Student - Pass");
//         } else {
//             System.out.println("Student - Fail");
//         }
//     }
// }
//---------------------------------------------------------------------------------------------------
//BIGGEST VALUE AMONG TWO NUMBERS 
// class statement{
//     public static void main(String[]args){
//         int a=100;
//         int b=20;
//         if(a>b){
//             System.out.println("A is Biggest Value");
//         }
//         else{
//             System.out.println("B is Biggest Value");
//         }

//     }
// }
//--------------------------------------------------------------------------------------------------
//LEAP YEAR OR NOT 
// class statement{
//     public static void main(String[]args){
//         int year=2000;
//         if(year%4==0){
//             System.out.println("Leap Year");
//         }
//         else{
//             System.out.println("Not Leap Year");
//         }

//     }
// }
//--------------------------------------------------------------------------------------------------
//VOWELS OR CONSONANT
// class statement
// {
//     public static void main(String[]args){
//        char check='A';
//         if(check=='A' || check=='E' || check=='I' || check=='O' || check=='U' ||
//         check=='a' || check=='e' || check=='i' || check=='o' || check=='u'){
//             System.out.println("VL");
//         }
//         else{
//             System.out.println("NVL");
//         }
//     }
// }
//-----------------------------------------------------------------------------------------------------
//DIVISIBLE 
// class statement{
//     public static void main (String[]args){
//         int num=9;
//         if(num%2==0 && num%5==0){
//             System.out.println("Answer - Correct");
//         }
//         else{
//             System.out.println("Answer - InCorrect");
//         }

//     }
// }
//------------------------------------------------------------------------------------------------------
//GREATEST VALUE AMONG 3 NUMBERS
class statement{
    public static void main(string[]args){
         int a = 50;
        int b = 80;
        int c = 20;
 
        if (a > b) {
            if (a > c) {
                System.out.println("A is Biggest Value");
            } else {
                System.out.println("C is Biggest Value");
            }
        } else {
            if (b > c) {
                System.out.println("B is Biggest Value");
            } else {
                System.out.println("C is Biggest Value ");
            }
        }
    }
}
 
 

    