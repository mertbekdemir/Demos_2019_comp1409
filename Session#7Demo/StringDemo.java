

public class StringDemo
{
   public static void demoStringEquality(){
        String word1 = "Java";
        String word2 = new String("Java");
        String s3 = "Ja v   a";
        System.out.println(" the length of the string is "+ s3.length());
        
        System.out.println(" word1 == word2: " + (word1 == word2));
        System.out.println("word1.equals(word2): " +word1.equals(word2)); 
      
        
    }
    
    // demo String methods toUpperCase and toLowerCase
}
