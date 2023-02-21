package com.alexey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class SendEmail {

    private final MailSender mailSender;
    @Autowired
    public SendEmail(MailSender mailSender) {
        this.mailSender = mailSender;
    }
    public void mailSend(Employee employee) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("Your profile");
        simpleMailMessage.setText(
                "Employee " +
                        "\nName: " + employee.getName() +
                        "\nSurname: " + employee.getSurname() +
                        "\nAge: " + employee.getAge() +
                        "\nEmail: " + employee.getEmail() +
                        "\nPhoneNumber: " + employee.getPhoneNumber() +
                        "\nSalary: " + employee.getSalary() +
                        "\nDepartment: " + employee.getDepartment() +
                        "\nExperience: " + employee.getExperience() +
                        "\nGender: " + employee.getGender() +
                        "\nLanguages: " + Arrays.toString(employee.getLanguages()));
        simpleMailMessage.setFrom("asatrov446@gmail.com");
        simpleMailMessage.setTo(employee.getEmail());
        mailSender.send(simpleMailMessage);
    }
}
