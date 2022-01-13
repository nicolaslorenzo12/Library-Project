package library;

public class Library {

    public static void main(String[] args) {

        Author author = new Author("Martijn","Moreel","Belgian");
        Item book = new DutchBook("Zijn leven in Antwerpen",234,"book",450,author,"spanish");
        System.out.println(book);

        Componist componist = new Componist("Sebastian","Lorenzo","Venezuelan");
        Item cd = new Cd("cd",50,"Lalala",componist);
        System.out.println(cd);
    }
}
