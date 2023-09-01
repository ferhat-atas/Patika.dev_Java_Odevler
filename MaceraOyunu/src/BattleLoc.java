
import java.util.Random;


public class BattleLoc extends Location {
    
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    

    public BattleLoc(Player player, String name,Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();
        System.out.println("Şuan buradasınız: "+this.getName());
        System.out.println("Dikkatli ol! Burada "+obsNumber+" tane "+this.getObstacle().getName()+" yaşıyor!");
        System.out.print("<S>avaş veya <K>aç: ");
        String selectCase = sc.nextLine();
        selectCase = selectCase.toUpperCase();
        if (selectCase.equals("S")&&combat(obsNumber)) {
            if (combat(obsNumber)) {
                System.out.println(this.getName()+" tüm düşmanları yendiniz.");
                return true;
                
                
            }
           
            
        }
        
        if (this.getPleyer().getHealth() <= 0) {
            System.out.println("Öldünüz! ");
           return false;
        }
        
        return true;
    }
    
    public boolean combat(int obsNumber){
        for (int i = 0; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOrjinalHealth());
            playerStats();
            obstacleStats(i);
            
            while(this.getPleyer().getHealth()>0 && this.getObstacle().getHealth()>0){
                System.out.println("<V>ur veya <K>aç: ");
                String selectCombat = sc.nextLine().toUpperCase();
                if (selectCombat.equals("V")) {
                    System.out.println("Siz vurdunuz! ");
                    this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPleyer().getTotalDamage());
                    afterHit();
                    if (this.getObstacle().getHealth()  > 0) {
                        System.out.println();
                        System.out.println("Canavar size vurdu! ");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPleyer().getInventory().getArmor().getBlock();
                        if (obstacleDamage < 0) {
                            obsNumber = 0;
                            
                        }
                        this.getPleyer().setHealth(this.getPleyer().getHealth()-obstacleDamage);
                        afterHit();
                                
                    }
                    
                }else{
                    return false;
                }
            }
            
            if (this.getObstacle().getHealth()< this.getPleyer().getHealth()) {
                System.out.println("Düşmanı yendiniz! ");
                System.out.println(this.getObstacle().getAvard()+ " para kazandınız1");
                this.getPleyer().setMoney(this.getPleyer().getMoney()+ this.getObstacle().getAvard());
                System.out.println("Güncel paranız: "+ this.getPleyer().getMoney());
                 
                
            }else{
                return false;
            }
 
        }
        return true;
    }
    
    public void afterHit(){
        System.out.println("Canınız: "+ this.getPleyer().getHealth());
        System.out.println(this.getObstacle().getName() +" Canı: "+ this.getObstacle().getHealth());
        System.out.println("");
    }
    
    public void playerStats(){
        System.out.println("Oyuncu Değerleri");
        System.out.println("----------------------------");
        System.out.println("Sağlık: "+ this.getPleyer().getHealth());
        System.out.println("Silah: "+this.getPleyer().getInventory().getWeapon().getName());
        System.out.println("Hasar: "+this.getPleyer().getTotalDamage());
        System.out.println("Zırh: "+this.getPleyer().getInventory().getArmor().getName());
        System.out.println("Bloklama: "+this.getPleyer().getInventory().getArmor().getBlock());
        System.out.println("Para: "+this.getPleyer().getMoney());
    }
    
    public void obstacleStats(int i){
        System.out.println((i+1) + ". "+this.getObstacle().getName()+" Değerleri");
        System.out.println("----------------------------");
        System.out.println("Sağlık: "+ this.getObstacle().getHealth());
        System.out.println("Hasar: "+ this.getObstacle().getDamage());
        System.out.println("Ödül: "+ this.getObstacle().getAvard());
        
    }
    
    public int randomObstacleNumber(){
        
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()+1);
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
    
    
    // VİDEO 34.35 DE KALDI
    
}
