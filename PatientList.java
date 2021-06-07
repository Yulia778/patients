package com.metanit;

import java.util.ArrayList;
import java.util.List;

public class PatientList {

    private List<Patient> patientList = new ArrayList<>();

    public void addPatient(Patient num1) {
        patientList.add(num1);


    }

    public void diagnosisPrint(String diagnosis) {
        System.out.println("Patient list " + diagnosis);
        for (Patient st : patientList) {
            if (st.getDiagnosis().equals(diagnosis)) {
                System.out.println(st.toString());
            }
        }
    }






    }

