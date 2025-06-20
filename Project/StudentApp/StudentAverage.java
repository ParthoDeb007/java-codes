package StudentApp;
public class StudentAverage {
    
    private int total_courses;
    private double total_credit;
    private double total_credit_completed;
    private String course;
    private String semester;
    private char grade;
    private double sum,cgpa;

    public void setTotal_Courses(int total_courses) {
        this.total_courses = total_courses;
    }
    public int getTotal_Courses() {
        return total_courses;
    }
    public void setTotal_Credit(double total_credit) {
        this.total_credit = total_credit;
    }
    public double getTotal_Credit() {
        return total_credit;
    }
    public void setTotal_Credit_Completed(double total_credit_completed) {
        this.total_credit_completed = total_credit_completed;
    }
    public double getTotal_Credit_Completed() {
        return total_credit_completed;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getCourse() {
        return course;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }
    public String getSemester() {
        return semester;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }
    public char getGrade() {
        return grade;
    }
    public void setSum(double sum) {
        this.sum = sum;
    }
    public double getSum() {
        return sum;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void calculateCgpa() {
        if (total_credit_completed > 0) {
            cgpa = (sum / (total_courses*4))*4;
        } else {
            cgpa = 0.0;
        }
    }

    public void ShowResult() {
        System.out.println("Total Courses: " + total_courses);
        System.out.println("Total Credits: " + total_credit);
        System.out.println("Total Credits Completed: " + total_credit_completed);
        System.out.println("CGPA: " + cgpa);
    }

}
