public class main {
 
    String Name = "Nagarajan C";
    int Age = 22;
    String Email = "naga@gmail.com";
 
    public static void main(String args[]) {
        main answer = new main();
        System.out.println(answer.Name);
        System.out.println(answer.Age);
        System.out.println(answer.Email);
 
        main answer1 = new main();
        answer1.Name = "mikey";
        System.out.println(answer1.Name);
        answer1.Age = 21;
        System.out.println(answer1.Age);
        answer1.Email = "mikey@gmail.com";
        System.out.println(answer1.Email);
    }
}