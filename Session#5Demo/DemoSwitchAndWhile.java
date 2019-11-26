
/**
 * Write a description of class Calculator here.
 * 
 * @author (Rana) 
 * @version (2.0)
 */
public class DemoSwitchAndWhile
{

    /**
     * a method that displays the name of the day depending on the given parameter
     * 1= Saturday, 2 = Sunday, 3= Monday, 4 = Tuesday, 5= Wednesday, 6= Thursday, 7= Friday
     * @param number the number of the day in a week
     */
    public static void daysOftheWeek(int number){
        
        Book b = new Book();
        switch(number){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
           
            case 6: System.out.println("Satday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default : System.out.println("invalid value");

        }

    }
    
    /**
     * Create a method to implement the multiplication of two numbers 
     * without the use of * and using a while loop and a + operator
     */
    public static void multiply(int number1,int number2){
        int count = 1;
        int sum  = 0;
        while(count <= number2){
            sum = sum + number1;
            count++;
        }
        System.out.println(sum);
    }

    public static void factorial(int number){
        int count = 1;
        int sum = 1;
        while(count <= number){
            sum = sum * count;
            count++;
        }
        System.out.println(sum);
    }
    
    /**
     * Method getSumOfNumbers
     *
     * @param number A parameter to set the upper limit of the sum
     * displays The sum of all numbers from 0 to number
     */
    public static void getSumOfNumbers(int number){
        int sum = 0;
        int  count = 1;
        while(count <= number){
           sum = sum + count;
           count++;
           
        }
            System.out.println(sum);
        
    }
   
    /**
     * Method displayNumbers to display the numbers from 1 to the given parameter
     *
     * @param limit A parameter
     */
    public static void displayNumbers(int limit){
      int count = 1;
      while(count <= limit){
          System.out.println(count) ;
          count++;
        }
        
    }
    
}

