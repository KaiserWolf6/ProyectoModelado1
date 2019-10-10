import java.util.Random;
import java.util.Scanner;

public class Proyecto1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dulce;
		dulce = sc.nextLine();
		//galletas
		String dulce2;
		dulce = sc.nextLine();
		int lote = sc.nextInt();
		int lote2 = sc.nextInt();
		boolean boton = false;
		boolean masa = false;
		Receta chocolate_oscuro = new Receta();
		Receta galletas_chispas = new Receta();
		Wonka3000 wonka = new Wonka3000(dulce, chocolate_oscuro, lote);
		Galleneitor5000 galleneitor = new Galleneitor5000(dulce2, galletas_chispas, lote2);
		String tipo_dulce = sc.nextLine();
		String tipo_dulce2 = sc.nextLine();
		wonka.encender();
		galleneitor.encender();
		galleneitor.prepararMasa(masa);
		wonka.getTipoDulce(dulce);
		wonka.getDulce(tipo_dulce);
		galleneitor.getTipoDulce(dulce2);
		galleneitor.getDulce(tipo_dulce2);
	}
}