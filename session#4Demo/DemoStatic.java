

public class DemoStatic
{
    private static int count ;
    private int test;
    
    
    public DemoStatic(){
        count = count +1;
        test =5;
    }
    /**
     * static methods access static variables and
     * cannot access non-static variables
     */
    public static int getCount(){
      //  System.out.println(test); 
        return count;
    }
    
    /**
     * non-static methods can access 
     * static and non-static variables
     */
    public void printCount()
    {
        System.out.println(test);
        System.out.println (count);
    }
}