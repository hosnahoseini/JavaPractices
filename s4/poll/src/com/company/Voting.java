package com.company;

import ir.huri.jcal.JalaliCalendar;
import java.util.*;

/**
 * A class to represent a voting for an specific title
 *
 * @author Hosna Oyarhoseini
 * @version 2021.April.5
 */

public class Voting {
    private int type;       //1->single choice  others->multiply choice
    private String question;
    private ArrayList<Person> voters;
    private HashMap<String, HashSet<Vote>> polls;
    //the key of this hash map contains all the possible choices and the value keep name of the voter and date of voting

    /**
     * constructor for initializing an instance of voting
     *
     * @param type     tupe of voting(single or multiply choices
     * @param question question of voting
     */
    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
        voters = new ArrayList<>();
        polls = new HashMap<>();
    }

    /**
     * add a new choice to voting
     *
     * @param choice new choice
     */
    public void createChoice(String choice) {
        if (!polls.keySet().contains(choice)) {
            polls.put(choice, new HashSet<>());
        } else
            System.out.println("choice already exists!");
    }

    /**
     * vote in a specific voting
     *
     * @param person        person who is voting
     * @param personChoices choices to which he/she want to vote
     */
    public void vote(Person person, ArrayList<String> personChoices) {
        if (type == 1 && personChoices.size() > 1) {
            System.out.println("You have only one choice!");
            return;
        } else {
            voters.add(person);
            String date = new JalaliCalendar(new GregorianCalendar()).toString();
            for (String choice : personChoices) {
                polls.get(choice).add(new Vote(person, date));
            }
        }
        System.out.println("Your vote submitted!");
    }

    /**
     * print result of voting
     */
    public void printResult() {
        String winner = "";
        int maxVote = 0;
        for (String choice : polls.keySet()) {
            System.out.println(choice + " : " + polls.get(choice).size());
            if (polls.get(choice).size() >= maxVote) {
                maxVote = polls.get(choice).size();
                winner = choice;
            }
            for (Vote vote : polls.get(choice)) {
                vote.print();
            }
        }
        System.out.println("Winner: " + winner);
        System.out.println("------------------------------------------");
    }

    /**
     * check if the person has already voted or not
     *
     * @param person person info
     * @return tru if its repeated or false if its new
     */
    public boolean repeatedPerson(Person person) {
        for (Person voter : voters) {
            if (person.getFirstName().equals(voter.getFirstName()) &&
                    person.getLastName().equals(voter.getLastName()))
                return true;
        }
        return false;

    }

    /**
     * getter for question
     *
     * @return question of voting
     */
    public String getQuestion() {
        return question;
    }

    /**
     * getter for voters
     *
     * @return info of voters
     */
    public ArrayList<Person> getVoters() {
        return voters;
    }

    /**
     * getter for all vote related to this voting
     *
     * @return polls and info of the vote for each choice
     */
    public HashMap<String, HashSet<Vote>> getPolls() {
        return polls;
    }

    /**
     * getter for type of voting
     *
     * @return type of voting
     */
    public int getType() {
        return type;
    }

}
