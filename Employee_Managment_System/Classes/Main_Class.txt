public class EmployeeDataManagement{
  public static void main(String[] args) throws Exception{
    Scanner sc=new Scanner(System.in);
    CompanyManagementSystem cm=new CompanyManagementSystem();
    while(true){
      System.out.println();
      System.out.println("*******Employee Management System*******\n1.Add Employee\n2.Display All Employee Details\n3.Get Employee With Id\n4.Get Employee With Name\n5.Get Employees With City\n6.Get Employees with Salary Range\n7.Get Employees With Age\n8.Delete Employee By ID\n9.Quit\nSelect One Option");
      try{
        int option1=sc.nextInt();
        if(option1>0&&option1<=9){
          
        }
        else{
          try{
          throw new InvalidOptionSelected("InvalidOptionSelected");
          }
          catch(InvalidOptionSelected e){
            System.out.println("Exception: "+e.getMessage());
          }
        }
      switch(option1){
        case 1:
          sc.nextLine();
          System.out.print("Entre Name: ");
          String name=sc.nextLine();
          
          System.out.print("Enter Age: ");
          int age=sc.nextInt();
          try{
            if(age<0)
              throw new InvalidAgeValue("For Age Negative Value is Not Valid");
          }
          catch(InvalidAgeValue e){
            System.out.println("Exception: "+e.getMessage());
          }
          sc.nextLine();
          System.out.print("Enter Gender: ");
          String gender=sc.nextLine();
          
          System.out.print("Enter Slaray: ");
          double salary=sc.nextDouble();
          System.out.print("Enter aadhar Number: ");
          long aadharNumber=sc.nextLong();
          if(100000000000l <=aadharNumber && 999999999999l>=aadharNumber){
            aadharNumber=aadharNumber;
          }
          else{
            try{
              throw new InvalidAadharNumber("Invalid Aadhar Number");
            }
            catch(InvalidAadharNumber e){
              System.out.println("Exception: "+e.getMessage());
            }
          }
          System.out.print("Enter Mobile Number: ");
          long mobileNumber=sc.nextLong();
          if(1000000000l<=mobileNumber && 9999999999l>=mobileNumber){
            mobileNumber=mobileNumber;
          }
          else{
            try{
              throw new InvalidMobileNumber("InvalidMobileNumber");
            }
            catch(InvalidMobileNumber e){
              System.out.print("Exception: "+e.getMessage());
            }
          }
          sc.nextLine();
          System.out.print("Enter Address: ");
          String address=sc.nextLine();
          System.out.print("Enter City: ");
          String city=sc.nextLine();
          System.out.print("Enter the Date Of Birth: ");
          String str=sc.nextLine();
          DateFormat df=new SimpleDateFormat("DD-MM-YYYY");
          Date dateOfBirth=df.parse(str);
          EmployeeDetails emp=new EmployeeDetails(name,age,gender,salary,aadharNumber,mobileNumber,address,city,dateOfBirth);
          cm.addEmployee(emp);
          break;
        case 2:
          cm.allEmployeeDetails();
          break;
        case 3:
          System.out.print("Enter Id: ");
          int id=sc.nextInt();
          cm.getDetailsWithId(id);
          break;
        case 4:
          sc.nextLine();
          System.out.print("Enter Name: ");
          String name1=sc.nextLine();
          cm.getDetailsWithName(name1);
          break;
        case 5:
          sc.nextLine();
          System.out.print("Enter City: ");
          String city1=sc.nextLine();
          cm.getDetailsWithCity(city1);
          break;
        case 6:
          System.out.print("Enter Min Salary: ");
          double minSalary=sc.nextDouble();
          System.out.print("Enter Max Salary: ");
          double maxSalary=sc.nextDouble();
          cm.getDetailsWithSalary(minSalary, maxSalary);
          break;
        case 7:
          System.out.print("Enter Min Age: ");
          int minAge=sc.nextInt();
          System.out.print("Enter MAx Age: ");
          int maxAge=sc.nextInt();
          break;
        case 8:
          System.out.print("Enter Id: ");
          int id1=sc.nextInt();
          cm.deleteEmployeeWithId(id1);
          break;
        case 9:
          System.out.println("Shut Down......");
          System.exit(0);
      }
      }
      catch(InputMismatchException e){
        System.out.println("Exception: "+e.getMessage());
        System.exit(0);
      }
    }
  }
}