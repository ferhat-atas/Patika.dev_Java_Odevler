
public class ToolStore extends Normalloc {

    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {

        System.out.println("--- Mağazaya hoş geldiniz. ---");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("1. Silahlar");
            System.out.println("2. Zırhlar");
            System.out.println("3. Çıkış yap");
            System.out.print("Seçiminiz: ");
            int selectCase = sc.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.print("Geçersiz değer. Tekrar giriniz: ");
                selectCase = sc.nextInt();

            }

            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;

                case 3:
                    System.out.println("Bir daha bekleriz.");

                    showMenu = false;
                    break;

            }

        }
        return true;
    }

    public void printWeapon() {
        System.out.println("---------Silahlar---------");
        System.out.println();
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + "-" + w.getName() + " Para: " + w.getPrice() + " ,Hasar: " + w.getDamage() + " ");

        }
        System.out.println("0 - Çıkış yap");

    }

    public void buyWeapon() {
        System.out.print("Bir silah seçiniz: ");
        int selectWeaponID = sc.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Geçersiz değer, tekrar giriniz: ");
            selectWeaponID = sc.nextInt();
        }
        if (selectWeaponID != 0) {

            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPleyer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır!");

                } else {
                    System.out.println(selectedWeapon.getName() + " silahını satın aldınız!");
                    int balance = this.getPleyer().getMoney() - selectedWeapon.getPrice();
                    this.getPleyer().setMoney(balance);
                    System.out.println("Kalan paranız: " + this.getPleyer().getMoney());
                    System.out.println("Önceki silahınız: " + this.getPleyer().getInventory().getWeapon().getName());
                    this.getPleyer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Yeni Silahınız: " + this.getPleyer().getInventory().getWeapon().getName());
                }

            }

        }

    }

    public void printArmor() {
        System.out.println("---------Zırhlar----------");
        System.out.println();
        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + "-" + a.getName() + " Para: " + a.getPrice() + " Block: " + a.getBlock());

        }
        System.out.println("0 - Çıkış yap");
    }

    public void buyArmor() {

        System.out.print("Bir zırh seçiniz: ");
        int selectArmorID = sc.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.print("Geçersiz değer, tekrar giriniz: ");
            selectArmorID = sc.nextInt();
        }
        if (selectArmorID != 0) {

            Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);

            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPleyer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır!");

                } else {
                    System.out.println(selectedArmor.getName() + " zırhını satın aldınız.");
                    int balance = this.getPleyer().getMoney() - selectedArmor.getPrice();
                    this.getPleyer().setMoney(balance);
                    System.out.println("Kalan paranız: " + this.getPleyer().getMoney());
                    System.out.println("Önceki zırhınız: " + this.getPleyer().getInventory().getArmor().getName());
                    this.getPleyer().getInventory().setArmor(selectedArmor);
                    System.out.println("Yeni zırhınız: " + this.getPleyer().getInventory().getArmor().getName());
                }

            }
        }

    }
}
