package variaveis;

public class TiposDados {
	/*
	 * Tipos de dados:
	 * 
	 * Alfanum�ricos:
	 * 		N�o n�o utilizado em calculo matem�tico
	 * 		- String --> (Javan�s)
	 * 
	 * Num�ricos:
	 *		Utilizado em calculos matem�ticos
	 *		
	 *		- double --> Com casas decimais 
	 *		- int --> Sem casas decimais 
	 *
	 *O processamento do numerico � muito mais rapido 
	 *pq s� vai de "0-9.,-", enquanto alfa pode ser qlqr coisa
	 *
	 *
	 *<tipo> <nome> = <valor>
	 */

//Metodo main --> Significa que deve ser executado
// toda aplica��o deve ter no minimo 1 main (start point da app)
//args � a unica palavra que pode ser diferente
// Digitar "main" e Ctrl+space+enter --> cria sozinho o main	
//Todo metodo deve retornar algo no console, exceto main que tem void e pode nao retornar nada
	public static void main(String[] args) {
//		System.out.print("Ol� mundo!!!");
		
		String nome = "Vinicius";
		int idade = 30;
		double altura = 1.71;
		double peso = 70;
		double imc = peso / (altura * altura);
		
		System.out.println("Nome..: "+ nome );
		System.out.println("Idade.: "+idade);
		System.out.print("Altura: "+altura);
		System.out.println("Sem pular linha: "+altura);
		System.out.println("Tud�o"+nome+idade+altura+peso);
		System.out.println("IMC...:"+imc);
		System.out.printf("IMC...: %.2f\n" ,imc);
		System.out.printf("Ol� %s seu IMC eh %2f\n",nome,imc);
	}

	
	
	
	
	
/*Alto n�vel + proxima da linguagem humana
*	
*Paradigma - POO (Programacao Orientada a objetos) ou Estruturada
* Estruturada C , Cobol, clipper, basic
* POO --> Java, Python
*/
	
	
	/* Siglas do Java
	 * 
	 * JDK --> Java Development kit - Ferramentas p/ o dev
	 * JRE --> Java Runtime Environment - Responsavel por executar td aplica��o(JVM ta dentro)
	 * JVM --> Java Virtual machine --> Responsavel por rodar em qlqr plataforma ( Portabilidade)
	 */
	




}