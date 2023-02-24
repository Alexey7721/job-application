package com.alexey;

import com.alexey.annotation.PhoneNumber;

import javax.validation.constraints.*;

public class Employee {
    @Size(max = 30, message = "Name longer than 30 characters")
    @NotBlank(message = "The name does not match the format")
    private String name;
    @Size(max = 30, message = "Surname longer than 30 characters")
    @NotBlank(message = "The name does not match the format")
    private String surname;
    @Min(value = 18, message = "The specified age is less than the minimum")
    @Max(value = 100, message = "The specified age is greater than the maximum")
    private int age;
    @Email(message = "Email is incorrect")
    @NotBlank(message = "The name does not match the format")
    private String email;
    @PhoneNumber
    private String phoneNumber;
    @Min(value = 500, message = "Salary must been greater 500$")
    @Max(value = 5000, message = "Salary must been smaller 5000$")
    private int salary;
    private String department;
    private String experience;
    @NotBlank(message = "The gender does not match the format")
    private String gender;
    private String[] languages;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

}
