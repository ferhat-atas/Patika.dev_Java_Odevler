



public class Employee {
    
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    int tax(){
        
        if (this.salary > 1000) {
            
           return (int) (salary*0.03); 
        }
        return 0;
    }
    
    
    int bonus(){
        
        if (this.workHours > 40) {
            
            return (this.workHours-40)*30;
            
        }
        
        return 0;
    }
    
    int raiseSalary(){
        
        if (2021-this.hireYear < 10) {
            
            return (int) (this.salary*0.05);
            
        }else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20 ) {
            
            return (int) (this.salary*0.1);
        }else{
            
            return (int) (this.salary*0.15);
        }
            
        
        
    }
    
    void toPrint(){
        System.out.println("************************");
        System.out.println("İsim Soyisim: "+ this.name);
        System.out.println("İşe Başlangıç Tarihi: "+ this.hireYear);
        System.out.println("Haftalık Çalışma Saati: "+ this.workHours);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Vergi: "+ tax());
        System.out.println("Bonus: "+ (bonus()));
        System.out.println("Maaş Artış Oranı: "+(raiseSalary()));
        System.out.println("Net Maaş: "+ (this.salary+bonus()+raiseSalary()-tax())+" TL");
        
        
        
        
        
    }
}
