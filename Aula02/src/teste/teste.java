package teste;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class teste {

    public static void main(String[] args) {
        int[] altura = null, peso = null;
        int maiorPeso, maisAlto;
        String[] nome = null; 
        for (int i = 0; i <= 4; i++) {

            nome[i] = JOptionPane.showInputDialog("Qual o seu nome? ");
            altura[i] = Integer.parseInt(JOptionPane.showInputDialog("Qaul a sua altura?"));
            peso[i] = Integer.parseInt(JOptionPane.showInputDialog("Qaul o seu peso?"));

        }
    }
}