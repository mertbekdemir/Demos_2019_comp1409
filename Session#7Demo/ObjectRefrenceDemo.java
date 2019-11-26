
public class ObjectRefrenceDemo
{

    /**
     * Constructor for objects of class ObjectRefrenceDemo
     */
    public ObjectRefrenceDemo()
    {
        Book b1 = new Book("moby Dick");
        Book b2 = new Book("20000 leagues");
        Book b3 = new Book ("war and peace");
        Book b4 = b2;
        b2 = new Book ("new world");
        Book b5 = new Book ("old yeller");
        Book b6 = b4;
        Book b7 = b1;
        b2 = b5;
        b5 = null;
        b7 = b6;
        b2 = new Book ("something new");
        b4.setTitle("another book");
      //  System.out.println(b6.getTitle());
        b4 = b1;
        b1.setTitle("To Kill a Mockingbird"); 
       // System.out.println(b4.getTitle());
       
        System.out.println("b1 "+b1);
        System.out.println("b2 "+b2);
        System.out.println("b3 "+b3);
        System.out.println("b4 "+b4);
        System.out.println("b5 "+b5);
        System.out.println("b6 "+b6);
        System.out.println("b7 "+b7);

        System.out.println("\n\n\n");
        System.out.println("b1 "+b1.getTitle());
        System.out.println("b2 "+b2.getTitle());
        System.out.println("b3 "+b3.getTitle());
        System.out.println("b4 "+b4.getTitle());
        System.out.println("b5 "+b5);
        System.out.println("b6 "+b6.getTitle());
        System.out.println("b7 "+b7.getTitle());

    }
    
   

}
