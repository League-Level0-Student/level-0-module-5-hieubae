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
	
	
	for (int i = 1; i < 501; i++) {
	if (i % 2 == 0) {
	System.out.println(i + " even");
	}
	else {
	System.out.println(i + " odd");
		
	}
	}
	for (int i = 0; i < 778; i++) {
	if (i % 7 == 0) {
	System.out.println(i);
	}
	}
	
	System.out.println();
	
}
}
