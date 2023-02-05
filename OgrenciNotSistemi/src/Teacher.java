
public class Teacher {
    
    
    String name;
    String mpno;
    String branch;
    
    Teacher(String name,String mpno,String branch){
        
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
                
    }
    
    void printTeacher(){
        
        System.out.println("Öğretmen: "+ name);
        System.out.println("Bölüm: "+ branch);
        System.out.println("Telefon no: "+ mpno);
    }
            
    
}
