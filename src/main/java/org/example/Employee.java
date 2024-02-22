package org.example;

public class Employee {
    private String name;
    private String post;
    private String email;
    private long phone;
    private int salary;
    private int age;


    public Employee(String name, String post, String email, long phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println(String.format("Сотрудник - %s (должность - %s, возраст - %s лет). %nДанные сотрудника: телефон - %s, e-mail - %s, зарплата - %s руб.%n", name, post, age, phone, email, salary));
    }
}
