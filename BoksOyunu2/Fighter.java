
public class Fighter {
    
    String name;
    int health;
    int damage;
    int weight;
    double bloklama;
    

    public Fighter(String name, int health, int damage, int weight, double bloklama) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weight = weight;
        this.bloklama = bloklama;
    }
    
     
    int alinanDarbe(Fighter rakip){
        
        System.out.println(this.name +" ==> "+rakip.name+" "+ this.damage+" vurdu.");
        
        if (rakip.health-this.damage < 0) 
            return 0;
        if (bloklama()) {
            System.out.println(rakip.name+" gelen sakdırıyı blokladı.");
                    
            return rakip.health;
        }
    
        
        
        return rakip.health - this.damage;
        
        
    }
    
    boolean bloklama(){
        
        double rastgeleSayi = Math.random()*100;
        
        return this.bloklama<=rastgeleSayi;
        
    }
    
}
