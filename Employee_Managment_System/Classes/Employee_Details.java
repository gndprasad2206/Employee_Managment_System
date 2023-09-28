class EmployeeDetails{
  private static int nextId=1;
  private int employeeId;
  private String name;
  private int age;
  private String gender;
  private double salary;
  private long aadharNumber;
  private long mobileNumber;
  private String address;
  private String city;
  private Date dateOfBirth;
  public EmployeeDetails(String name,int age,String gender,double salary,long aadharNumber,long mobileNumber,String address,String city,Date dateOfBirth){
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.salary=salary;
    this.aadharNumber=aadharNumber;
    this.mobileNumber=mobileNumber;
    this.address=address;
    this.city=city;
    this.dateOfBirth=dateOfBirth;
    employeeId=nextId++;
  }
public int getEmployeeId() {
	return employeeId;
}
/*public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}*/
public String getName() {
	return name;
}
/*public void setName(String name) {
	this.name = name;
}*/
public int getAge() {
	return age;
}
/*public void setAge(int age) {
	this.age = age;
}*/
public String getGender() {
	return gender;
}
/*public void setGender(String gender) {
	this.gender = gender;
}*/
public double getSalary() {
	return salary;
}
/*public void setSalary(double salary) {
	this.salary = salary;
}*/
public long getAadharNumber() {
	return aadharNumber;
}
/*public void setAadharNumber(long aadharNumber) {
	this.aadharNumber = aadharNumber;
}*/
public long getMobileNumber() {
	return mobileNumber;
}
/*public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}*/
public String getAddress() {
	return address;
}
/*public void setAddress(String address) {
	this.address = address;
}*/
public String getCity() {
	return city;
}
/*public void setCity(String city) {
	this.city = city;
}*/
public Date getDateOfBirth() {
	return dateOfBirth;
}
/*public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}*/
  
}