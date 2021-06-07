package com.metanit;

public class Main {
        public static void main(String[]args){
            Patient num1 = new Patient("Ivan", "Ivanov", "Ivanovich", "12.05.1995", "Lenina Street", "23078", "Appendicitis");
            Patient num2 = new Patient("Petr", "Petrov", "Petrovich", "13.06.1967", "Kalinovskogo Street", "23079", "Stomach Ulcer");
            Patient num3 = new Patient("Vladislav", "Vladimirovich", "Semenov", "10.07.1986", "Kizhevatova Street", "23080", "Hernia");
            Patient num4 = new Patient("Konstantin", "Petrovich", "Sokolov", "04.09.1979", "Lermontova Street", "23081", "Asthma" );
            Patient num5 = new Patient("Vladimir", "Sergeevich", "Popov", "03.04.1978", "Bogdanovicha Street", "23082", "Bronchitis");
            PatientList newList=new PatientList();
            newList.addPatient(num1);
            newList.addPatient(num2);
            newList.addPatient(num3);
            newList.addPatient(num4);
            newList.addPatient(num5);
            newList.diagnosisPrint("Asthma");
            newList.diagnosisPrint("Appendicitis");




        }
    }

