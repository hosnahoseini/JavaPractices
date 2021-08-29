package com.company;

import java.util.ArrayList;

/**
 * A class for keep hospital info(health care system)
 */
public class HealthCareSystem {
    private ArrayList<University> universities;
    private ArrayList<Doctor> doctors;
    private ArrayList<MedicalHistory> medicalHistories;

    public HealthCareSystem(ArrayList<University> universities,
                            ArrayList<Doctor> doctors,
                            ArrayList<MedicalHistory> medicalHistories) {}

    /**
     * give a special history to a university
     * @param medicalHistory medical history
     * @param university university
     */
    public void giveHistoryToUniversity(MedicalHistory medicalHistory, University university){}

    /**
     * getter for doctors
     * @return doctors
     */
    public ArrayList<Doctor> getDoctors() {}

    /**
     * add a medical history
     * @param medicalHistory a medical history
     */
    public void addMedicalHistory(MedicalHistory medicalHistory){}

    //public void updateMedicalHistories(){}
}
