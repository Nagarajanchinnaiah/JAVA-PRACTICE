class Student1 {

    int id;
    String name;

    Student1(int i, String n) {
        id = i;
        name = n;
    }
 
    void display() {
        System.out.println("Id : " + id + " Name : " + name);
    }
 
    public static void main(String[] args) {
        Student1 S1 = new Student1(1, "Nagarajan");
        S1.display();
        Student1 S2=new Student1(2, "Monkey d luffy ");
        S2.display();
    }
 
}