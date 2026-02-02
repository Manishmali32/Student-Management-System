package com.student.model;

public class Student {

    private int rollNo;
    private String name;
    private String city;
    private String mobile;
    private int age;
    private String email;

    public Student() {}

    public Student(int rollNo, String name, String city,
                   String mobile, int age, String email) {
        this.rollNo = rollNo;
        this.name = name;
        this.city = city;
        this.mobile = mobile;
        this.age = age;
        this.email = email;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
