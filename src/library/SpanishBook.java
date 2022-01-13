package library;

public class SpanishBook extends Book {

    private String language;

    public SpanishBook(String title, int pages, String item,int price,Author author,String language){
        super(title,pages,item,price,author);
        setLanguage(language);
    }

    public void setLanguage(String language){

        if(!language.equals("spanish")){
            System.out.println("The language of this book is not spanish, please check it");
        }
        else {
            this.language = language;
        }
    }

    public String getLanguage(){
        return language;
    }
    
    public String toString(){
        return super.toString() + ". The language of the " + getItem() + "is "+ getLanguage();
    }
}
