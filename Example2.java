class Employee{
    int salary=200000;
}
 
class Programmer extends Employee{
    int bonus=10000;
}
 
public class Example2{
    public static void main(String[] args) {
        Programmer P=new Programmer();
        System.out.println(P.salary+P.bonus);
        System.out.println(P.bonus);
    }
}