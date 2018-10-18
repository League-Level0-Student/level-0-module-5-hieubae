import javax.swing.JOptionPane;

public class ForLoopThanosGauntlet {
	public static void main(String[] args) {

		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}

		for (int i = 100; i > -1; i--) {
			System.out.println(i);
		}

		for (int i = 2; i < 101; i += 2) {
			System.out.println(i);
		}

		for (int i = 1; i < 100; i += 2) {
			System.out.println(i);
		}

		for (int i = 1; i < 501; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " even");
			} else {
				System.out.println(i + " odd");

			}
		}
		for (int i = 0; i < 778; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 2005; i < 2019; i++) {
			System.out.println("In the year " + i + ", I was " + (i - 2005) + " years old.");
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
			System.out.println(i + " " + j);
			}
		}
		
		for (int i = 1; i < 10; i+=3) {
			for (int j = 0; j < 3; j++) {
			System.out.print(i+j);
			}
			System.out.println();
		}
		
		for (int i = 1; i < 101; i+=10) {
			for (int j = 0; j < 10; j++) {
			System.out.print(i+j+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
	}
}
