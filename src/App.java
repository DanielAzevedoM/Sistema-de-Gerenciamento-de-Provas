import java.util.Arrays;
import java.util.Scanner;

public class App {

	static Scanner scanner = new Scanner(System.in);
	static Boolean sair = false;

	public static void main(String[] args) throws Exception {

		String[] gabarito = new String[5];

		String[] prova = new String[5];

		String opcao;

		while (sair.equals(false)) {

			opcao = Metodos.mostrarMenu();

			Metodos.opcaoSelecionada(gabarito, prova, opcao);

		}
	}

	public class Metodos {
		private static void opcaoSelecionada(String[] gabarito, String[] prova, String opcao){
			switch (opcao) {
				case "1":
					System.out.println("Cadastre o Gabarito da sua prova: ");
					Metodos.cadastrarGabarito(gabarito);
					Metodos.verificarNotasNulas(gabarito);
					break;
				case "2":
					System.out.println("Cadastro de prova");
					Metodos.cadastrarProva(prova);
					Metodos.verificarNotasNulas(prova);
					break;
				case "3":
					System.out.println("Exibir Gabarito \n");
					System.out.println("Gabarito: " + Arrays.toString(gabarito) +"\n");
					break;
				case "4":
					System.out.println("Exibir prova \n");
					System.out.println("Prova: " + Arrays.toString(prova) + "\n");
					break;
				case "5":
					System.out.println("Ver nota: ");
					Metodos.verNota(gabarito, prova);
					break;
				case "6":
					System.out.println("Sair");
					sair = true;
					break;
				default:
					System.out.println("Opção Inválida!");
					break;

			}
		}

		private static void cadastrarGabarito(String[] gabarito) {

			for (int i = 0; i < gabarito.length; i++) {
				System.out.println("Digite a resposta da questão " + (i + 1) + " da sua prova: ");
				System.out.println("Escolha alternativas de A até D \n");
				String alternativa = scanner.nextLine();

				alternativaLogica(alternativa, i, gabarito);
				
			}
		}

		private static void cadastrarProva(String[] prova){
			for (int i = 0; i < prova.length; i++) {
				System.out.println("Digite a resposta da questão " + (i + 1) + " da sua prova: ");
				System.out.println("Escolha alternativas de A até D \n");
				String alternativa = scanner.nextLine();

				alternativaLogica(alternativa, i, prova);
				
			}
			
		}

		private static void alternativaLogica(String alternativa, Integer i, String[] gabarito) {
				switch (alternativa) {
					case "A":
						gabarito[i] = "A";
						System.out.println("Você escolheu letra A para a " + (i + 1) + "º questão. \n");
						break;
					case "B":
						gabarito[i] = "B";
						System.out.println("Você escolheu letra B para a " + (i + 1) + "º questão. \n");
						break;
					case "C":
						gabarito[i] = "C";
						System.out.println("Você escolheu letra C para a " + (i + 1) + "º questão. \n");
						break;
					case "D":
						gabarito[i] = "C";
						System.out.println("Você escolheu letra D para a " + (i + 1) + "º questão. \n");
						break;
					default:
						System.out.println("Opção inválida, escolha de A até D \n");
						break;
				}
		}

		private static void verificarNotasNulas(String[] gabarito){
			for (int i = 0; i < gabarito.length; i++) {
				if (gabarito[i] == null) {
					while (gabarito[i] == null) {
						System.out.println("Questão: " + (i + 1) + " sem gabarito!");
						preencherNulas(gabarito, i);
					}
				}	
				
			}

		}
		
		private static void preencherNulas(String[] gabarito, Integer i){
				System.out.println("Digite a resposta da questão " + (i + 1) + " que está nula: ");
				System.out.println("Escolha alternativas de A até D \n");
				String alternativa = scanner.nextLine();

				alternativaLogica(alternativa, i, gabarito);
				
			}

		private static void verNota(String[] gabarito, String[] prova){
			Integer nota = 0;

			for (int i = 0; i < gabarito.length; i++) {
				if(prova[i].equals(gabarito[i])){
					nota = nota + 1;
				}
			}

			System.out.println("Sua nota é: " + nota);
		}

		private static String mostrarMenu() {
			System.out.println("1- Cadastrar Gabarito ");
			System.out.println("2- Cadastrar Prova");
			System.out.println("3- Exibir Gabarito");
			System.out.println("4- Exibir Prova");
			System.out.println("5- Ver nota");
			System.out.println("6- Sair");
			String opcao = scanner.nextLine();

			return opcao;
		}

	}
}


