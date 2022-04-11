class Employee
  {
       int r;
       String n;
       int p;
       String des;
       String dep;
    
       Employee(int record_id,String Name,int ph_Number,String Designation,String Department)
       {
              r = record_id;
              n= Name;
              p = ph_Number;
              des = Designation;
              dep = Department;
       }

       void display()
        {
            System.out.println(r+"\t\t"+n+"\t\t"+p+"\t\t"+des+"\t\t"+dep);
        }
    
        public static void main(String[] args)
         {
             Employee ob1 = new Employee(01,"Aromal",623898560,"HOD","MCA");
             Employee ob2 = new Employee(02,"Akshay",753467876,"Staff","MCA");
             Employee ob3 = new Employee(03,"Akash",856565448,"staff","MBA");
             Employee ob4 = new Employee(04,"Lekshmi",959834679,"Staff","MBA");
             Employee ob5 = new Employee(05,"Abhirami",65445649,"staff","Btech");
             Employee ob6 = new Employee(06,"Kiran",754474995,"staff","MCA");
             Employee ob7 = new Employee(07,"Aparna",754474997,"staff","MCA"); 
             ob1.display();
             ob2.display();
             ob3.display();
             ob4.display();
             ob5.display();
             ob6.display();      
             ob7.display();
         }
       
  } 