
/**
 * Write a description of class Student here.
 * 
 * @author (Rana Alsammarraie) 
 * @version (2.0)
 */

public class Student
{
    // create symbolic constants

    public static final int MAX_GRADE =100;
    public static final int MIN_GRADE =0;
    public static final int COURSE_FEES_DISCOUNT_LIMIT = 700;
    public static final double DISCOUNT_RATE = 0.85;

    // create a static variable
    public static int count;

    private String studentName;
    private int testMark;
    private double courseFeesInCAD;
    private boolean isEligibleForDiscount;

    private char testGrade; // accepts only A,B,C,D,F

    /**
     * Student default Constructor
     *
     */
    public Student(){
        studentName = "unknown";
        testMark = 0;
        courseFeesInCAD = 0.0;
        isEligibleForDiscount = false;
        testGrade = 'F';
        // count the Student objects
        count = count + 1;
        //MAX_GRADE = 150; // will not compile symbolic constant values cannot be changed
    }

    /**
     * Student Constructor
     * constructor will accept the grade between 0 and 100
     * constructor will accept the course fees between 0 and 2000
     * 
     * @param newStudentName  to set the studentName
     * @param newStudentID  to set the studentID
     * @param newTestmark  to set the testMark
     * @param newCourseFeesInCAD  to set the courseFeesInCAD
     * @param inputTestGrade to set the testGrade
     */
    public Student(String newStudentName, int newTestMark,
    double newCourseFeesInCAD, char inputTestGrade)
    {
        if (newStudentName != null){
            studentName = newStudentName;
        }else{
            throw new IllegalArgumentException("name can not be null");
        }

        isEligibleForDiscount = false;

        //  if statement to validate the mark using AND &&
        if(newTestMark >= MIN_GRADE && newTestMark <= MAX_GRADE){
            testMark = newTestMark; 
        } else{
            throw new IllegalArgumentException("test mark must be between 0 and 100 inclusive");
        }

        // validating the grade using OR ||
        if(newTestMark < MIN_GRADE || newTestMark > MAX_GRADE){
            throw new IllegalArgumentException("test mark must be between 0 and 100 inclusive");
        } else{
            testMark = newTestMark; 
        }

        // if statement to validate and use the inputTestGrade valid input is A or B or C or D or F
        if(inputTestGrade == 'A' ||inputTestGrade == 'B'||inputTestGrade == 'C'||
        inputTestGrade == 'D'||inputTestGrade == 'F' ){
            testGrade = inputTestGrade;
        } else{
            throw new IllegalArgumentException(" grade can be either A, B,C,D or F") ;  
        }

        // if statement to validate the course fees
        if(newCourseFeesInCAD>= 0){
            courseFeesInCAD = newCourseFeesInCAD;
        }
        // count the Student objects
        count = count + 1;
    }

    /**
     * @return the studentName
     */
    public String getStudentName() {
        //  System.out.println(studentName); // will execute as it is before the return satement
        return studentName;
        // return is the last executable statement in the method
        // System.out.println(studentName); // unreachable statement will never execute
    }

    /**
     * @return the testGrade
     */
    public int getTestGrade() {
        return testGrade;
    }

    /**
     * @return the courseFeesInCAD
     */
    public double getCourseFeesInCAD() {
        return courseFeesInCAD;
    }

    /**
     * @return the isEligibleForDiscount
     */
    public boolean isEligibleForDiscount() {
        return isEligibleForDiscount;
    }

    /**
     * @param newStudentName  to set the studentName 
     */
    public void setStudentName(String newStudentName) {

        if(newStudentName != null){
            String  myStudentName = "Max";// the scope of the variable is --------------

            studentName = newStudentName;;
            System.out.println(studentName);// the scope of the instance variable -----------
            System.out.println(myStudentName);
        }
        //   System.out.println(myStudentName); // the variable is out of scope
        System.out.println(studentName);
    }

    /**
     * @param newTestGrade to set the testGrade 
     */
    public void setTestMark(int newTestMark) {
        //  if statement to validate the mark using AND &&
        if(newTestMark >= MIN_GRADE && newTestMark <= MAX_GRADE){
            testMark = newTestMark; 
        } else{
            throw new IllegalArgumentException("test mark must be between 0 and 100 inclusive");
        }

        // validating the grade using OR ||
        if(newTestMark < MIN_GRADE || newTestMark > MAX_GRADE){
            throw new IllegalArgumentException("test mark must be between 0 and 100 inclusive");
        } else{
            testMark = newTestMark; 
        }

    }

    /**
     * @param newCourseFeesInCAD to set the courseFeesInCAD 
     *  
     */
    public void setCourseFeesInCAD(double newCourseFeesInCAD) {

        if(newCourseFeesInCAD>=0){
            courseFeesInCAD = newCourseFeesInCAD;
        }

    }

    /**
     * @param newIsEligibleForDiscount to set the isEligibleForDiscount 
     */
    public void setEligibleForDiscount(boolean newIsEligibleForDiscount) {
        isEligibleForDiscount = newIsEligibleForDiscount;
        System.out.println(studentName);
    }

    /**
     * Method checkForDiscount to check the course fees and sets 
     * isEligibleForAdiscount field accordingly
     *
     *
     */
    public void checkForDiscount(){
        //rewirte the method to use symbolic constants and ensure 
        //that the discount will only be given once
        if(courseFeesInCAD >= COURSE_FEES_DISCOUNT_LIMIT && isEligibleForDiscount == false ){
            courseFeesInCAD = courseFeesInCAD * DISCOUNT_RATE;
            isEligibleForDiscount = true;
        }

    }

    /**
     *  method getCount (none static method)
     *  demo accessing a static variable from a none static method
     *  @return the static variable student count
     */
    public  int noneStaticGetCount(){
        System.out.println(studentName);
        return  count;

    }

    /**
     *  create a static method to return the static value
     *  demo accessing a none static variable from a static method
     */
    public static int getStaticCount(){
        // a static method cannot access an instance variable
        //System.out.println(studentName);
        return  count;

    }
    // a method to calculate the average mark of three quizzes using a local variable
    // create local variable average and sum
    public double calculateAverage(double quiz1,double quiz2,double quiz3){

        double average = 0.0;
        double sum = 0;
        sum = quiz1 + quiz2 + quiz3;

        average = sum / 3;
        return average;
        //  System.out.println(average); //unreachable statement
    }

    /**
     * Method displayDetails to display the details of the student
     *
     */
    public void displayDetails(){
        //  System.out.println(quiz1); //out of scope
        System.out.println("Student Name : "+ studentName);
        System.out.println("Test Score : " + testGrade);
        if(isEligibleForDiscount == true){
            System.out.println(" The student gets a discount of 15%");
        }
        else{
            System.out.println(" The student is not eligible for a discount ");
        }
        System.out.println("the course fees : " + courseFeesInCAD);
        System.out.println();
        // System.out.println(quiz1);// out of scope
        // System.out.println(sum);

    }

}
