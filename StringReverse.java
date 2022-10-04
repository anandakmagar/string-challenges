
public class StringReverse {
	public static void main(String[] args) {
		String s = "Java is easy";
		
		// split() splits the words inside the string and words get assigned to a new array
		String sArray[] = s.split(" ");
		
		// This loop will check every elements of the array from backward and print with space
		String rev = "";
		for(int i = sArray.length - 1; i >= 0; i--) {
			rev = rev + sArray[i] + " ";
		}
		
		System.out.print(rev);
	}

}

