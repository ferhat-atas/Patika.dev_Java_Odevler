
public class Student {
    
    Course tarih;
    Course matematik;
    Course kimya;
    String name;
    String stuNo;
    String classes;
    double avarage;
    

    public Student(Course tarih, Course matematik, Course kimya, String name, String stuNo, String classes) {
        this.tarih = tarih;
        this.matematik = matematik;
        this.kimya = kimya;
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        
    }
    
    void infoStudent(){
        System.out.println("********************************");
        System.out.println("Adı; "+name);
        System.out.println("Öğrenci Numarası: "+stuNo);
        System.out.println("Sınıfı: "+classes);
        System.out.println("Tarih notu: "+ this.tarih.note);
        System.out.println("Matematik notu: "+this.matematik.note);
        System.out.println("Kimya notu: "+this.kimya.note);
        
    }
    
    public void addBulkExamNote(int tarih, int matematik, int kimya){
        if (tarih>=0 && tarih<=100) {
            this.tarih.note = tarih;
            
        }
        if (matematik>=0 && matematik<=100) {
            this.matematik.note = matematik;
            
        }
        if (kimya>=0 && kimya<=100) {
            this.kimya.note = kimya;
            
        }
  
    }
    
    public void calcAvarage(){
        this.avarage =(this.tarih.note + this.matematik.note + this.kimya.note)/3;
        
    }
    
    public void isPass(){
        calcAvarage();
        
        if (this.tarih.note == 0 || matematik.note == 00 || kimya.note == 00) {
            infoStudent();
            System.out.println("Notlar tam olarak girilmemiş");
            System.out.println("********************************");
            
        }else if (this.avarage > 55) {
            infoStudent();
            System.out.println("Ortalaması: "+this.avarage+ " Sınıfı geçti");
            System.out.println("********************************");
            
        }else{
            infoStudent();
            System.out.println("Ortalaması: "+this.avarage+" Sınıfta kaldı.");
            System.out.println("********************************");
        }
        
        
    }
   


    
    
    
    
            
            
    
}
