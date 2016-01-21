import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Binary Number: ");
		String input = scan.nextLine();
		char [] c = input.toCharArray();
		int o = binary2decimal(c);
		System.out.println("The binary number " + input + " has decimal value: " + o);
	}
	
	public static int binary2decimal(char[] c){
		char one = '1';
		double output = 0;
		int p = 0;
		for(int i = (c.length - 1); i >= 0; i--){
			if(c[i] == one){
				output = output + (Math.pow(2, p));
			}
			p++;
		}
		return (int) output;
	}

}
