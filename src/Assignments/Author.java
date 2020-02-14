package Assignments;

public class Author {

    private String authorName;
    private String email;
    private int age;
    private String gender;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Author(String authorName, String email, int age, String gender) {
        this.authorName = authorName;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }
}

