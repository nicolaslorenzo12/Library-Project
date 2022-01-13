package library;

public class Book extends Item {

    private int pages;
    private String title;
    Author author;

    public Book(String title, int pages,String item,int price,Author author) {
        super(price);
        setItem(item);
        setTitle(title);
        setPages(pages);
        this.author = author;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public int getPages(){
        return pages;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setItem(String item){

        if(!item.equals("book")){
            System.out.println("This item is not a book, please check it");
        }
        else{
            super.setItem(item);
        }
    }

    public String toString(){
        return super.toString() + ", # of pages is " + getPages() + ", the title is " + getTitle() + ". "  +author.toString();
    }
}
