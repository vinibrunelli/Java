package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		
		/*
		 * Capturar
		 * -Nome disciplina
		 * -Nota 1
		 * -Nota 2
		 * -M�dia
		 * -Parab�s somente se > que 6
		 */
		
		String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float media = ((nota1 + nota2) / 2);
		
		if (media >= 6) {
			System.out.println("Sua nota de "+ nomeDisciplina + " foi "+ media +" Parab�ns, voc� foi aprovado!");
		}	else if (media < 4) {
			System.out.println("Sua nota foi " + media + " Voc� foi reprovado!");
		}	else  {
			System.out.println("Sua nota foi " + media + " Exame");
		}
		
		
		// && --> AND
		// || --> OR
		
		
		
		
		
		
		
		
	}
}
