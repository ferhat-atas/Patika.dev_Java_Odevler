
public class Course {
    
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        
    }
    
    public void addTeacher(Teacher teacher){
        
        this.teacher = teacher;
        
    }
    
    public void printTeacher(Teacher teacher){
        
        System.out.println("Adı: "+ this.teacher.name);
        System.out.println("Telefon numarası: "+ this.teacher.mpno);
        System.out.println("Bölümü: "+ this.teacher.branch);
        
    }
    
    
}
