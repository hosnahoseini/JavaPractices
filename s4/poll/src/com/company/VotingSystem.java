package com.company;

import java.util.ArrayList;

/**
 * A class for keeping some votings
 *
 * @author Hosna Oyarhoseini
 * @version 2021.April.6
 */
public class VotingSystem {
    private ArrayList<Voting> votingList;

    /**
     * constructor
     */
    public VotingSystem() {
        votingList = new ArrayList<>();
    }

    /**
     * create a new voting
     * @param question question of voting
     * @param type type of voting
     */
    public void createVoting(String question, int type){
        votingList.add(new Voting(type, question));
    }

    /**
     * print list of voting's questions
     */
    public void printListOfVotings(){
        for(int i = 0; i < votingList.size() ;i++)
            System.out.println(i+1 + ": " + votingList.get(i).getQuestion());
    }

    /**
     * print choices of specific voting
     * @param index index of voting we want to see choices
     */
    public void printVoting(int index){
        if(index > 0 && index <= votingList.size()) {
            int i = 1;
            for (Object choice : votingList.get(index - 1).getPolls().keySet())
                System.out.println(i++ + ")" + choice);
            if(votingList.get(index - 1).getType() == 1)
                System.out.println(i++ + ")" + "random");
        }
        else System.out.println("invalid index");
    }

    /**
     * save a vote for a specific voting
     * @param indexOfVoting index of voting
     * @param person info of person who is voting
     * @param choices choices that he/she decided to vote
     */
    public void vote(int indexOfVoting, Person person, ArrayList<String>choices) {
        if (indexOfVoting > 0 && indexOfVoting <= votingList.size()) {
            votingList.get(indexOfVoting - 1).vote(person, choices);
        } else System.out.println("invalid index");
    }

    /**
     * print result of specific voting
     * @param index index of voting
     */
    public void printResult(int index) {
        if (index > 0 && index <= votingList.size()) {
            votingList.get(index - 1).printResult();
        } else System.out.println("invalid index");
    }

    /**
     * getter for voting list
     * @return voting list
     */
    public ArrayList<Voting> getVotingList() {
        return votingList;
    }


}
