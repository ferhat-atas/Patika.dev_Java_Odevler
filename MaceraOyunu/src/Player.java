
public class Player {
    
    private String name;
    private String charName;
    private int health;
    private int damage;
    private int money;

    public Player(String name) {
        this.name = name;
        
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getCharName(){
        return charName;
    }
    
    public void setCharName(String charName){
        this.charName = charName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    public void selectChar(){
        System.out.println("Karekter: Samuray\t Hasar: 5 \t Sağlık: 21 \t Para: 15");
        System.out.println("Karekter: Okçu   \t Hasar: 7 \t Sağlık: 18 \t Para: 20");
        System.out.println("Karekter: Şovalye\t Hasar: 8 \t Sağlık: 24 \t Para: 5");
                
    }
    
    
    
    
    
    
}
