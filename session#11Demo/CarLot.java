
/**
 * Write a description of class CarLot here.
 *
 * @author (Rana )
 * @version (2017)
 */
import java.util.ArrayList;
import java.util.Iterator;


public class CarLot
{
   private ArrayList<Car> cars;

    /**
     * Constructor for objects of class CarLot
     */
    public CarLot()
    {
        cars = new ArrayList<Car>();
    }

   /**
    * Method AddCar
    *
    * @param toAdd A parameter to add a Car object to the arrayList
    */
   public void addCar(Car toAdd){
       if(toAdd != null){
           cars.add(toAdd);
        }
    }
    
    /**
     * Method displayCars using an iterator
     *
     */
    public void displayCars(){
      Iterator<Car> it = cars.iterator();
      while(it.hasNext()){
          Car c = it.next();
          c.displayDetails();
        }
       
    }
    
    /**
     * Method removeCar
     *
     * @param brand A parameter used to search the collection and remove
     * cars with the given brand
     */
    public void removeCar(String brand){
        Iterator<Car> it = cars.iterator();
        while(it.hasNext()){
            Car c = it.next();
            if(c.getBrandName().equals(brand)){
                it.remove();
            }
        }
      
    }
    
    /**
     * Method loadCarLot
     *
     */
    public void loadCarLot(){
      Car car1 = new Car("Honda",2015);
        Car car2 = new Car("Toyota",2010);
        Car car3 = new Car("Honda",2005);
        Car car4 = new Car("Porshe",2017);
        addCar(car1);
        addCar(car2);
        addCar(car3);
        addCar(car4);
        // it.next() reference issue
        // Iterator<Car> it = cars.iterator();
          // it.next().displayDetails();
          // it.next().displayDetails();
           // it.next().displayDetails();
            // it.next().displayDetails();
        
    }
    
    
    /**
     * Method main
     *
     * @param args A parameter
     */
    public static void main(String[] args){
        CarLot carShop = new CarLot();
        carShop.loadCarLot();
        System.out.println(" ------the car list before removing Toyota-----");
         carShop.displayCars();
         System.out.println(" ------the car list after removing Toyota-----");
         carShop.removeCar("Toyota");
         carShop.displayCars();
    }
}
