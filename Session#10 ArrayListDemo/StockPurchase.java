
/**
 * Write a description of class StockPurchase here.
 * 
 *@author (rana Alsammarraie) 
 *@version (2014-02-24)
 */
public class StockPurchase {
    private Stock stock;
    private int numberOfShares;

    /**
     * StockPuchase default Constructor
     *
     */
    public StockPurchase(){
        stock = new Stock();
        numberOfShares = 0;
    }

    
    /**
     * StockPuchase Constructor
     *
     * @param stock A parameter
     * @param numberOfShares A parameter
     */
    public StockPurchase(Stock stock, int numberOfShares) {
        setStock(stock);
        setNumberOfShares(numberOfShares);
    }

    /**
     * Method getStock
     *
     * @return The return stock
     */
    public Stock getStock() {
        return stock;
    }

    /**
     * Method getNumberOfShares
     *
     * @return The return numberOfShares
     */
    public int getNumberOfShares() {
        return numberOfShares;
    }

    /**
     * Method setStock
     *
     * @param stock A parameter to set stock
     */
    public void setStock(Stock stock) {
        if(stock != null){
            this.stock = stock;
        }
        else{
            this.stock = new Stock();
        }
    }

    /**
     * Method setNumberOfShares
     *
     * @param numberOfShares A parameter to set numberOfShares
     */
    public void setNumberOfShares(int numberOfShares) {
        if(numberOfShares > 0){
            this.numberOfShares = numberOfShares;
        }
    }

    /**
     * Method getTotalCost
     *
     * @return The return value is the total cost of buying a number of shares
     */
    public double getTotalCost(){
        return stock.getSharePrice() * numberOfShares;
    }

    /**
     * Method displayDetails
     *
     */
    public void displayDetails(){
        stock.displayDetails();
        System.out.println(" the cost of buying "+ getNumberOfShares() + " is "+ getTotalCost());
    }

	
}
