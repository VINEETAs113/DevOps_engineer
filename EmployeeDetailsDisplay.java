public class EmployeeDetailsDisplay  {

    String employeeName;
    int employeeID;
    double employeeSalary;

        public EmployeeDetailsDisplay(String employeeName,int employeeID,double employeeSalary){
       this.employeeName = employeeName;
       this.employeeID = employeeID;
       this.employeeSalary = employeeSalary;
        }

        public void displayDetails(){
            System.out.println("\nEmployee Details:");
            System.out.println("Name: " + employeeName);
            System.out.println("ID: " + employeeID);
            System.out.println("Salary:" + employeeSalary);
    

        }
       


        public static void main(String[] args) {
            EmployeeDetailsDisplay emp = new EmployeeDetailsDisplay("Vineeta",1234,45000);
            emp.displayDetails();
            

           
        }

       
        }



    
    
