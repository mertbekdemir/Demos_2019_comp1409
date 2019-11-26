/**
 * Demo ArrayList
 * @author Rana
 * @version 2019
 */
 import java.util.ArrayList;
public class ArrayListDemo
{

    private ArrayList<Car> carLot;
    private ArrayList<Integer> numbers;

    /**
     * ArrayListDemo Constructor
     *
     */
    public ArrayListDemo(){
      carLot = new ArrayList <Car> ();
      // by default ArrayList can hold different types of objects. To prevent that <> should be used
      // to specify the type of objects stored in the ArrayList
      // carLot.add("word");
      // Car c = new Car("barnd",2015);
      // carLot.add(c);
      // Stock s = new Stock("Sumbol",10);
      // carLot.add(s);
      numbers = new ArrayList();
    }
    
    public void demoWrapperClass(){
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        for(int num: numbers){
         System.out.println(num)   ;
        }
    }
    
    public void demoForEachWithArrays(){
        int[][] values = new int[3][4];
        for(int[] row: values){
        for(int column:row){
           System.out.print(column+ " ");
        }
        System.out.println();
    }
}

    /**
     * Method addCar
     *
     * @param toAdd A parameter of type Car to add to the arrayList
     */
    public void addCar(Car toAdd){
        if(toAdd != null){
        carLot.add(toAdd);
    }
    }
  

    /**
     * Method getCar
     *
     * @param index A parameter 
     */
    public void getCar(int index){
     
        if(index >=0 && index < carLot.size()){
       Car c = carLot.get(index);
       c.displayDetails();
    } else{
       System.out.println("invalid index was provided")   ;
    }
    }
   

    /**
     * Method sellCar(remove)
     *
     * @param index A parameter
     */
    
    public void sellCar(int index){
        if(index >= 0 &&  index < carLot.size()){
          carLot.remove(index) ;  
        }else{
       System.out.println("invalid index was provided")   ;
    }
    }
  

    /**
     * Method amountOfCars
     *
     * @return The return value is the size of the arrayList
     */
    public int amountOfCars(){
      return carLot.size();   
    }
    

    /**
     * Method displayCarDetails
     *
     */
    public void displayCarDetails(){
        for(Car c: carLot){
         c.displayDetails();   
        }
        
    }
   

    /**
     * Method findCar
     *
     * @param brand A parameter to search in the collection
     */
    public void findCar(String brand){
      for(Car c:carLot)   {
        //  String carBrand = c.getCarBrand();
        //  if(carBrand.equalsIgnoreCase(brand)){
            if(c.getCarBrand().equalsIgnoreCase(brand)){
              c.displayDetails(); 
            }
        }
    }

   

    
    public static void main(String[] args){
    ArrayListDemo demo = new ArrayListDemo();
    Car c1 = new Car("Honda",2015);
    Car c2 = new Car("Toyota",2018);
    Car c3 = new Car("Ford",2000);
    demo.addCar(c1);
    demo.addCar(c2);
    demo.addCar(c3);
     demo.displayCarDetails();
     System.out.println(" calling method getCar with invalid index :");
     demo.getCar(3);
     System.out.println(" calling method getCar with valid index : ");
     demo.getCar(1);
     demo.sellCar(2);
     System.out.println(" the car list after removing the car Ford");
     demo.displayCarDetails();
     System.out.println(" the number of cars in the collection is "
     + demo.amountOfCars());
     System.out.println(" calling method findCar on the parameter Honda")   ;
     demo.findCar("Honda");                           

    }
     

}
