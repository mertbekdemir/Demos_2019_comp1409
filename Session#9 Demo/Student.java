
/**
 * Write a description of class Student here.
 * 
 * @author (Rana Alsammarraie) 
 * @version (2.0)
 */
public class Student
{
    public static final int MAXIMUM_NUMBER = 10;
    public static final int MINIMUM_MARK = 0;
    public static final int  MAXIMUM_MARK = 100;
    public static final int  PASSING_MARK = 50;
    private String studentName;
    private int[] marks;
    // create 2D array of int 3 rows and 4 columns
   
   private int[][] numbers;
    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        studentName = "";
        numbers = new int[3][4];
        marks = new int[MAXIMUM_NUMBER] ;
    }

    /**
     * Student Constructor
     *
     * @param name A parameter
     */
    public Student(String name){
        setStudentName(name);
          marks = new int[MAXIMUM_NUMBER] ;
         numbers = new int[3][4];
    }

    public void loadNummbers(){
        // load the array with the sum of row and column
       for(int row = 0; row< numbers.length;row++){
           for(int column = 0; column < numbers[row].length; column++){
               numbers[row][column] = row+ column;
            }
        }
         for(int row = 0; row< numbers.length;row++){
           for(int column = 0; column < numbers[row].length; column++){
               System.out.print(numbers[row][column] + " ");
            }
            System.out.println();
        }

        // print 2D array
         
        
    }


    /**
     * Method setStudentName
     *
     * @param name A parameter
     */
    public void setStudentName(String name){
        if(name != null){
            studentName = name;
        }
        else {
           throw new IllegalArgumentException(" name cannot be null");
        }
    }

    /**
     * Method getStudentName
     *
     * @return The  value of student name
     */
    public String getStudentName(){
        return studentName;
    }

    /**
     * Method promtpStudentMarks
     *
     */
    public void promtpStudentMarks(){
        // use a for instead of a while loop
        InputReader reader = new InputReader();
      
           
           // int index = 0;
          // while(index < marks.length){
           
            // System.out.println("enter the students mark of exam number "+ (index+1) +"  ");
            // int mark = reader.readInt();
            // if(mark >= MINIMUM_MARK && mark <= MAXIMUM_MARK){
                // marks[index] = mark;
                // index--;
            // }
            // else{
                // System.out.println("invalid mark was entered,marks should be between "+MINIMUM_MARK+" and "+  MAXIMUM_MARK);

            // }

        // }
        
        
        for(int index1 = 0; index1 < marks.length;index1++){
              System.out.println("enter the students mark of exam number "+ (index1+1) +"  ");
            int mark = reader.readInt();
             if(mark >= MINIMUM_MARK && mark <= MAXIMUM_MARK){
                  marks[index1]= mark;
                }else{
                System.out.println("invalid mark was entered,marks should be between "+MINIMUM_MARK+" and "+  MAXIMUM_MARK);
                index1--;
            }
            
        }
        
        
        
    }

    /**
     * Method calculateAverageMark
     *
     * @return The  value of the students average mark
     */
    public double calculateAverageMark(){
        // use a for loop instead of a while loop
        double sum = 0;
        int index = 0;
        while(index < marks.length){
            sum += marks[index];
            index++;
        }
        
        
       
        
        return sum/marks.length;
    }

    /**
     * Method calculateTotalPassedExams
     *
     * @return The value of number of passed exams
     */
    public int calculateTotalPassedExams(){
        int passedExams = 0;
        int index = 0;
        while (index < marks.length){
            if(marks[index] >= PASSING_MARK){
                passedExams++;
            }
            index++;
        }
        return passedExams;

    }


    /**
     * Method isPass
     *
     * @return true if the student passes or false otherwise
     */
    public boolean isPass(){
        return (calculateAverageMark() >= PASSING_MARK);
    }

    /**
     * Method main
     *
     * The Driver of the class
     * @param args A parameter
     */
    public static void main(String[] args){
        //         Student student = new Student("James");
        //         student.promtpStudentMarks();
        //         System.out.println(student.calculateAverageMark());
        //         System.out.println(" the Student "+ student.getStudentName()+ " passed "+ student.calculateTotalPassedExams()+" exams");
        //         if(student.isPass()){
        //             System.out.println(" the student passes the exams");
        //         }
        //         else{
        //             System.out.println(" the student does not pass the exams");
        //         }

    Student s = new Student();
    s.loadNummbers();

    }

}
