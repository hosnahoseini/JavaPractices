package com.company;

import java.util.ArrayList;
import java.util.Date;

/**
 * A class for medical history
 */
public class MedicalHistory {

    private String generalTypOfDisease;
    private String historyOfDisease;
    private ArrayList<TherapistDoctor> doctor;
    private String levelOfSecurity;
    private String diagnosis;
    private String prescription;
    private Date date;

    public MedicalHistory(String generalTypOfDisease,
                          String historyOfDisease,
                          ArrayList<TherapistDoctor> doctor,
                          String levelOfSecurity,
                          String diagnosis,
                          String prescription,
                          Date date) {}

    /**
     * give access to a new human
     * @param human new human
     */
    public void addAccessToHuman(Human human){}

    /**
     * check if this history is related to a special disease or not
     * @return true if it is a special disease
     */
    public boolean isItSpecialDisease(){}

    /**
     * getter for type of disease
     * @return type of disease
     */
    public String getGeneralTypOfDisease() {}

    //setters
    public void setGeneralTypOfDisease(String generalTypOfDisease) {}

    public void setHistoryOfDisease(String historyOfDisease) {}

    public void setDoctor(ArrayList<TherapistDoctor> doctor) {}

    public void setLevelOfSecurity(String levelOfSecurity) {}

    public void setDiagnosis(String diagnosis) {}

    public void setPrescription(String prescription) {}

    public void setDate(Date date) {}
}
