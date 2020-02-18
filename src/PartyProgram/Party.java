package PartyProgram;

import SuperMarket.Product;

import java.util.ArrayList;
import java.util.List;

public class Party {
      private List<Person> persons = new ArrayList<>();

    public void addToList(Person person) {
        persons.add(person);
    }
    public void removeFromList(Person person) {
        persons.remove(person);
    }
    public void show() {
        for (Person person : persons) {
            System.out.println(person.isAttendingParty());
        }
    }
      }

