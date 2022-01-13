package library;

public class Item{

    private String item;
    private int price;

    public Item(int price){
        setPrice(price);
    }


    public void setItem(String item){
        this.item = item;
    }

    public String getItem(){
        return item;
    }

    public void setPrice(int price){
        this.price = price;
    }


    public int getPrice(){
        return price;
    }

    public String toString(){
        return "This " + getItem() + " costs "  + getPrice() + "$";
    }
}
