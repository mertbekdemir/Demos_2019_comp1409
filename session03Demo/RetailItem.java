
/**
 * Class RetailItem Lab 2B solution
 * Demo Session#3
 * 
 * @author (Rana Alsammarraie) 
 * @version (2019)
 */
public class RetailItem
{
    private String itemDescription;
    private double itemPriceInCAD;
    private boolean isOnDemand;
    private int numberOfUnitsInStock;

    private int result;

    /**
     * RetailItem defaul Constructor
     *
     */
    public RetailItem(){
        itemDescription = "unknown";
        itemPriceInCAD = 1;
        isOnDemand = false;
        numberOfUnitsInStock = 1;
    }

    /**
     * RetailItem non-default constructor
     *
     * @param newItemDescription A parameter
     * @param newItemPriceInCAD A parameter
     * @param newIsOnDemand A parameter
     * @param newNumberOfUnitsInStock A parameter
     */
    public RetailItem(String newItemDescription, double newItemPriceInCAD,
    boolean newIsOnDemand, int newNumberOfUnitsInStock) {
        if(newItemDescription != null){
            itemDescription = newItemDescription;
        } else{
            throw new IllegalArgumentException(" Item description cannot be null");
        }

        if(newItemPriceInCAD > 0){
            itemPriceInCAD = newItemPriceInCAD;
        }else{
            throw new IllegalArgumentException(" Item price cannot be negative ");
        }

        isOnDemand = newIsOnDemand;

        if(newNumberOfUnitsInStock > 0){
            numberOfUnitsInStock = newNumberOfUnitsInStock;
        }else{
            throw new IllegalArgumentException(" Item number of units in stock cannot be negative");
        }
    }

    // Create the following methods
   
    /*
     * 1. create accessors for each field
     * 2. create a mutator for each field, the mutator will validate the parameter. 
     *    If theparameter was valid it will be used otherwise an IllegalArgumentException will be thrown
     *    The valdation is the same as the ones in the constructor.
     * 3. Create amethod to display the details of the RetialItem object
     * 4. Create a main method to display the following message
     * ( session #3 demo )
     * 5. Whats the out put of the following statement
     *    System.out.println(4 + 4 + "4" + (4+4) +4);
     */

   
    
    /**
     * Method add
     *
     * @param number1 a parameter to pass the first number
     * @param number2 a parameter to pass the second number
     * @return the result of adding the passed parameters
     */
    public int add(int number1, int number2){
        return number1 + number2;

    }

    private void multiply(int number1, int number2){
        result = number1 * number2;   
    }

    /**
     * Method getItemDescription
     * @return the value of itemDescription
     */
    public String getItemDescription(){
        return itemDescription;
    }

    /**
     * Method getItemPriceInCAD
     *
     * @return the value of itemPriceInCAD
     */
    public double getItemPriceInCAD(){
        return itemPriceInCAD;
    }

    /**
     * Method getIsOnDemand
     *
     * @return the value of isOnDemand
     */
    public boolean getIsOnDemand(){
        return isOnDemand;   
    }

    /**
     * Method getNumberOfUnitsInStock
     *
     * @return the value of numberOfUnitsInStock
     */
    public int getNumberOfUnitsInStock(){
        return numberOfUnitsInStock;
    }

    /**
     *  method setItemDescription
     *  @param newItemDescription to set itemDescription
     */
    public void setItemDescription(String newItemDescription){

        if(newItemDescription != null){
            itemDescription = newItemDescription;
        } else{
            throw new IllegalArgumentException(" Item description cannot be null");
        }

    }

    /**
     * Method setItemPriceInCAD
     *
     * @param newPrice a parameter to set itemPriceInCAD
     */
    public void setItemPriceInCAD(double newPrice){
        if(newPrice > 0){
            itemPriceInCAD = newPrice;
        } else {
            throw new IllegalArgumentException(" Item price cannot be 0 or less");
        }
    }

    /**
     * Method setIsOnDemand
     *
     * @param demand a parameter to set isOnDemand
     */
    public void setIsOnDemand(boolean demand){
        isOnDemand = demand;
    }

    /**
     * Method setNumberOfUnitsInStock
     *
     * @param units a parameter to set numberOfUnitsInStock
     */
    public void setNumberOfUnitsInStock(int units){
        if(units > 0)   {
            numberOfUnitsInStock = units;
        } else{
            throw new IllegalArgumentException(" units cannot be 0 or less");
        }
    }

    public void displayDetails(){
        System.out.println("item description: " + itemDescription);
        System.out.println("item price in CAD: " + itemPriceInCAD);
        System.out.println(" number of units in stock " + numberOfUnitsInStock);
        System.out.println(" is item on demand: "+ isOnDemand);
       // System.out.println(9 + 5); // this will display 14
      // System.out.println(5+6+ "result is"); //this will display 11 result is 
       //System.out.println( "result is " + 5+6); // this will display result is 56 
       System.out.println(4 + 4 + "4" + (4+4) +4); // this will display 8484
    }
    
     public static void main(String[] args){
         System.out.println(" hello world from comp 1409");
        }
    
}
