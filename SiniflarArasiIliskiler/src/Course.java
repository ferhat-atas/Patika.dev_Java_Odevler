
public class Course {
    
    private String courseName;
    private String code;
    private Instructor instructor;
    
    public Course(String courseName, String code, Instructor instructor){
        
        this.courseName = courseName;
        this.code = code;
        this.instructor = instructor;
    }
    
    public String getCourseName(){
        return this.courseName;
        
    }
    
    public void setCourseName(String courseName){
        this.courseName = courseName;
        
    }
    
    public String getCode(){
        return this.code;
        
    }
    
    public void setCode(String code){
        this.code = code;
        
    }
    
    public double calcAvarage(Student[] students){
        
        double avarage = 0;
        for (Student student : students) {
            avarage += student.getNote();
        }
        return avarage/students.length;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    
}
