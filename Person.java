
public class Person {
	int pid;
	String pname;
	
	Person(int pid, String pname){
		this.pid = pid;
		this.pname = pname;
	}
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + "]";
	}

	public static void main(String[] args) {
		// This is an array that stores the Person objects
		Person[] personArray = new Person[10];
		
		// This will save the objects declared in the array
		personArray[0] = new Person(1, "ananda");
		personArray[1] = new Person(2, "David");
		personArray[2] = new Person(3, "Bernie");
		personArray[3] = new Person(4, "Jayant");
		personArray[4] = new Person(5, "Nag");
		personArray[5] = new Person(6, "Abigail");
		personArray[6] = new Person(7, "jan");
		personArray[7] = new Person(8, "Gregory");
		personArray[8] = new Person(9, "Deeksha");
		personArray[9] = new Person(10, "Chris");
		
		// This loop will check if the character at index 0 (name starts with) is a, A, j, or J
		for(int i = 0; i < personArray.length; i++) {
			if(personArray[i].pname.charAt(0) == 'a' || 
					personArray[i].pname.charAt(0) == 'A' || 
					personArray[i].pname.charAt(0) == 'j' ||
					personArray[i].pname.charAt(0) == 'J') {
				
				System.out.println(personArray[i].toString());
			}
		}
	}
	
	
	

}
