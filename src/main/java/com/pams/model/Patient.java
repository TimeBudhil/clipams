package com.pams.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Patient{
    private int patientID;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Address mailingAddress;
    private String dob;

    
    public Patient(int patientID, String firstName, String lastName, String phone, String email, Address mailingAddress,
            String dob) {
        this.patientID = patientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.mailingAddress = mailingAddress;
        this.dob = dob;
    }

    
    public int getPatientID() {
        return patientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Address getMailingAddress() {
        return mailingAddress;
    }

    public String getDob() {
        return dob;
    }
    
    
    public int getAge() {
        LocalDate birthDate = LocalDate.parse(dob, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    /**hashcode and equals */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + patientID;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((mailingAddress == null) ? 0 : mailingAddress.hashCode());
        result = prime * result + ((dob == null) ? 0 : dob.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Patient other = (Patient) obj;
        if (patientID != other.patientID)
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (phone == null) {
            if (other.phone != null)
                return false;
        } else if (!phone.equals(other.phone))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (mailingAddress == null) {
            if (other.mailingAddress != null)
                return false;
        } else if (!mailingAddress.equals(other.mailingAddress))
            return false;
        if (dob == null) {
            if (other.dob != null)
                return false;
        } else if (!dob.equals(other.dob))
            return false;
        return true;
    }

    public String toJson() {
        return String.format(
            "{"
                + "\t\"patientID\":%d,"
                + "\t\"firstName\":\"%s\","
                + "\t\"lastName\":\"%s\","
                + "\t\"phone\":\"%s\","
                + "\t\"email\":\"%s\","
                + "\t\"mailingAddress\":%s,"
                + "\t\"dob\":\"%s\","
                + "\t\"age\":\"%s\""
            + "}",
            patientID,
            firstName,
            lastName,
            phone,
            email,
            mailingAddress != null ? mailingAddress.toJson() : "null",
            dob,
            getAge()
        );
    }
    public String toJsonLong() {
        return String.format(
            "{\n"
                + "\t\"patientID\":%d,\n"
                + "\t\"firstName\":\"%s\",\n"
                + "\t\"lastName\":\"%s\",\n"
                + "\t\"phone\":\"%s\",\n"
                + "\t\"email\":\"%s\",\n"
                + "\t\"mailingAddress\":%s,\n"
                + "\t\"dob\":\"%s\",\n"
                + "\t\"age\":\"%s\"\n"
            + "}",
            patientID,
            firstName,
            lastName,
            phone,
            email,
            mailingAddress != null ? mailingAddress.toJson() : "null",
            dob,
            getAge()
        );
    }


}
