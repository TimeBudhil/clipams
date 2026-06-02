package com.pams;

import com.pams.service.PatientService;

public class Main {
    public static void main(String[] args) {
        PatientService service = PatientService.getPatientService();
        System.out.println(service.PatientsToJSONLong());
        System.out.println(service.PatientsByAgeLong());
    }
}