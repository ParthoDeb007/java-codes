package StudentApp;
public class Student {
    public String name="";
    public String email="";
    private String id="";
    public  String password="";
    public String phoneNumber="";
    public String dept="";
    public String batch="";

    public Student(String name, String email, String id, String password, String phoneNumber, String dept, String batch) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.dept = dept;
        this.batch = batch;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getDept() {
        return dept;
    }
    public String getBatch() {
        return batch;
    }

    public void ShowInformation(){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("ID: " + id);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Department: " + dept);
        System.out.println("Batch: " + batch);
    }

    
}
