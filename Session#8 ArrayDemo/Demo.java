public class Demo
{
   public static void main(String[] args){
       InputReader reader = new InputReader();
       System.out.println("what is your course name ?");
       String name =  reader.readString();
       System.out.println("your course is "+ name);
       System.out.println("how many students are enrolled in the course?");
       int number = reader.readInt();
       System.out.println("your course has "+ number+ " students enrolled in it");
       
    }
}