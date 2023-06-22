
public class ToolStore extends Normalloc{

    public ToolStore(Player player) {
        super(player, "Mağaza");
    }
    
    
    @Override
    public boolean onLocation(){
        
        System.out.println("Mağazaya hoş geldiniz.");
        return true;
    }
}
