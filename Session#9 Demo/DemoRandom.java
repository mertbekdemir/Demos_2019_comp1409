
    import java.util.Random;
    public class DemoRandom{
    
     public static void main(String[] args){
         Random rand = new Random();
         for(int count = 0; count<50; count++){
             int num = rand.nextInt(26)+ 25;
          
             System.out.println(num);
            }
        }
}

