package PartyProgram;

import java.util.ArrayList;
import java.util.List;

public class Party {
      private List<Person> persons = new ArrayList<>();
      private String Location;
      private String name;

    public void addToList(Person person) {
        if(person.isAttendingParty()){
            System.out.println("Person "+ person.getPersonName() +  " is already at the party");
        } else {
            person.setAttendingParty(true);
            System.out.println("Person "+ person.getPersonName()+ "entered party.");
            persons.add(person);
        }

    }
    public void removeFromList(Person person) {

        if (persons.contains(person)) {
            persons.remove(person);
            person.setAttendingParty(false);
            System.out.println("The person " + person.getPersonName() + " has left the party.");
        } else {
            System.out.println("The person is not at the party right now");
        }
    }

    public void show() {
        for (Person person : persons) {
            System.out.println(person.isAttendingParty());
        }
    } }

