package RESTBDDTests;

public class EmployeeClassForSerializationDeSerialization {

	
	public String FirstName;
	public String Lastname;
	public String UserName;
	public String Password;
	public String Email;
	
	//if there is a multi value node like courses, we can use List
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public String getEmployeeRecord()
	{
		return FirstName+" "+Lastname+" "+UserName+" "+Password+" "+Email+" ";
	}
	
	
	
}
