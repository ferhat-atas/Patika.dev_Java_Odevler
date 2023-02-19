
public class Main {

    
    
    public static void main(String[] args) {
       
        Fighter Hamza = new Fighter("Hamza", 100, 10, 90,50);
        
        Fighter Bilal = new Fighter("Bilal", 100, 10, 90,50);
        
        Match match = new Match(Bilal, Hamza, 80, 100);
        
        match.basla();
        
        
    }
    
}
