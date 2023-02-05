



public class Main {

    
    public static void main(String[] args) {
      
        
        Teacher c1 = new Teacher("Kel Mahmut", "00000", "TRH");
        Course tarih = new Course("Tarih", 0012, "TRH");
        tarih.addTeacher(c1);
       
        
        Teacher c2 = new Teacher("Şener Şen", "00001", "MAT");
        Course matematik = new Course("Matematik", 0013, "MAT");
        matematik.addTeacher(c2);
        
        Teacher c3 = new Teacher("Badi Ekrem", "00002", "KİM");
        Course kimya = new Course("Kimya", 0014, "KİM");
        kimya.addTeacher(c3);
        
        
       Student s1 = new Student(tarih, matematik, kimya, "Mehmet Yiğit", "00001", "02");
       s1.addBulkExamNote(55, 55, 59);
       s1.isPass();
       
       Student s2 = new Student(tarih, matematik, kimya, "Salih Soluk", "00002", "04");
       s2.addBulkExamNote(20, 40, 59);
       s2.isPass();
       
       Student s3 = new Student(tarih, matematik, kimya, "Yakup Güleç", "00003", "03");
       s3.addBulkExamNote(80, 100, 85);
       s3.isPass();
       
       
       
       
        
       
    }
    
}
