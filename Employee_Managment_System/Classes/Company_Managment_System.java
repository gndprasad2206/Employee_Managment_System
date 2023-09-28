class CompanyManagementSystem{
  HashMap<Integer,EmployeeDetails> employees=new HashMap<Integer,EmployeeDetails>();
  public void display(EmployeeDetails emp){
    System.out.println();
    System.out.println("Employee Id: "+emp.getEmployeeId());
    System.out.println("Employee Name: "+emp.getName());
    System.out.println("Employee Age: "+emp.getAge());
    System.out.println("Employee gender: "+emp.getGender());
    System.out.println("Employee Salary: "+emp.getSalary());
    System.out.println("Employee Aadhar Number: "+emp.getAadharNumber());
    System.out.println("Employee Mobile Number: "+emp.getMobileNumber());
    System.out.println("Employee Address: "+emp.getAddress());
    System.out.println("Employee City: "+emp.getCity());
    System.out.println("Employee Date Of Birth: "+emp.getDateOfBirth());
  }
  public void addEmployee(EmployeeDetails emp){
    employees.put(emp.getEmployeeId(), emp);
    System.out.println("Added New Employee SucessFully");
  }
  public void allEmployeeDetails(){
    for(EmployeeDetails emp:employees.values()){
      display(emp);
    }
  }
  public void getDetailsWithId(int id){
    int c=0;
    if(employees.isEmpty()){
      System.out.println("Employee Data Base is Empty");
    }
    else{
      for(EmployeeDetails emp:employees.values()){
        if(emp.getEmployeeId()==id){
          c++;
          display(emp);
        }
      }
      if(c==0){
        System.out.println("Employee Id Not Found");
      }
    }
  }
  public void getDetailsWithName(String name){
    int c=0;
    if(employees.isEmpty()){
      System.out.println("Employee Data Base is Empty");
    }
    else{
      for(EmployeeDetails emp:employees.values()){
        if(emp.getName().equalsIgnoreCase(name)){
          c++;
          display(emp);
        }
      }
      if(c==0){
        System.out.println("Employee Name Not Found");
      }
    }
  }
  public void getDetailsWithCity(String city){
    int c=0;
    if(employees.isEmpty()){
      System.out.println("Employee Data Base is Empty");
    }
    else{
      for(EmployeeDetails emp:employees.values()){
        if(emp.getCity().equalsIgnoreCase(city)){
          c++;
          display(emp);
        }
      }
      if(c==0){
        System.out.println("No Employees With This City");
      }
    }
  }
  public void getDetailsWithSalary(double min,double max){
    int c=0;
    if(employees.isEmpty()){
      System.out.println("Employee Data Base is Empty");
    }
    else{
      for(EmployeeDetails emp:employees.values()){
        if(emp.getSalary()>=min && emp.getSalary()<=max){
          c++;
          display(emp);
        }
      }
      if(c==0){
        System.out.println("With This salary range there is No employees");
      }
    }
  }
  public void getDetailsWithAge(int minAge,int maxAge){
    int c=0;
    if(employees.isEmpty()){
      System.out.println("Employee Data Base is Empty");
    }
    else{
      for(EmployeeDetails emp:employees.values()){
        if(emp.getAge()>=minAge && emp.getAge()<=maxAge){
          c++;
          display(emp);
        }
      }
      if(c==0){
        System.out.println("No Employees with this age range");
      }
    }
  }
  public void deleteEmployeeWithId(int id){
    int c=0;
    if(employees.isEmpty()){
      System.out.println("Employee Data Base is Empty");
    }
    else{
      for(EmployeeDetails emp:employees.values()){
        if(emp.getEmployeeId()==id){
          c++;
          display(emp);
          employees.remove(emp.getEmployeeId(), emp);
          System.out.println("Deleted Employee Sucessfully");
        }
      }
      if(c==0){
        System.out.println("Employee id Not Found");
      }
    }
  }
}