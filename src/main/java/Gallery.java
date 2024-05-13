import java.util.ArrayList;

public class Gallery {

    //properties
    private String name;
    private double till;
    private ArrayList<Artwork> stock; //when artwork is created then it will be added to the gallery

    //constructor
    public Gallery(String name, double till){
        this.name = name;
        this.till = till;
        stock = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void setArtwork(Artwork artwork){
        stock.add(artwork); //taking artwork object and passing it to stock ArrayList
    }

    public int getStockSize(){
        return stock.size();
    }

    public void addMoney(int amount){
        till += amount;
    }

    public double getMoney(){
        return till;
    }


}
