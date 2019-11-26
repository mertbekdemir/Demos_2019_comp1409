
/**
 * Write a description of class Car here.
 *
 * @author (Rana)
 * @version (2017)
 */

public class Car
{
    public static final int DEFAULT_YEAR = 1990;
    private String brandName;
    private int yearMade;

    /**
     * Constructor for objects of class Car
     */
    public Car()
    {
       brandName = "Unknown" ;
       yearMade = DEFAULT_YEAR;
    }
    
    /**
     * Car Constructor
     *
     * @param brand A parameter to set brand name
     * @param year A parameter to set year made
     */
    public Car(String brand, int year){
        setBrandName(brand);
        setYearMade(year);
    }
    
    /**
     * Method getBrandName
     *
     * @return The return value of brand name
     */
    public String getBrandName(){
        return brandName;
    }
    
    /**
     * Method getYearMade
     *
     * @return The return value or year made
     */
    public int getYearMade(){
        return yearMade;
    }
    
    /**
     * Method setBrandName
     *
     * @param inputBrand A parameter to set brand name
     */
    public void setBrandName(String inputBrand){
        if(inputBrand != null && inputBrand.length()>0){
            brandName = inputBrand;
        }
        else{
            brandName = "unknown";
        }
    }
    
    /**
     * Method setYearMade
     *
     * @param inputYear A parameter to set year made
     */
    public void setYearMade(int inputYear){
        if(inputYear >=DEFAULT_YEAR ){
            yearMade = inputYear;
        }
        else{
            inputYear = DEFAULT_YEAR;
        }
    }
    /**
     * Method displayDetails to display the object fields
     * values on the console
     *
     */
    public void displayDetails(){
        System.out.println(" the car make is "+ brandName);
        System.out.println("The car was made in "+ yearMade + " \n");
        
    }
    
    
}
