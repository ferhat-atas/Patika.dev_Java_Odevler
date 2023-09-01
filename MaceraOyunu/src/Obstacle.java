
public class Obstacle {
    private int id;
    private String name;
    private int damage;
    private int health;
    private int avard;
    private int orjinalHealth;

    public Obstacle(int id, String name, int damage, int health, int award) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.orjinalHealth = health;
        this.avard = award;
    }
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            health = 0;
            
        }
        this.health = health;
    }

    public int getAvard() {
        return avard;
    }

    public void setAvard(int avard) {
        this.avard = avard;
    }

    public int getOrjinalHealth() {
        return orjinalHealth;
    }

    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }
    
    
    
}
