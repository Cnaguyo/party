package PartyProgram;

import Assignments.Book;

import java.util.ArrayList;
import java.util.List;

public class partyApp {

    public static void main(String[] args) {

        Person person = new Person(" john ", 18 , " cocola " ,true );

        Person person2 = new Person(" sarah ", 19, " Redbull ", false);

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person2);

        for (Person p:persons){

            System.out.println(p.isAttendingParty());
            System.out.println(p.getPersonName());
            System.out.println(p.getFavoriteDrink());
            System.out.println(p.getAge());
        }
    }
}
