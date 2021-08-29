package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * A class to test voting system. add two votings and users can vote and see the result
 *
 * @author Hosna Oyarhoseini
 * @version 2021.April.6
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.createVoting("Have you met Ted?", 1);
        votingSystem.getVotingList().get(0).createChoice("yes");
//        votingSystem.getVotingList().get(0).createChoice("yes");
        votingSystem.getVotingList().get(0).createChoice("no");
        votingSystem.createVoting("Who deserve to be the next boss?", 2);
        votingSystem.getVotingList().get(1).createChoice("Ali");
        votingSystem.getVotingList().get(1).createChoice("Hasan");
        votingSystem.getVotingList().get(1).createChoice("Mona");

        char anotherPerson = 'y';
        while (anotherPerson == 'y') {
            System.out.println("Enter your name to vote: ");
            Person newPerson = new Person(scanner.next(), scanner.next());

            char anotherVoting = 'y';
            while (anotherVoting == 'y') {

                votingSystem.printListOfVotings();
                System.out.println("Which voting do you want to participate in now?(Enter index)");
                int votingIndex = scanner.nextInt();
                Voting voting = votingSystem.getVotingList().get(votingIndex - 1);
                if(voting.repeatedPerson(newPerson)){
                    System.out.println("Repeated person:(");
                    anotherVoting = 'n';
                    break;
                }

                votingSystem.printVoting(votingIndex);
                ArrayList<String> choices = new ArrayList<>();
                char anotherVote = 'y';
                do  {
                    System.out.println("Enter yor vote:");
                    scanner.nextLine();
                    int choice = scanner.nextInt();
                    String vote;
                    ArrayList <String> choicesList = new ArrayList<String>(voting.getPolls().keySet());
                    if(voting.getType() == 1 && choice == 3) {
                        Random random = new Random();
                        vote = choicesList.get(random.nextInt(2));
                    }else {
                        vote = choicesList.get(choice - 1);
                    }
                    choices.add(vote);
                    System.out.println("Do you want to vote for another choice?(y/n)");
                    anotherVote = scanner.next().charAt(0);
                }while (anotherVote == 'y');

                votingSystem.vote(votingIndex, newPerson, choices);
                System.out.println("Do you want to participate in another voting?(y/n)");
                anotherVoting = scanner.next().charAt(0);
            }
            System.out.println("Any one else wants to vote?(y/n)");
            anotherPerson = scanner.next().charAt(0);
        }
        System.out.println("final results:");
        votingSystem.printResult(1);
        votingSystem.printResult(2);

        System.out.println("Bye!Thanks for participation ^-^");
    }
}
