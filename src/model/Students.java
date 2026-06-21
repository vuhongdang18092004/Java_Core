package model;

public class Students extends Users {
    private String studentId;
    private double gpa;

    public Students() {
        super();
    }

    public Students(
            String id,
            String name,
            int age,
            String email,
            String phone,
            String address,
            String studentId,
            double gpa
    ) {
        super(id, name, age, email, phone, address);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Info:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Email: " + getEmail());
        System.out.println("Student ID: " + studentId);
        System.out.println("GPA: " + gpa);
    }
}