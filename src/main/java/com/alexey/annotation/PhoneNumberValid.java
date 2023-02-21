package com.alexey.annotation;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValid implements ConstraintValidator<PhoneNumber, String> {
    private String phoneNumberPattern;
    public void initialize(PhoneNumber constraint) {
        this.phoneNumberPattern = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";
    }
    public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {
        Pattern pattern = Pattern.compile(phoneNumberPattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
