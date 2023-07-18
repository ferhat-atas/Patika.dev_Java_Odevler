
public class ToolStore extends Normalloc{

    public ToolStore(Player player) {
        super(player, "Mağaza");
    }
    
    
    @Override
    public boolean onLocation(){
        
        System.out.println("--- Mağazaya hoş geldiniz. ---");
        System.out.println("1. Silahlar");
        System.out.println("2. Zırhlar");
        System.out.println("3. Çıkış yap");
        System.out.print("Seçiminiz: ");
        int selectCase = sc.nextInt();
        while (selectCase<1 || selectCase>3) {       
            System.out.print("Geçersiz değer. Tekrar giriniz: ");
            selectCase = sc.nextInt();
            
        }
        
        switch(selectCase){
            case 1:
                printWeapon();
                buyWeapon();
            case 2:
                printArmor();
            case 3:
                System.out.println("Bir daha bekleriz.");
                return true;
                
                
        }
        return true;
    }
    
    public void printWeapon(){
        System.out.println("---------Silahlar---------");
        System.out.println();
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId()+"-"+w.getName()+" Para: " + w.getPrice() + " ,Hasar: " + w.getDamage()+" ");
            
        }
        
        
    }
    public void buyWeapon(){
        System.out.print("Bir silah seçiniz: ");
        int selectWeaponID = sc.nextInt();
        while (selectWeaponID < 1 || selectWeaponID > Weapon.weapons().length){
            System.out.print("Geçersiz değer, tekrar giriniz: ");
            selectWeaponID = sc.nextInt();
        }
        
        Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);
        
        if (selectedWeapon != null) {
            if (selectedWeapon.getPrice() > this.getPleyer().getMoney()) {
                System.out.println("Yeterli paranız bulunmamaktadır!");
                
            }else{
                System.out.println(selectedWeapon.getName() + " silahını satın aldınız!");
                int balance = this.getPleyer().getMoney() - selectedWeapon.getPrice();
                this.getPleyer().setMoney(balance);
                System.out.println("Kalan paranız: "+ this.getPleyer().getMoney());
                System.out.println("Önceki silahınız: "+ this.getPleyer().getInventory().getWeapon().getName());
                this.getPleyer().getInventory().setWeapon(selectedWeapon);
                System.out.println("Yeni Silahınız: "+ this.getPleyer().getInventory().getWeapon().getName());
            }
            
        }
        
    }
    
    public void printArmor(){
        System.out.println("---------Zırhlar----------");
    }
}
