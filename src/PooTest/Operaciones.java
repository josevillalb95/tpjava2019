package PooTest;
import	javax.swing.JOptionPane;

public class Operaciones {
	private int numero1;
	private int numero2;
	private int suma;
	
	public void ingresar(int a ,int b){
		numero1=a;
		numero2=b;
	}
	public void suma(){
		suma=numero1+numero2;
		System.out.println("la suma es: "+suma);
	}

}
