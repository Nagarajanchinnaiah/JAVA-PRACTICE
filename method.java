public class method {
 
    static void myStaticMethod() {
        System.out.println("I am Static Method");
    }
 
    public void myPublicMethod() {
        System.out.println("I am Public Method");
    }
 
    public static void main(String[] args) {
        myStaticMethod();
        method answer = new method();
        answer.myPublicMethod();
    }
 
}