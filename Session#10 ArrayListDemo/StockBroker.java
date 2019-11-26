
/**
 * Write a description of class StockBroker here.
 * 
 * @author (RanaAlsammarraie) 
 * @version (2014-03--06)
 */
import java.util.ArrayList;

public class StockBroker
{

    private String brokerName;
    // create a StockPurchase ArrayList
    private ArrayList<StockPurchase> purchaseList;
    /**
     * Constructor for objects of class StockBroker
     */
    public StockBroker()
    {
        brokerName = "";
        purchaseList = new ArrayList<StockPurchase>();

    }

    /**
     * StockBroker Constructor
     *
     * @param brokerName A parameter
     */
    public StockBroker(String brokerName){
        setBrokerName(brokerName); 

    }

    /**
     * Method getBroakerName
     *
     * @return The return value
     */
    public String getBroakerName(){
        return brokerName;
    }

    /**
     * Method setBrokerName
     *
     * @param brokerName A parameter
     */
    public void setBrokerName(String brokerName){
        if(brokerName != null){
            this.brokerName = brokerName;
        }
        else{
            this.brokerName = "";
        }
    }

    /**
     * Method addStockPurchase to the arrayList
     *
     * @param stockPurchase parameter
     */
    public void addStockPurchase(StockPurchase toAdd){

        if(toAdd != null){
            purchaseList.add(toAdd);
        }

    }

    /**
     * Method getStockPurchase displays the information of  the stockPurchase
     * in an index given as a parameter
     *
     * @param index A parameter
     * 
     */
    public void getStockPurchase(int index){
        if(index >= 0 && index < purchaseList.size()){
            StockPurchase myPurchase = purchaseList.get(index);
            myPurchase.displayDetails();
        }
        else{
            System.out.println("invalid index");
        }

    }

    /**
     * Method displayAllPurchasesDetails
     * displays the details of all the stockPurchase
     * in the arrayList
     */
    public void displayAllPurchasesDetails(){
        for(StockPurchase onePurchase:purchaseList){
            onePurchase.displayDetails();
        }
    }

    /**
     * Method calculatetotalStockPurchaseCost calculates and
     * returns the sum of all the stockPurchase objects
     * in the arrayList
     *
     * @return The sum of all the stockPurchase value
     */
    public double calculatetotalStockPurchaseCost(){
        double cost = 0;
        for(StockPurchase onePurchase:purchaseList){

            cost = cost + onePurchase.getTotalCost();
        }
        return cost;
    }

    /**
     * Method removeStockPurchase removes an object
     * from the arrayList from an index given as a parameter
     *
     * @param index A parameter 
     */
    public void removeStockPurchase(int index){
        if(index >= 0 && index < purchaseList.size()){
            purchaseList.remove(index);
        }
        else{
            System.out.println("invalid index");
        }
    }

    /**
     * Method getStockPurchasesCount
     *
     * @return The size of the arrayList 
     */
    public int getStockPurchasesCount(){

        return  purchaseList.size();

    }

    /**
     * Method getStockPurchaseNumber a method to
     * calculate and return the amount of Stockpurchase objects 
     * of a given stock symbol
     *
     * @param symbol a String parameter
     * @return The return value
     */
    public int getStockPurchaseNumber(String symbol){
        int count =0;
        if(symbol != null){
            for(StockPurchase onePurchase: purchaseList){
                Stock theStock = onePurchase.getStock();
                String stockSymbol = theStock.getStockSymbol();
                if(stockSymbol.equalsIgnoreCase(symbol)){
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Method main
     *
     * @param args A parameter
     */
    public static void main(String[] args){

        StockPurchase s1= new StockPurchase(new Stock("Samsung",15),5);
        StockPurchase s2= new StockPurchase(new Stock("LG",20),7);
        StockPurchase s3 = new StockPurchase(new Stock("Nokia",5),20);
        StockBroker broker = new StockBroker("Max");
       // adding objects to the arrayList
        broker.addStockPurchase(s1);
        broker.addStockPurchase(s2);
        broker.addStockPurchase(s3);
        broker.addStockPurchase(s2);
        System.out.println(" 1) The StockPurchases are : ");
        broker.displayAllPurchasesDetails();
        System.out.println("2) The total cost of all the purchases is :"+
        broker.calculatetotalStockPurchaseCost());
        System.out.print("3) The number of Purchases of stock "+ s2.getStock().getStockSymbol()+" is : "+
        broker.getStockPurchaseNumber("LG"));
        broker.removeStockPurchase(0);
        System.out.println("\n\n 4) The StockPurchases are : ");
        broker.displayAllPurchasesDetails();

    }

}
