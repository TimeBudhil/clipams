package com.pams.PAMSApp;

import com.pams.service.PatientService;

public class PAMSApp {
    public static void main(String[] args) {
        PatientService service = PatientService.getPatientService();
        System.out.println(service.PatientsToJSONLong());
        System.out.println(service.PatientsByAgeLong());
    }
}
