package PartyProgram;

public class Person {

    private String personName;
    private int age;
    private String favoriteDrink;
    private boolean isAttendingParty;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavoriteDrink() {
        return favoriteDrink;
    }

    public void setFavoriteDrink(String favoriteDrink) {
        this.favoriteDrink = favoriteDrink;
    }

    public boolean isAttendingParty() {
        return isAttendingParty;
    }

    public void setAttendingParty(boolean attendingParty) {
        isAttendingParty = attendingParty;
    }

    public Person(String personName, int age, String favoriteDrink, boolean isAttendingParty) {
        this.personName = personName;
        this.age = age;
        this.favoriteDrink = favoriteDrink;
        this.isAttendingParty = isAttendingParty;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", age=" + age +
                ", favoriteDrink='" + favoriteDrink + '\'' +
                ", isAttendingParty=" + isAttendingParty +
                '}';
    }
}
