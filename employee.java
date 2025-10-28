public class employee {
 
    private int id;
    private String name;
 
    public void setDetails(int i, String n) {
        id = i;
        name = n;
    }
 
    public void getDetails() {
        System.out.println("ID : " + id + " Name : " + name);
    }
 
    public static void main(String[] args) {
        employee E1 = new employee();
        E1.setDetails(1, "Baji");
        E1.getDetails();
    }
 
}