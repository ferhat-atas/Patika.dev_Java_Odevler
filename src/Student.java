
public class Student {
    
    String name;
    String stuNo;
    String classes;
    Course tarih;
    Course matematik;
    Course kimya;
    boolean isPass;
    double avarage;

    public Student(String name, String stuNo, String classes, Course tarih, Course matematik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.tarih = tarih;
        this.matematik = matematik;
        this.kimya = kimya;
        this.isPass = false;
        
    }
    
    public void addBulkExamNote(int matSozlu, int matYazili, int tarihSozlu, int tarihYazili, int kimyaSozlu, int kimyaYazili){
        
        if (matSozlu>=0 && matSozlu<=100 && matYazili>=0 && matYazili<=100) {
            
            this.matematik.note = (int) (matSozlu*0.20+matYazili*0.80);
            
        }
        
        if (tarihSozlu>=0 && tarihSozlu<=100 && tarihYazili>=0 && tarihYazili<=100) {
            
            this.tarih.note = (int) (tarihSozlu*0.20+tarihYazili*0.80);
            
        }
        
        if (kimyaSozlu>=0 && kimyaSozlu<=100 && kimyaYazili>=0 && kimyaYazili<=100) {
            
            this.kimya.note = (int) (kimyaSozlu*0.20+kimyaYazili*0.80);
            
        }
       
        
    }
    
    public void calcAvarage(){
        
        this.avarage = (this.matematik.note+this.tarih.note+this.kimya.note)/3;
        
    }
    
    public boolean isCheckPass(){
        calcAvarage();
        return this.avarage >55;
    }
    
    public void printNote(){
        System.out.println("*****************************");
        System.out.println("Öğrenci: "+ this.name);
        System.out.println("Öğrenci numarası: "+ this.stuNo);
        System.out.println("Matamatik notu: "+ this.matematik.note);
        System.out.println("Tarih notu: "+ this.tarih.note);
        System.out.println("Kimya notu: "+ this.kimya.note);
    }
    
    public void isPass(){
        
        if (this.kimya.note == 0 || this.matematik.note == 0 || this.tarih.note == 0) {
            
            System.out.println("Notlar tam olarak girilmemiş.");
            
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama: "+ this.avarage);
            
            if (this.isPass) {
                
                System.out.println("Sınıfı geçti.");
                
            } else {
                
                System.out.println("Sınıfta kaldı.");
                
            }
        }
        
        
    }
    
    
    
            
    
    
}
