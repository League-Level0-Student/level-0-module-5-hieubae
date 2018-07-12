import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	
String number =	JOptionPane.showInputDialog(null, "Give me a number.");
	
int prime = Integer.parseInt(number);

//System.out.println(prime);
	
	if (prime % 2 == 0) {
	JOptionPane.showMessageDialog(null, "The number you picked is not prime.");	
	}
	
	else if (prime % 3 == 0){
	JOptionPane.showMessageDialog(null, "The number you picked is prime.");
	}
				
	else {
	JOptionPane.showMessageDialog(null, "The number you picked is prime.");
	}
	
	
}
}
