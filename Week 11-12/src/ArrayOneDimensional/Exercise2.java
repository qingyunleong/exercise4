package ArrayOneDimensional;

public class Exercise2 {

	public static void main(String[] args) {
		
		//write a statement that declare a string array initialize with the following string: sunday, monday, tuesday, wednesday,thursday, friday, saturday
		//write a loop that display the content of each element in the array that u declared
		
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		// for loop
		for (int i=0; i<days.length; i++) {
			System.out.println(days[i]);
		}
		System.out.println();
		
		//while loop
		System.out.println();
		int j=0;
		while (j<days.length) {
			System.out.println(days[j]);
			j++;
		}
		System.out.println();
		
		//do while
		System.out.println();
		int k=0;
		do {
			System.out.println(days[k]);
			k++;
		}while (k<days.length);
		
		System.out.println();

	}

}
