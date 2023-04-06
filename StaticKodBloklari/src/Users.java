
import java.util.Random;



public class Users {
    
    public String name;
    public static int counter= 0;
    
    static{
        System.out.println("2.Static kod bloğu çalışıyor.");
        int random =(int) (Math.random()*10);
        System.out.println("3.Random varsayılan değer: "+random);
        counter = random; 
        System.out.println("4.Counter varsayılan değer: "+ counter);
    }
    
    public Users(String name){
        
        this.name = name;
        
        counter++; 
        System.out.println("Counter yeni değer: "+counter);
    }
    
}
