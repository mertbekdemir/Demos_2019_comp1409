
/**
 * Write a description of class StockBroker here.
 * 
 * @author (RanaAlsammarraie) 
 * @version (2014-03--06)
 */
// import the required classes
import java.util.Iterator;
import java.util.ArrayList;

public class StockBroker
{
    //arrayList instance variable
    private String brokerName;
    private ArrayList<StockPurchase> stockPurchases;

    /**
     * Constructor for objects of class StockBroker
     */
    public StockBroker()
    {
        brokerName = "";
        stockPurchases = new ArrayList<StockPurchase>();
    }

    /**
     * StockBroker Constructor
     *
     * @param brokerName A parameter
     */
    public StockBroker(String brokerName){
        setBrokerName(brokerName); 
        stockPurchases = new ArrayList<StockPurchase>();
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
     * Method addStockPurchase
     *
     * @param stock A parameter
     */
    public void addStockPurchase(StockPurchase stock){
        stockPurchases.add(stock);
    }

    /**
     * Method getStockPurchase
     *
     * @param index A parameter
     * @return The stockPurchase object 
     */
    public StockPurchase getStockPurchase(int index){
        int size = stockPurchases.size();
        StockPurchase myPurchase =null;
        if( index >=0 && index < stockPurchases.size()){
            myPurchase = stockPurchases.get(index);

        }
        else{
            System.out.println("invalid index"); 
        }
        return myPurchase;
    }

    /** 
     * use an iterator instead of the for each loop to display the details of each 
     * stockPurchase
     * use chaining method calls to display the details of the stock and 
     * the stockPurchase
     */
    public void displayAllPurchasesDetails(){
//          for(StockPurchase myStock:stockPurchases){
//             myStock.showDetails();
//          }
        // using iterator
        Iterator <StockPurchase> it = stockPurchases.iterator();
        while(it.hasNext()){
            StockPurchase s = it.next();
            s.showDetails();
        }
       
        
       
      
    }

    /** 
     * use an iterator instead of the for each loop to calclulate the total sum of
     * all the stockPurchases
     */
    public double calculatetotalStockPurchase(){
        double sum=0.0;
        // using iterator
        Iterator<StockPurchase> it = stockPurchases.iterator();
        while(it.hasNext()){
            StockPurchase stock = it.next();
            sum += stock.getTotalCost();
           
        }
        return sum;
    }

    /**
     * Method removeStockPurchase removes the StockePurchase with given symbol 
     * and return the number of removed objects using an Iterator
     *
     * @param symbol A parameter to pass the stock symbol
     * @return The return value is the number of removed objects from the collection
     */
    public int removeStockPurchase(String symbol){
        // using an iterator
        int removedObjects = 0;
         if(symbol != null){
           Iterator<StockPurchase> it = stockPurchases.iterator();
           while(it.hasNext()){
               StockPurchase s = it.next();
               Stock stock = s.getStock();
               String stockSymbol = stock.getStockSymbol();
               if(stockSymbol.equals(symbol)){
                   it.remove();
                   removedObjects++;
                }
            }
            }
        return removedObjects;
    }
    //// averagePrice of stock to demo division by 0

    public double getAveragePrice(){
        double sum = 0;
        double average = 0;
          Iterator<StockPurchase> it = stockPurchases.iterator();
          while(it.hasNext()){
            StockPurchase s = it.next();
            sum+= s.getTotalCost();
            }
            if(stockPurchases.size() > 0){
            average = sum/ stockPurchases.size();
        }
    
        return average;
    }

    /**
     * Method loadStockPurchases to add three anonymous objects
     * of stockPurchases
     *
     */
    public void loadStockPurchases(){
        Stock s = new Stock("Samsung",150);
        stockPurchases.add(new StockPurchase(s,5));
        stockPurchases.add(new StockPurchase(new Stock("LG",50),10));
        stockPurchases.add(new StockPurchase(new Stock("MAZDA",500),25));
        Iterator <StockPurchase> it = stockPurchases.iterator();
        it.next().showDetails();
        it.next().showDetails();
        it.next().showDetails();
        it.next().showDetails();
        
    }
    public static void main(String[] args){
      StockBroker  broker = new StockBroker();
      broker.loadStockPurchases();
     // broker.displayAllPurchasesDetails();
     // broker.removeStockPurchase("LG");
     // System.out.println("**** the stock purchases after removing an object are***");
     // broker.displayAllPurchasesDetails();
     // System.out.println(" the average price of the purchase is "+ broker.getAveragePrice());
    }

}
