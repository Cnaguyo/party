package PartyProgram;

import Assignments.Book;

import java.util.ArrayList;
import java.util.List;

public class partyApp {

    public static void main(String[] args) {

        Person person = new Person(" john ", 18 , " cocola " ,false );

        Person person2 = new Person(" sarah ", 19, " Redbull ", false);
        Party party = new Party();

        party.addToList(person);
        party.addToList(person2);

        party.removeFromList(person);

//        for (Person p:persons){
//
//                System.out.println(p.isAttendingParty());
//                System.out.println(p.getPersonName());
//                System.out.println(p.getFavoriteDrink());
//                System.out.println(p.getAge());
//        }
    }
}
