package repeticao;

import javax.swing.JOptionPane;

public class DoExemplo {
	public static void main(String[] args) {


		/*
 O Jogador 1 vai colocar o numro e o jogador 2 vai ter que acertar o numero
  -Miss�o 1 -> De dicas (alto ou baixo)
  -Miss�o 2 -> acrescentar na msg parabens, qnts tentativas ate acerto

  Dica vai ter que ter uma variavel para contar
		 */
		int player1 = 0;
		int player2 = 0;
		int tentativa =0;

		do {
			tentativa = tentativa + 1 ;
			if (player2>player1) {
				player1 = Integer.parseInt(JOptionPane.showInputDialog("Player 1 \nEntre com um numero"));
				player2 = Integer.parseInt(JOptionPane.showInputDialog("Player 2 \nAdvinhe o numero"));
				System.out.println("Chute mais baixo");
			}else {
				player1 = Integer.parseInt(JOptionPane.showInputDialog("Player 1 \nEntre com um numero"));
				player2 = Integer.parseInt(JOptionPane.showInputDialog("Player 2 \nAdvinhe o numero"));
				System.out.println("Chute mais alto");
			} 
		}	while (player1 != player2);

			System.out.println("Parab�sn voc� acertou na " + tentativa + " vez!!!");




			/* *
		do {
			numero1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero 1"));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero 1"));
			operacao = JOptionPane.showInputDialog("Entre com a opera��o:");
			if (operacao.equals("+") == true) {
				System.out.println("Resultado: " + (numero1 + numero2));				
			}else if (operacao.equals("-")) {
				System.out.println("Resultado: " + (numero1 - numero2));
			}else if (operacao.equals("*")) {
				System.out.println("Resultado: " + (numero1 * numero2));
			}else if (operacao.equals("/")) {
				System.out.println("Resultado: " + (numero1 / numero2));
			}else {
				System.out.println("Voc� n�o digitou um caracter permitido.");
			}
		resp =JOptionPane.showInputDialog("Deseja continuar?");
		}while (resp.equals("S"));
			 */







		}
	}
