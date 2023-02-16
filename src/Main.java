/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERHAT ATAŞ
 */
public class Main {

   
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher("FERHAT ATAŞ", "0542 222 22 22", "Matematik");
        Teacher t2 = new Teacher("HAMZA ATAŞ", "0542 222 22 22", "Kimya");
        Teacher t3 = new Teacher("Bilal ATAŞ", "0542 222 22 22", "Tarih");
        
        Course matematik = new Course("matematik", "01", "Mat");
        Course kimya = new Course("kimya", "02", "Kim");
        Course tarih = new Course("tarih","03","Tar");
        
        matematik.addTeacher(t1); kimya.addTeacher(t2); tarih.addTeacher(t3);
        
        Student s1 = new Student("Yalçın Gözüaçık", "101", "1A", tarih, matematik, kimya);
        Student s2 = new Student("Aydın Güler", "102", "1A", tarih, matematik, kimya);
        Student s3 = new Student("Yusuf Büyük", "103", "1A", tarih, matematik, kimya);
        
        s1.addBulkExamNote(50, 80, 100, 50, 100, 100);
        s1.isPass();
        
        s2.addBulkExamNote(50, 40, 30, 100, 45, 80);
        s2.isPass();
        
        s3.addBulkExamNote(49, 60, 78, 88, 58, 10);
        s3.isPass();
        
        
        
        
    }
    
}
