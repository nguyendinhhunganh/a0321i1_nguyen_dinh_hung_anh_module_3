package bean;

import java.util.Arrays;

public class Employee extends Person {
    private int employeeCode;
    private String academicLevel;
    private String position;
    private float salary;

    public Employee() {
    }

    public Employee(int employeeCode, String academicLevel, String position, float salary) {
        this.employeeCode = employeeCode;
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, String dateOfBirth, String sex, String identityCardNumber, String telephoneNumber, String email, int employeeCode, String academicLevel, String position, float salary) {
        super(name, dateOfBirth, sex, identityCardNumber, telephoneNumber, email);
        this.employeeCode = employeeCode;
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, String dateOfBirth, String sex, String identityCardNumber, String telephoneNumber, String email) {
        super(name, dateOfBirth, sex, identityCardNumber, telephoneNumber, email);
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode=" + employeeCode +
                ", academicLevel='" + academicLevel + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
