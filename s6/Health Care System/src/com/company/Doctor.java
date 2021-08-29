package com.company;

import java.util.ArrayList;
import java.util.Date;

/**
 * A class for all doctors
 */
public class Doctor extends Human{

    private ArrayList<MedicalHistory> medicalHistories;


    public Doctor(String name,
                  Date birthDate,
                  String gender,
                  String education,
                  String address,
                  String geographicalLocation,
                  ArrayList<MedicalHistory> medicalHistories) {
        super();
    }

    /**
     * add a medical history
     * @param medicalHistory a medical history
     */
    public void addMedicalHistory(MedicalHistory medicalHistory){}
}
