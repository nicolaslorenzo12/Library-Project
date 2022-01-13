package library;

public class DutchBook extends Book {

    private String language;

    public DutchBook(String title, int pages, String item,int price,Author author ,String language){
        super(title,pages,item,price,author);
        setLanguage(language);
    }

    public void setLanguage(String language){

        if(!language.equals("dutch")){
            System.out.println("The language of this book is not dutch, please check it");
        }
        else {
            this.language = language;
        }
    }

    public String getLanguage(){
        return language;
    }

    public String toString(){
        return super.toString() + ". The language of the " + getItem() + " is "+ getLanguage();
    }



}
