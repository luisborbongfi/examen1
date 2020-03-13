package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class testHerencia {
	Scanner sc = new Scanner(System.in);
	BufferedReader bf;
	ArrayList<Producto> productos = new ArrayList<>();

	public testHerencia() {
	}

	public void menu() {
		int opcion = 0;
		while (true) {
			System.out.println("----------------MENU-------------" + "\n 1. Agregar archivo" + "\n 2. Mostrar Productos"
					+ "\n 3. Agregar Producto" + "\n 4. Eliminar Producto" + "\n 0. SALIR");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {
			case 1:
				agregarArchivo();
				break;
			case 2:
				mostrarProductos();
				break;
			case 3:
				agregarProducto();
				break;
			case 4:
				eliminarProducto();
				break;
			case 0:
				System.out.println("Adios");
				System.exit(0);
			default:
				System.out.println("Opcion invalida");
				break;
			}
		}
	}

	private void agregarArchivo() {
		String linea = null;
		try {
			bf = new BufferedReader(
					new FileReader("C:\\Users\\hdramos\\eclipse-workspace\\agroalimentaria\\src\\ficheros\\datos.txt"));
			while ((linea = bf.readLine()) != null) {
				String[] datos = linea.split("&");

				if (datos[0].equals("F")) {
					productos.add(new Fresco(datos[1], datos[2], Integer.parseInt(datos[3]), datos[4], datos[5]));
				} else {
					if (datos[0].equals("R")) {
						productos.add(new Refrigerado(datos[1], datos[2], Integer.parseInt(datos[3]), datos[4],
								Integer.parseInt(datos[5]), datos[6]));
					} else {
						if (datos[0].equals("A")) {
							productos.add(new PorAire(datos[1], datos[2], Integer.parseInt(datos[3]), datos[4],
									datos[5], datos[6], datos[7]));
						} else {
							if (datos[0].equals("W")) {
								productos.add(new PorAgua(datos[1], datos[2], Integer.parseInt(datos[3]), datos[4],
										datos[5], datos[6], datos[7]));
							} else {
								if (datos[0].equals("N")) {
									productos.add(
											new PorNitrogeno(datos[1], datos[2], datos[3], Integer.parseInt(datos[4]),
													datos[5], datos[6], datos[7], Integer.parseInt(datos[8])));
								}
							}
						}
					}
				}
			}
			System.out.println("Se añedio los productos");
		} catch (Exception e) {
			System.out.println("Fichero no encontrado" + e.getMessage() + e.getLocalizedMessage());
		}
	}

	private void mostrarProductos() {
		if (productos.size() != 0) {
			System.out.println("Los productos son: \n" );
			for (int i = 0; i < productos.size(); i++) {
				if (productos.get(i) instanceof Fresco) {
					System.out.println((i + 1) + " " + ((Fresco)productos.get(i)).informacionProducto());
				} else {
					if (productos.get(i) instanceof Refrigerado) {
						System.out.println((i + 1) + " " + ((Refrigerado)productos.get(i)).informacionProducto());
					} else {
						if (productos.get(i) instanceof PorAgua) {
							System.out.println((i + 1) + " " + ((PorAgua)productos.get(i)).informacionDeCongelamiento());
						} else {
							if (productos.get(i) instanceof PorAgua) {
								System.out.println((i + 1) + " " + ((PorAgua)productos.get(i)).informacionDeCongelamiento());
							} else {
								if (productos.get(i) instanceof PorNitrogeno) {
									System.out.println((i + 1) + " " + ((PorNitrogeno)productos.get(i)).informacionDeCongelamiento());
								}
							}
						}
					}
				}
			}
		} else {
			System.out.println("No hay productos");
		}
	}

	private void agregarProducto() {
		String linea = null;
		System.out.println("Ingrese la informacion del producto separado por &");
		linea = sc.nextLine();
		String[] datos = linea.split("&");
		if (datos[0].equals("F")) {
			productos.add(new Fresco(datos[1], datos[2], Integer.parseInt(datos[3]), datos[4], datos[5]));
		} else {
			if (datos[0].equals("R")) {
				productos.add(new Refrigerado(datos[1], datos[2], Integer.parseInt(datos[3]), datos[4],
						Integer.parseInt(datos[5]), datos[6]));
			} else {
				if (datos[0].equals("A")) {
					productos.add(new PorAire(datos[1], datos[2], Integer.parseInt(datos[3]), datos[4], datos[5],
							datos[6], datos[7]));
				} else {
					if (datos[0].equals("W")) {
						productos.add(new PorAgua(datos[1], datos[2], Integer.parseInt(datos[3]), datos[4], datos[5],
								datos[6], datos[7]));
					} else {
						if (datos[0].equals("N")) {
							productos.add(new PorNitrogeno(datos[1], datos[2], datos[3], Integer.parseInt(datos[4]),
									datos[5], datos[6], datos[7], Integer.parseInt(datos[8])));
						}
					}
				}
			}
		}
		System.out.println("Se añadio  producto");
	}

	private void eliminarProducto() {
		int index = 0;
		System.out.println("Ingrese el indice del producto que desea eliminar "
				+ " \n Sí no conoce el indice del producto consulte la opcion 2");
		index = (Integer.parseInt(sc.nextLine()) - 1);

		System.out.println("El producto \n" + productos.remove(index).informacionProducto() + "\n fue eliminado");

	}

	public static void main(String[] args) {
		testHerencia main = new testHerencia();
		main.menu();
	}

}
