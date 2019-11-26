
/**
 * Write a description of class Driver here.
 * 
 * @author (Rana Alsammarraie) 
 * @version (2017/01)
 */
public class Driver
{

    private String name;

    private int speedInKPerHour;

    /**
     * Driver  default Constructor
     *
     */
    public Driver(){
        name = "unknown";
        speedInKPerHour = 0;

    }

    public Driver(String newName,  int newSpeedInKPerHour) {
        setName(newName);
        setSpeedInKPerHour(newSpeedInKPerHour);
       // displayDetails();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param newName to set the name 
     */
    public void setName(String newName) {
        if(newName != null){
            name = newName;
        }
        else{
           throw new IllegalArgumentException("the name cannot be null");
        }
    }

    /**
     * @return the speedInKPerHour
     */
    public int getSpeedInKPerHour() {
        return speedInKPerHour;
    }

    /**
     * @param newSpeedInKPerHour to set  the speedInKPerHour 
     */
    public void setSpeedInKPerHour(int newSpeedInKPerHour) {
        if(newSpeedInKPerHour > 0){
            speedInKPerHour = newSpeedInKPerHour;
        }else{
           throw new IllegalArgumentException("the speed cannot be negative");
        }
    }

    /**
     * Method displayDetails to display the details of the driver
     *driver1.
     */
    public void displayDetails(){

        System.out.println(" Driver name : " + getName());
        System.out.println("Speed : " + getSpeedInKPerHour());
    }
    
    

}
