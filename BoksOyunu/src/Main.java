
public class Main {

   
    
    public static void main(String[] args) {
       
        Fighter f1 = new Fighter("Hamza", 10, 100, 90, 50);
        Fighter f2 = new Fighter("Bilal", 10, 100, 85, 50);
        
        Match m1 = new Match(f1, f2, 80, 100);
        m1.run();
        
    }
    
}
