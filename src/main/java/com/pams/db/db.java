package com.pams.db;

import java.util.ArrayList;
import java.util.List;
import com.pams.model.*;


public class db {
    private static db instance;

    private final List<Patient> patients;

    private db() {
        patients = new ArrayList<>();
        populateList();
    }

    public static db getInstance() {
        if (instance == null) {
            instance = new db();
        }
        return instance;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void populateList(){
        Address d = new Address("1 N Street");
        Address m = new Address("4 East Ave");
        Address ma = new Address("30 W Burlington");
        Patient daniel = new Patient(1, "Daniel", "Agar", "(641) 123-0009", "dagar@m.as", d, "1987-01-19");
        Patient ana = new Patient(2, "Ana", "Smith", null, "amsith@te.edu@m.as", null, "1948-12-05");
        Patient marcus = new Patient(3, "Marcus", "Garvey", "(123) 292-0018", null, m, "2001-09-18");
        Patient Jeff = new Patient(4, "Jeff", "Goldbloom", "(999) 165-1192", "jgold@es.co.za", null, "1995-02-28");
        Patient Mary = new Patient(5, "Mary", "Washington", null, null,ma, "1932-05-31");

        //add all of them!
        patients.add(daniel);
        patients.add(ana);
        patients.add(marcus);
        patients.add(Jeff);
        patients.add(Mary);
    }
}