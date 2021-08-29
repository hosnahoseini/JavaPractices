package com.company;

import java.util.ArrayList;
import java.util.Date;

/**
 * A class for Pharmacy doctor
 */
public class PharmacyDoctor extends Doctor{

    public PharmacyDoctor(String name,
                          Date birthDate,
                          String gender,
                          String education,
                          String address,
                          String geographicalLocation,
                          ArrayList<MedicalHistory> medicalHistories) {
        super();
    }

    /**
     * give medicine to a patient
     * @param patient patient
     */
    public void giveMedicineToPatient(Patient patient){}

    /**
     * search for medical history
     * @param patient patient
     * @return medical history
     */
    public MedicalHistory searchByPatient(Patient patient){}
}
