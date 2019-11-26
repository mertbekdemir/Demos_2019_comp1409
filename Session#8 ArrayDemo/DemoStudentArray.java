
/**
 * Write a description of class DemoStudentArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DemoStudentArray
{
   private Student[] list;

    /**
     * Constructor for objects of class DemoStudentArray
     */
    public DemoStudentArray()
    {
       list = new Student[4];
    }

    public void loadArray(){
        list[0] = new Student("Bob");
        list[2] = new Student("Adam");
        
    }
    
    public void displayArray(){
        int index = 0;
        while(index < list.length){
            System.out.println(list[index]);
            index++;
        }
        
    }
    
    public void displayNames(){
        int index = 0;
        while(index < list.length){
            if(list[index] != null){
            System.out.println(list[index].getName());
        }
            index++;
        }
    }
     
    
    public static void main(String[] args){
         DemoStudentArray array = new DemoStudentArray();
         array.displayArray();
         array.loadArray();
         array.displayNames();
        // array.displayArray();
    }
}
