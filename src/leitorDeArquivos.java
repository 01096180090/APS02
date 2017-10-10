import java.util.Scanner;

public class leitorDeArquivos {

	public static void main(String[] args) {

		Scanner op = new Scanner(System.in);

		while (true) {
			System.out.println("Programa que lê arquivos CSV\n1.Ler arquivo\n2.Sair");
			switch (op.nextInt()) {
			case 1:

				LeArquivo le = new LeArquivo();

				break;
			case 2:

				System.exit(0);

				break;

			default:
				break;
			}
		}
	}
}