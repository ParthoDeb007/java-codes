//4.5
public class Student2 {
    
    public String name;
    public int roll;
    private String phone;
    private String email;

    public Student2(String name, int roll, String phone, String email) {
        this.name = name;
        this.roll = roll;
        this.phone = phone;
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public int getRoll() {
        return roll;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    void displayInformation(){
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
    }
}
