package com.company;

import java.util.ArrayList;
import java.util.Date;

/**
 * A class for Therapist Doctor
 */
public class TherapistDoctor extends Doctor{

    public TherapistDoctor(String name,
                           Date birthDate,
                           String gender,
                           String education,
                           String address,
                           String geographicalLocation,
                           ArrayList<MedicalHistory> medicalHistories) {
        super();
    }

    /**
     * make a new medical history
     * @param patient patient
     * @param healthCareSystem health Care System
     * @return medical history
     */
    public MedicalHistory makeAMedicalHistory(Patient patient, HealthCareSystem healthCareSystem){}

    /**
     * send patient to a new doctor
     * @param patient patient
     * @param newDoctor new doctor
     */
    public void sendPatientToAnotherDoctor(Patient patient, TherapistDoctor newDoctor){}

    /**
     * edit a medical history
     * @param medicalHistory medical history
     */
    public void editMedicalHistory(MedicalHistory medicalHistory){}

}
