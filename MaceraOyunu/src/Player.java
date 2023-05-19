
import java.util.Scanner;


public class Player {
    
    private String name;
    private String charName;
    private int health;
    private int damage;
    private int money;
    
    private Scanner sc = new Scanner(System.in);

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
        GameChar[] charList ={new Samurai(), new Archer(), new Knight()};
        
        for (GameChar gameChar : charList) {
            System.out.println("ID: "+gameChar.getId()
                    +"\tKarekter: "+gameChar.getName()+""
                    + "\t Hasar: "+gameChar.getDamage()
                    +"\t Sağlık: "+gameChar.getHealth()
                    +" \t Para: "+gameChar.getMoney());
        }
        
        System.out.print("Lütfen bir karekter seçiniz: ");
        int selectChar = sc.nextInt();
        
         switch(selectChar){
             
             case 1:
                 initPlayer(new Samurai());
                 break;
                
             case 2:
                 initPlayer(new Archer());     
                 break;
                 
             case 3:
                 initPlayer(new Knight());
                 break;
                 
             default :
                 initPlayer(new Samurai());
                 break;
                         
         }
         
      System.out.println("Seçilen Karekter:");
      System.out.println("Karekter: "+this.getCharName()+""
                    + "\t Hasar: "+this.getDamage()
                    +"\t Sağlık: "+this.getHealth()
                    +" \t Para: "+this.getMoney());
      
      }
    public void initPlayer(GameChar gameChar){
        
        this.setCharName(gameChar.getName());
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
      
    }
      
 }
      
         
         
    
    
    
    
    
    
    

