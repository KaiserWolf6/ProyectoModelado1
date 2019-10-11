import java.util.Scanner;

public class Prueba{
	public static void main(String [] args){
		 int a;
		 int b;
		 int c;
		 int d;
		 int e;
		 int f;
		 int g;
		 int h;
		

		Scanner s = new Scanner(System.in);

		do{
			System.out.println("Bienvenido a la compañia Rosa...");
			System.out.println("Elige la maquina a utilizar.");
			System.out.println("1.- Maquina WONKA3000");
			System.out.println("2.- Maquina GELLENEITOR5000");
			System.out.println("Introduce una opcion...");
			a = s.nextInt();
		}while(a>2 || a<1);

		switch(a){
		case 1:
			System.out.println("Bienvenido, la maquina seleccionada es la maquina WONKA3000");
			do{
				System.out.println("¿Deseas encender la maquina?");
				System.out.println("1.- Si");
				System.out.println("2.- No");
				b = s.nextInt();
			}while(b>2 || b<1);
			
			switch(b){
				case 1:
					System.out.println("¿Que deseas hacer?");
					do{
						System.out.println("1.- Preparar dulce");
						System.out.println("2.- Suspender");
						System.out.println("3.- Apagar");
						System.out.println("4.- Hacer pedido");
						System.out.println("Introduce una opcion...");
						c = s.nextInt();
					}while(c>4 || c<1);

					switch(c){
						case 1:
							System.out.println("¿Que tipo de dulce");
							System.out.println("¿Que deseas hacer?");
							do{
								System.out.println("1.- Chocolate");
								System.out.println("2.- Gomita");
								System.out.println("3.- Galleta");
								d = s.nextInt();
							}while(d>3 || d<1);

							switch(d){
								case 1:
									do{
										System.out.println("1.- Chocolate Almendrado");
										System.out.println("2.- Chocolate con Leche");
										System.out.println("3.- Chocolate oscuro");
										e = s.nextInt();
									}while(e>3 || e<1);

									switch(e){
										case 1:
											System.out.println("Haciendo chocolate almendrado");
										break;

										case 2:	
											System.out.println("Haciendo chocolate con leche");
										break;

										case 3:
											System.out.println("Haciendo chocolate oscuro");
										break;
										default:
											System.out.println("Elige una opcion correcta");
									}
								break;

								case 2:
									do{
										System.out.println("1.- Gomitas gusanitos");
										System.out.println("2.- Gomitas de ositos");
										System.out.println("3.- Gomitas gusanitos");
										f = s.nextInt();
									}while(f>3 || f<1);

									switch(f){
										case 1:
											System.out.println("Haciendo gomitas con forma de gusanito");
										break;

										case 2:	
											System.out.println("Haciendo gomitas de ositos");
										break;

										case 3:
											System.out.println("Haciendo gomitas de frutas ");
										break;
										default:
											System.out.println(" Elige una opcion correcta");
									}
								break;

								case 3:
									do{
										System.out.println("1.- Galletas con chispas");
										System.out.println("2.- Galletas saladas");
										System.out.println("3.- Gomitas rellenas");
										g = s.nextInt();
									}while(g>3 || g<1);

									switch(g){
										case 1:
											System.out.println("Haciendo galletas con chispas");
										break;

										case 2:	
											System.out.println("Haciendo galletas saladas");
										break;

										case 3:
											System.out.println("Haciendo galletas rellenas");
										break;
										default:
											System.out.println(" Elige una opcion correcta");
									}
								break;
							}
						break;

						case 2:
							System.out.println("En mantenimiento");
						break;

						case 3:
							System.out.println("En mantenimiento");
						break;
						default:
							System.out.println(" Elige una opcion correcta");
					}


				break;

				case 2:
					System.out.println("Adios...");
				break;
				default:
					System.out.println(" Elige una opcion correcta");
			}


			break;
		case 2:
		break;
			
			
		default:
			System.out.println(" Elige una opcion correcta");


		}
	}
}