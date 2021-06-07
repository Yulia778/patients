package com.metanit;

import java.util.Objects;

public class Patient {
    private String name;
    private String surname;
    private String middleName;
    private String dateOfBirth;
    private String address;
    private String numberOfCard;
    private String diagnosis;

    public Patient(String name, String middleName, String surname, String dateOfBirth, String address, String numberOfCard, String diagnosis) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.numberOfCard = numberOfCard;
        this.diagnosis = diagnosis;
    }
public Patient(){

}
    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfCard(String numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAddress() {
        return address;
    }

    public String getNumberOfCard() {
        return numberOfCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", numberOfCard='" + numberOfCard + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return name.equals(patient.name) && surname.equals(patient.surname) && middleName.equals(patient.middleName) && dateOfBirth.equals(patient.dateOfBirth) && address.equals(patient.address) && numberOfCard.equals(patient.numberOfCard) && diagnosis.equals(patient.diagnosis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, middleName, dateOfBirth, address, numberOfCard, diagnosis);
    }
}



