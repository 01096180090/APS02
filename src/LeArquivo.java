import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeArquivo {

	File arquivo = new File("C:\\Users\\mcamargo\\Downloads\\Aps02 Algoritmos e Programação\\participantes.csv");
	Pessoa pessoa[] = new Pessoa[10];

	{

		try {

			Scanner sc = new Scanner(arquivo).useDelimiter(",");

			for (int i = 0; i < pessoa.length; i++) {
				while (sc.hasNext()) {

					pessoa[i] = new Pessoa();
					pessoa[i].setNome(sc.next());
					pessoa[i].setEmail(sc.nextLine().replaceAll(",", ""));
					break;

				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < pessoa.length; i++) {
			System.out.println(pessoa[i]);
		}
	}

}