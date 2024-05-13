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

    // This will call the checkStock function, and return the artwork object if it is in stock
    public Artwork getArtWork(Artwork artwork) {
        return checkStock(artwork);
    }

    public int getStockSize(){
        return stock.size();
    }

    public void addMoney(double amount){
        till += amount;
    }

    public double getMoney(){
        return till;
    }

    // Check if artwork is in stock, if true return the object, if not then it returns null
    public Artwork checkStock(Artwork artwork) {
        if (stock.contains(artwork)) {
            return artwork;
        }
        System.out.println("Artwork not in stock");
        return null;
    }

    public void stockRemoved(Artwork artwork){
        stock.remove(checkStock(artwork)); //checks to see if artwork is in stock then is able to remove
        //it
    }

    // Totals the full amount of stock and assigns it to the stockTotal variable
    public double stockTake() {
        double stockTotal = 0;

        for(Artwork artwork : stock) {
            stockTotal += artwork.getPrice();
        }

        return stockTotal;
    }


}
