class Student3 {

    private String name;
    private int id;
 
    public void setName(String n) {
        name = n;
    }
 
    public void setId(int i) {
        id = i;
    }
 
    public String getName() {
        return name;
    }
 
    public int getId() {
        return id;
    }
 
    public static void main(String[] args) {
        Student3 S1 = new Student3();
        S1.setName("Hinata tachibana");
        System.out.println("Student Name : " + S1.getName());
        S1.setId(101);
        System.out.println("Stdent ID : " + S1.getId());
    }
 
}