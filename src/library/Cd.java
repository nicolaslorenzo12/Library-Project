package library;

public class Cd extends Item {

    private String title;
    Componist componist;
    public Cd(String item,int price,String title,Componist componist){
        super(price);
        setItem(item);
        setTitle(title);
        this.componist = componist;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setItem(String item){

        if(!item.equals("cd")){
            System.out.println("This item is not a cd, please check it");
        }
        else{
            super.setItem(item);
        }
    }

    public String toString(){
        return super.toString() + ". The title of the cd is " + getTitle() + componist.toString();
    }
}
