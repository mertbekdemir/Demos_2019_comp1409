/**
 * @author (Rana)
 * @version (09/2017)
 */
public class ArrayDemo
{

    // define array Literals
    
    // define an int array called numbers
   private int[] numbers;
    // define a Book object array
  private Book[] booksArray;
    public ArrayDemo() {
        //initialize the arrays
      numbers = new int[5];
      booksArray = new Book[5];

    }
     public void loadBookArray(){
        booksArray[0]=   new  Book("The help ","Kathryn Stockett", 2009, 20.0);
        booksArray[1] =   new  Book("Inferno ","Dan Brown", 2013, 15.0);
        //  booksArray[2]=   new  Book("How We Decide ","Jonah Lehrer ", 2010, 7.0);
        booksArray[3]=   new Book("Anna Karenina","Leo Tolstoy",1877,10.0);
        booksArray[4]=  new Book("The Giver","Lois Lowry",2006,15.0);
     }

    /**
     * Load int array using while loop with the index multiplied by 2 values 
     */
    public void loadIntArray(){
      int index = 0;
      while(index < numbers.length){
          numbers[index]= index * 2;
          index++;
        }
    }

    /**
     * Method displayArrays
     * to display the title of every book in booksArray 
     */
    public void displayBookArray(){
      int index = 0;
      while(index < booksArray.length){
          if(booksArray[index] != null){
          System.out.println(booksArray[index].getTitle()) ;
        }
          index++;
        }
    }

    /**
     * Method displayIntArray in the format the number in position x is y
     *
     */
    public void displayIntArray(){
       int index = 0;
       while(index < numbers.length){
          System.out.println(numbers[index])  ;
          index++;
        }
    }

    public static void main(String[] args){
        ArrayDemo demo = new ArrayDemo();
        // demo.loadIntArray();
        // demo.displayIntArray();
        demo.loadBookArray();
        demo.displayBookArray();

    }
}

