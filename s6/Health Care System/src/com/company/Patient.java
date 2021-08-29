package com.company;

import java.util.ArrayList;
import java.util.Date;

/**
 * A class for patient
 */
public class Patient extends Human{
    private String job;
    private String typeOfBasicInsurance;
    private String typeOfSupplementaryInsurance;
    private ArrayList<MedicalHistory> medicalHistory;
    private boolean permission = false;

    public Patient(String name,
                   Date birthDate,
                   String gender,
                   String education,
                   String address,
                   String geographicalLocation,
                   String job,
                   String typeOfBasicInsurance,
                   String typeOfSupplementaryInsurance,
                   ArrayList<MedicalHistory> medicalHistory) {
        super();
    }

    /**
     * choose first doctor
     * @param doctor doctor
     */
    public void chooseDoctor(Doctor doctor){}

    /**
     * give permission for his/her medical history to be accessible
     */
    public void givePermissionForMedicalHistory(){}

    /**
     * getter for a medical history
     * @param index index of medical history
     * @return medical history
     */
    public MedicalHistory getMedicalHistory(int index) {}

    /**
     * add a medical history
     * @param medicalHistory a medical history
     */
    public void addMedicalHistory(MedicalHistory medicalHistory) { }
}
