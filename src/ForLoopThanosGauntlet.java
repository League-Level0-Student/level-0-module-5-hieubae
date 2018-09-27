import javax.swing.JOptionPane;

public class ForLoopThanosGauntlet {
public static void main(String[] args) {

	
	for (int i = 0; i < 101; i++) {
	System.out.println(i);
	}
	
	for (int i = 100; i > -1; i--) {
	System.out.println(i);
	}
	
	for (int i = 2; i < 101; i+=2) {
	System.out.println(i);
	}
	
	for (int i = 1; i < 100; i+=2) {
	System.out.println(i);
	}
	
	
	for (int i = 0; i < 500; i++) {
	if (i % 3 == 0) {
	System.out.println("	odd");
	}
	System.out.println(i);
	
	}
	
	
	
}
}
