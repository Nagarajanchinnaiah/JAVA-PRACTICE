class student  {
    int id;
    String name;
    int fees;
 
    student() {
        id = 111;
        name = "Full stack developer";
        fees = 35000;
    }
 
    student(int i, String n, int f) {
        id = i;
        name = n;
        fees = f;
    }
 
    student(int i, String n) {
        id = i;
        name = n;
        fees = 20000;
    }
 
    void display() {
        System.out.println("ID : " + id + " Name : " + name + " Fees : " + fees);
    }
 
    public static void main(String[] args) {
        student S1 = new student(); 
        S1.display();
        student S2 = new student(222, "Design developer", 50000); 
        S2.display();
        student S3 = new student(333, "Java developer");
        S3.display();
    }
}