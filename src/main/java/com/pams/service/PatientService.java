package com.pams.service;

import java.util.Comparator;
import java.util.List;

import com.pams.model.Patient;
import com.pams.repository.PatientRepo;

public class PatientService {
    private static PatientService instance;
    private PatientRepo repo;

    private PatientService(){
        this.repo = PatientRepo.getPatientInstance();
    }

    public static PatientService getPatientService(){
        if(instance == null){
            instance = new PatientService();
        }
        return instance;
    }

    public String PatientsToJSON(){
        String result = "{\n";
        for(Patient p : repo.findAll()){
            result += "\t";
            result += p.toJson();
            result += ",\n";
        }
        result += "}";

        return result;
    }

    public String PatientsToJSONLong(){
        String result = "{\n";
        for(Patient p : repo.findAll()){
            result += "\t";
            result += p.toJsonLong();
            result += ",\n";
        }
        result += "}";

        return result;
    }
    
    public String PatientsByAge(){
        List<Patient> list = repo.findAll().stream().sorted((p1, p2) -> p1.getDob().compareTo(p2.getDob())).toList();
        
        String result = "{\n";
        for(Patient p : list){
            result += p.toJson();
            result += ",\n";
        }
        result += "}";

        return result;
    }
    public String PatientsByAgeLong(){
        List<Patient> list = repo.findAll().stream().sorted((p1, p2) -> p1.getDob().compareTo(p2.getDob())).toList();
        
        String result = "{\n";
        for(Patient p : list){
            result += p.toJsonLong();
            result += ",\n";
        }
        result += "}";

        return result;
    }


}
