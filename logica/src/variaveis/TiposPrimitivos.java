package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
	
	/*
	 * Regras para identificadores
	 * 1� n�o usar�s palavras reservadas da linguagem(public);
	 * 2� n�o come�ar�s com n�meros(1time);
	 * 3� n�o utilizar�s caracteres especiais
	 * 
	 * Padr�es (Opcionais)
	 * 1� Use nomes significativos ("nome" e n�o "x")
	 * 2� Padr�o CamelCase (segundaPalavra)
	 * 3� Variaveis/metodos come�am com minuscula
	 * 4� Classes come�a com letra maiscula
	 */
		
		/*
		*String time1 = "ABC";
		*String time2 = "XPTO";
		*double entrada = 100.0;
		*int publico = 15000;
		*double total = entrada*publico;
		*System.out.printf("No jogo do %s x %s foi arrecadado R$ %.2f", time1 ,time2 ,total );
		*/
		
		//JOptionPane � uma classe importada (Ctrl+Shift+O) adiciona ele no inicio
		String time1 = JOptionPane.showInputDialog("Digite o time 1");
		String time2 = JOptionPane.showInputDialog("Digite o time 2");
		//Metodo s� retorna string, metodo parseDouble remove o "" de uma string para virar double
		double entrada = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da entrada"));
		//Metodo para parsear integer
		int publico = Integer.parseInt(JOptionPane.showInputDialog("Digite o publico"));
		/* Classe Wrapper apoiam os tipos primitivos
		 * boolean -> T or F
		 * char	-> armazena somente o ASC ( o numero do caracter '127') 
		 * ===========	
		 * byte --> de -128 � 127
		 * short --> de -32768 a 32768
		 * int --> -2 trilhoes a 9 trilh�es
		 * long --> 9 quintilh�es
		 * ===========
		 * float --> pouca precis�o (6 casas decimais)
		 * double --> Dobro de precis�o nas casas decimais
		 */
		
		double total = entrada*publico;
		System.out.printf("O total arrecadado foi de %.2f", total);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
