import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class TestHerencia {

	public static void main (String[] arrg) {
		
		try {
			System.out.println("======== Ejercicio Productos =========");
			
			File file = new File("src\\InfoProductos.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader buffReader = new BufferedReader(fileReader);
			String linea = "";
			ArrayList<Producto> lstProductos = new ArrayList<Producto>();
			
			while ((linea = buffReader.readLine()) != null) {
				String[] arrayStr = linea.split("&");
				
				if(arrayStr[0].equals("F")) {
					lstProductos.add(new Fresco(new SimpleDateFormat("dd/MM/yyyy").parse(arrayStr[1]), Integer.parseInt(arrayStr[2]), new SimpleDateFormat("dd/MM/yyyy").parse(arrayStr[3]), arrayStr[4]));
				}else if(arrayStr[0].equals("R")) {
					lstProductos.add(new Refrigerado(new SimpleDateFormat("dd/MM/yyyy").parse(arrayStr[1]), Integer.parseInt(arrayStr[2]), new SimpleDateFormat("dd/MM/yyyy").parse(arrayStr[3]), arrayStr[4]
							,Integer.parseInt(arrayStr[5]),Float.parseFloat(arrayStr[6])));
				}else if(arrayStr[0].equals("C")){
					
					TipoCongelado objTipoC = null;
					if(arrayStr[6].equals("AIRE")) {
						objTipoC = new Aire(Float.parseFloat(arrayStr[7]),Float.parseFloat(arrayStr[8]),Float.parseFloat(arrayStr[9]),Float.parseFloat(arrayStr[10]));
					}else if(arrayStr[6].equals("AGUA")) {
						objTipoC = new Agua(Float.parseFloat(arrayStr[7]),Float.parseFloat(arrayStr[8]));
					}else if(arrayStr[6].equals("NITROGENO")) {
						objTipoC = new Nitrogeno(arrayStr[7],Integer.parseInt(arrayStr[8]));
					}
					
					lstProductos.add(new Congelado(
							new SimpleDateFormat("dd/MM/yyyy").parse(arrayStr[1]), 
							Integer.parseInt(arrayStr[2]),
							new SimpleDateFormat("dd/MM/yyyy").parse(arrayStr[3]), 
							arrayStr[4],
							Float.parseFloat(arrayStr[5]),
							objTipoC.getTipoCongelado(),
							objTipoC
							));
				}
				
			}
			
			for (Producto producto : lstProductos) {
				System.out.println(producto.toString());
			}
			
			
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
	}
}
