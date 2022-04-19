package Exercicio1;

import javax.swing.JOptionPane;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1= new Funcionario("henrique",1000.00);
		
		//System.out.println("salario: R$" + f1.getSalario());
		//System.out.println("INSS: R$" + f1.calcularInss());
		//System.out.println("vt: R$"+f1.calcularValeTransporte());
		//System.out.println("salario Liquido: R$" + (f1.getSalario()-f1.calcularInss()-f1.calcularValeTransporte()));
		JOptionPane.showMessageDialog(null,(f1.getNome()+"\n salario: R$" + f1.getSalario()+"\n INSS: R$" + f1.calcularInss()+
				"\n vt: R$"+f1.calcularValeTransporte()+ "\n salario Liquido: R$" + (f1.getSalario()-f1.calcularInss()-f1.calcularValeTransporte())));
	}
}
