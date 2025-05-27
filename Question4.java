package question.pkg4;

//@author Sabelwe
 
public class Question4
{
    public static void main(String[] args) {
      Manager boss=new Manager("Grace",43000,2016,3,12);
      boss.setBonus(5000);
      
      Employee[]staff=new Employee[3];
      
      staff[0]=boss;
      staff[1]=new Employee("Thabo",3100,2018,11,23);
      staff[2]=new Employee("Given",10000,2016,7,12);
    
      for(Employee e: staff)
        System.out.println("Name= " + e.getName() + ",Salary= " + e.getSalary());
    }
}