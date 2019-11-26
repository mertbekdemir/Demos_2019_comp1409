

import java.text.DecimalFormat;
public class DemoFormat
{
    // instance variables - replace the example below with your own
    private double value;

    /**
     * Constructor for objects of class DemoFormat
     */
    public DemoFormat()
    {
        value = 455.26544866;
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(df.format(value));
    }

   
}
