/**
 *  class Car to demo the arrayList
 *  @author Rana
 *  @version 2017
 */
public class Car
{
    public static final int YEAR_LIMIT = 1900;
    private String carBrand;
    private int yearOfMake;

    /**
     * Car Constructor
     *
     * @param brand A parameter to set the field brand
     * @param makeYear A parameter to set the field yearOfMake
     */
    public Car(String brand,int makeYear){
        setCarBrand(brand);
        setYearOfMake(makeYear);
    }

    /**
     * Method getCarBrand
     *
     * @return The return value of field carBrand
     */
    public String getCarBrand(){
        return carBrand;
    }

    /**
     * Method setCarBrand
     *
     * @param brand A parameter to set field carBrand
     */
    public void setCarBrand(String brand){
        if(brand != null){
            carBrand = brand;
        }
        else{
            throw new IllegalArgumentException("car brand cannot be null");
        }
    }

    /**
     * Method getYearOfMake
     *
     * @return The return value of field yearOfMake
     */
    public int getYearOfMake(){
        return yearOfMake;
    }

    /**
     * Method setYearOfMake
     *
     * @param year A parameter to set field yearOfMake
     */
    public void setYearOfMake(int year){
        if(year >0){
            yearOfMake = year;
        }
        else{
            yearOfMake = YEAR_LIMIT;
        }
    }

    /**
     * Method displayDetails
     *
     */
    public void displayDetails(){
        System.out.println(" car brand is "+ carBrand + " and the year of make is "+ yearOfMake);
        System.out.println();
    }

}
