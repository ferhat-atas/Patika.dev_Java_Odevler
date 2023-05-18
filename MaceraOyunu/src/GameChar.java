
public abstract class GameChar {
    
    private int health;
    private int damage;
    private int money;

    public GameChar(int health, int damage, int money) {
        this.health = health;
        this.damage = damage;
        this.money = money;
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
    
    
    
}
