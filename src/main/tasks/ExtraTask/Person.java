package ExtraTask;

public class Person {
	String firstName;
	String lastName;
	int age;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0 || age>100) {
			this.age =0;
		}else {
		this.age = age;}
	}
	
	public  boolean isTeen (){
		if (age>12 && age <20) {
			return true;
		}else {
		return false;
		}	
	}
	
	public  String getFullName(){
		String fullName;
		if(firstName.isEmpty() && lastName.isEmpty()) {
			fullName="";
			return fullName;	
		}else if(firstName.isEmpty() || firstName == null ) {
			firstName=null;
			return lastName;
		}else if (lastName.isEmpty() || lastName == null) {
			lastName=null;
			return firstName;
		}
		return firstName+lastName;
	}
	
}


