package com.pams.repository;

import java.util.List;

import com.pams.db.*;
import com.pams.model.Patient;

//comment
public class PatientRepo {
    private static PatientRepo instance;
    private final db database;
    private PatientRepo(){
        this.database = db.getInstance();
    }

    public static PatientRepo getPatientInstance(){
        if(instance == null){
            instance = new PatientRepo();
        }
        return instance;
    }

    public void save(Patient patient) {
        database.getPatients().add(patient);
    }

    public void remove(Patient patient) {
        database.getPatients().remove(patient);
    }

    public void removebyID(int id) {
        database.getPatients().remove(id);
    }

    public List<Patient> findAll() {
        return database.getPatients();
    }

}
