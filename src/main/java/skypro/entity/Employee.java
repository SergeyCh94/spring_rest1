package skypro.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "department")
    private String department;

    @Column(name = "name")
    private String name;

    @Column(name = "selary")
    private double selary;

    public Employee(int id, String name, String department, double selary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.selary = selary;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return selary;
    }

    public void setSalary(double salary) {
        this.selary = salary;
    }
}
