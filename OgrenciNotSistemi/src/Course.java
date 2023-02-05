
public class Course {
    
    Teacher courseTeacher;
    String name;
    int code;
    String prefix;
    int note;
    
   Course(String name,int code,String prefix){
       
        this.code = code;
        this.name = name;
        this.prefix = prefix;
       
        
  
    }
   void addTeacher(Teacher courseTeacher){
       this.courseTeacher = courseTeacher;
   }
   
   void infoTeacher(){
       
      this.courseTeacher.printTeacher();
   }
    
    
    
   
    
}
