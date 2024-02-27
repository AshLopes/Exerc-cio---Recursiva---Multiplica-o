package prjMult;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		MetRecursivaEx01 met = new MetRecursivaEx01();
		int num1 , num2;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		JOptionPane.showMessageDialog(null,"O resultado é: "+met.multiplicaSoma(num1, num2));
	}

}
