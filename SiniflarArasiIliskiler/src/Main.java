
public class Main {

    
    
    
    public static void main(String[] args) {
        
        
        Student st1 = new Student("Hamza", "Ataş", "001", "Ataş Malikanesi",80);
        Student st2 = new Student("Bilal", "Ataş", "002", "Ataş Malikanesi",80);
        Student st3 = new Student("Mehmet","Ataş", "003", "Ataş Malikanesi",80);
        st1.setNote(80);
        Instructor teacher = new Instructor("Mahmut", "Hoca", "Matematik");
        
        Course course = new Course("Matematik", "0001",teacher);
        Student[] mat = {st1,st2,st3};
        System.out.println("Matematik Ortalama: "+course.calcAvarage(mat));
        System.out.println(st1.getName()+" Not: "+ st1.getNote());
        System.out.println("Matematik Hocası: "+ course.getInstructor().getName());
    }
    
}
