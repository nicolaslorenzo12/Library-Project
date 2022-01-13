package library;

public class Author {

    private String name;
    private String lastName;
    private String nationality;

    public Author(String name, String lastName,String nationality){
        setName(name);
        setLastName(lastName);
        setNationality(nationality);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String toString(){
        return "The author is " + getName() + " " + getLastName() + " and his/her nationality is " + getNationality();
    }
}
