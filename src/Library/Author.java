package Library;

public class Author {
    private String name;
    private String mail;
    private char gender;

    public Author(String name, String mail, char gender) {
        this.name = name;
        this.mail = mail;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getMail() {
        return mail;
    }
}
