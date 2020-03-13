import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import ProdCong.ProdCong_Agua;
import ProdCong.Prod_cong_Aire;
import ProdCong.Prod_cong_Nitr;
import ProdCong.ProductoCong;
import Producto.Producto;
import Producto.ProductoFres;
import Producto.ProductoRefri;

public class Main {
	/*
	 * Desarrollar un programa Java que permita la gestión de una empresa
	 * agroalimentaria que trabaja con tres tipos de productos: productos frescos,
	 * productos refrigerados y productos congelados. Todos los productos llevan
	 * esta información común: fecha de caducidad y número de lote. A su vez, cada
	 * tipo de producto lleva alguna información específica. Los productos frescos
	 * deben llevar la fecha de envasado y el país de origen. Los productos
	 * refrigerados deben llevar el código del organismo de supervisión alimentaria,
	 * la fecha de envasado, la temperatura de mantenimiento recomendada y el país
	 * de origen. Los productos congelados deben llevar la fecha de envasado, el
	 * país de origen y la temperatura de mantenimiento recomendada. Hay tres tipos
	 * de productos congelados: congelados por aire, congelados por agua y
	 * congelados por nitrógeno. Los productos congelados por aire deben llevar la
	 * información de la composición del aire con que fue congelado (% de nitrógeno,
	 * % de oxígeno, % de dióxido de carbono y % de vapor de agua). Los productos
	 * congelados por agua deben llevar la información de la salinidad del agua con
	 * que se realizó la congelación en gramos de sal por litro de agua. Los
	 * productos congelados por nitrógeno deben llevar la información del método de
	 * congelación empleado y del tiempo de exposición al nitrógeno expresada en
	 * segundos.
	 * 
	 * Crear el código de las clases Java implementando una relación de herencia
	 * siguiendo estas indicaciones:
	 * 
	 * A) Crear superclases para agrupar atributos y métodos cuando sea posible.
	 * 
	 * B) Cada clase debe disponer de constructor y permitir establecer (set) y
	 * recuperar (get) el valor de sus atributos y tener un método que permita
	 * mostrar la información del objeto cuando sea procedente.
	 * 
	 * C) Crear una clase testHerencia con el método main donde se lea un archivo
	 * plano que tenga la información de varios productos separados por “&amp;”: (en
	 * el archivo deben existir al menos dos productos frescos, tres productos
	 * refrigerados y cinco productos congelados (2 de ellos congelados por agua,
	 * otros 2 por aire y 1 por nitrógeno).
	 * 
	 * Mostrar la información de cada producto del archivo por pantalla.
	 */
	public static void main(String[] args) {
		File file = null;
		Scanner sc = new Scanner(System.in);
		FileReader fr = null;
		ArrayList<Producto> productos = new ArrayList();
		BufferedReader br = null;
		String linea = "";
		String[] a = new String[linea.length()];
		try {

			file = new File("C:/Users/kluna/eclipse-workspace/Examen/src/producto.txt");
			// Si el archivo no existe es creado
			if (!file.exists()) {
				file.createNewFile();
			}

			fr = new FileReader(file);
			br = new BufferedReader(fr);
			// leemos las lineas del archivo
			while ((linea = br.readLine()) != null) {

				a = linea.split("&");
				Producto p;
				int id = 0;
				String nombre = "";
				int lote = 0;
				String fecha1 = "";
				String pais = "";
				for (int i = 0; i < a.length; i++) {

					if (i == 0) {
						id = Integer.parseInt(a[i]);

					} else if (i == 1) {
						nombre = a[i];
					} else if (i == 2) {
						fecha1 = a[i];
					} else if (i == 3) {
						lote = Integer.parseInt(a[i]);
					} else if (i == 4) {
						pais = a[i];
					} else if (i == 5) {
						if (Integer.parseInt(a[0]) > 0 && Integer.parseInt(a[0]) < 1000) {

							p = new ProductoFres(id, nombre, fecha1, lote, pais);

							((ProductoFres) p).setFecha_envase(a[5]);

							productos.add(p);

						} else if (Integer.parseInt(a[0]) >= 1000 && Integer.parseInt(a[0]) < 2000) {

							p = new ProductoRefri(id, nombre, fecha1, lote, pais);
							((ProductoRefri) p).setCod_superv(Integer.parseInt(a[5]));
							((ProductoRefri) p).setFechaenv(a[6]);
							((ProductoRefri) p).setTemperatura_env(Integer.parseInt(a[7]));
							productos.add(p);

						} else {

							if (Integer.parseInt(a[i + 2]) == 1) {

								p = new ProdCong_Agua(id, nombre, fecha1, lote, pais);
								((ProductoCong) p).setIdCong(Integer.parseInt(a[i + 2]));
								((ProdCong_Agua) p).setFech_ens(a[5]);
								((ProdCong_Agua) p).setInfo_salinidad(Double.valueOf(a[6]));
								productos.add(p);

							} else if (Integer.parseInt(a[i+2]) == 2) {
								p = new Prod_cong_Nitr(id, nombre, fecha1, lote, pais);
								((ProductoCong) p).setIdCong(Integer.parseInt(a[i + 2]));
								((Prod_cong_Nitr) p).setFech_ens(a[5]);
								((Prod_cong_Nitr) p).setInfo_cong(a[6]);
								((Prod_cong_Nitr) p).setTemp_expo(Integer.parseInt(a[7]));
								productos.add(p);

							} else {
								p = new Prod_cong_Aire(id, nombre, fecha1, lote, pais);
								((ProductoCong) p).setIdCong(Integer.parseInt(a[7]));
								((Prod_cong_Aire) p).setFech_ens(a[5]);

								((Prod_cong_Aire) p).tasas(a[6],a[8],a[9],a[10]);

								productos.add(p);

							}
						}

					}
				}

			}
			for (Producto p : productos) {
				System.out.println("id: " + p.getIdProducto());
				System.out.println("nombre:" + p.getNombre());
				System.out.println("Nro Lote: " + p.getNro_lote());
				System.out.println("Fecha Caducidad: " + p.getFechaCaducidad());
				System.out.println("Pais: " + p.getPais_orgin());
			
				if (p.getIdProducto() >= 2000) {
					if (((ProductoCong) p).getIdCong() == 1) {
						System.out.println(((ProdCong_Agua) p).toString());
					} else if (((ProductoCong) p).getIdCong() == 2) {
						System.out.println(((Prod_cong_Nitr) p).toString());
					} else {
						System.out.println(((Prod_cong_Aire) p).mtasas());
					}
				}
				System.out.println("=====================");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
