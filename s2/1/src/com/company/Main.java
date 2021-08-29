package com.company;
/**
 *the Main class run the program it add some labs, students, and a faculty and then show them
 *
 * @author Hosna
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        //make students
        Student std1 = new Student("Ehsan", "Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        std1.setGrade(15);
        std2.setGrade(11);

        //making a lab array consist of two lab
        Lab[] labs = new Lab[2];
        labs[0] = new Lab(30, "Sunday");
        labs[1] = new Lab(10, "Friday");
        labs[0].enrollStudent(std1);
        labs[0].enrollStudent(std2);
        labs[1].enrollStudent(std3);

        //we can also make each lab as a single obj and enroll them one by one into the faculty. for example:
        /*Lab lab1 = new Lab(30, "Monday");
        Lab lab2 = new Lab(10, "Friday");
        Faculty fac = new Faculty("ceit", 40);
        fac.enrollLab(lab1);
        fac.enrollLab(lab2);*/


        //making faculty and set labs
        Faculty fac = new Faculty("ceit", 40);
        fac.setLabs(labs);

        //print
        fac.print();

    }
}
