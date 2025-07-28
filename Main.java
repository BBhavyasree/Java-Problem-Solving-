class Student3 { 
    String name ; 
    int rollno ; 
    double marks ; 
    void display (String n, int r, double m ) {
         System.out.println("Name: " +n) ; 
         System.out.println("rollno: " +r) ; 
         System.out.println("marks : " +m) ;
    } 
    
} 
public class Main { 
    public static void main (String[] args ) { 
        Student3 ob = new Student3 () ; 
        ob.display("Suresh", 123, 65) ;  // Passing values directly 
        ob.display ("Abhi" , 152, 68 ) ; 
    } 
} 

        