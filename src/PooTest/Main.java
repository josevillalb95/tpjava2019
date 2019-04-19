package PooTest;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operaciones op = new Operaciones();
		int num1= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del numero 1"));
		int num2= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del numero 2"));
		op.ingresar(num1,num2);
		op.suma();
				
	}

}
