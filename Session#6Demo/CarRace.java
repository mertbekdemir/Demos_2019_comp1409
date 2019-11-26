
/**
 * CarRace - where drivers go to speed.
 * 
 * 
 **/
public class CarRace
{
    // Create 2 Driver objects
    private Driver driver1;
    private Driver driver2;
   
   
    
    /**
     * CarRace no-args Constructor
     *
     */
    public CarRace(){
       driver1 = new Driver();
       driver2 = new Driver();
       
    }
    
   
     /**
      * CarRace Constructor
      *
      * @param name1 A parameter to create driver1
      * @param speed1 A parameter to create driver1
      * @param name2 A parameter
      * @param speed2 A parameter
      */
     public CarRace(String name1, int speed1, String name2,int speed2){
      driver1 = new Driver(name1,speed1);
      driver2 = new Driver(name2,speed2);
     
     }
    
   
    /**
     * CarRace Constructor
     *
     * @param firstDriver A parameter
     * @param secondDriver A parameter
     */
     public CarRace(Driver inputDriver1, Driver inputDriver2){
    setDriver1( inputDriver1);
      setDriver2( inputDriver2);
     } 
    
    //accessors
     public Driver getDriver1(){
         return driver1;
        }
        
        public Driver getDriver2(){
          return driver2;   
        }
    
    // mutators
    
    /**
     * Method setDriver1
     *
     * @param inputDriver1 A parameter
     */
    public void setDriver1(Driver inputDriver1){
        if(inputDriver1 != null){
            driver1 = inputDriver1;
        }else{
            throw new IllegalArgumentException("driver cannot be null");
        }
    }
    
    public void setDriver2(Driver newDriver2){
        if(newDriver2 == null){
          driver2 = new Driver();       
        } else{
           driver2 = newDriver2;   
        }
    }
   
    
    /**
     * Method displayDriversNames
     *
     */
    public void displayDriversNames(){
        
        String name1 = driver1.getName();
        String name2 = driver2.getName();
        System.out.println(name1);
        System.out.println(name2);
       
    }

    /**
     * Method getWinner
     *
     * @return The winner driver object by comparing the speed of the drivers 
     */
    public Driver getWinner(){
     int speed1 = driver1.getSpeedInKPerHour();
     int speed2 = driver2.getSpeedInKPerHour();
     
     if(speed1 > speed2){
          return driver1;
        }else{
            return driver2;
        }
    }

    /**
     * Method displayDetails
     *
     */
    public void displayDetails(){
       System.out.println(driver1.getName());
       System.out.println(driver1.getSpeedInKPerHour());
       System.out.println(driver2.getName());
       System.out.println(driver2.getSpeedInKPerHour());
           
        //OR
        
       driver1.displayDetails();
       driver2.displayDetails();
       
    }
}

