class Student2 {
 
    int id;
    String name;
 
    Student2() {
        id = 1;
        name = "invincible mikey";
    }
 
    void display() {
        System.out.println("ID : " + id + " Name : " + name);
    }
 
    public static void main(String args[]) {
        Student2 S1 = new Student2();
        S1.display();
       
    }
}