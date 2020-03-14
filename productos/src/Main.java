import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main{
	
	public static void main(String[] args) {
		
	 try {
		
		 File file = new File("C:\\Users\\luisa\\Documents\\ListaProductos.txt");
		 FileReader fileReader = new FileReader(file);
		 BufferedReader buffReader = new BufferedReader(fileReader);
		 ArrayList<Productos>lstproductos = new ArrayList<Productos>();
		 ArrayList<ProductosCongelados>lsproductocongelados = new ArrayList<ProductosCongelados>();
		 String linea = "";
		 int contId = 1;
		 while ((linea = buffReader.readLine()) != null) {
			 String[] info = linea.split("&");
			 if(info.equals("P")) {
				 Productos productos = new Productos();
				 ProductosCongelados productoscon = new ProductosCongelados();
				 productos.setFechacaducidad(info[0]);
				 productos.setFechaenvasado(info[1]);
				 productos.setNumerolote(contId);
				 productos.setPaisOrigen(info[3]);
				 productos.setTemperatura(Double.parseDouble(info[4]));
				 lstproductos.add(productos);
				 
				 productoscon.setFechacaducidad(info[0]);
				 productoscon.setFechaenvasado(info[1]);
				 productoscon.setNumerolote(contId);
				 productoscon.setPaisOrigen(info[3]);
				 productoscon.setTemperatura(contId);
				 lsproductocongelados.add(productoscon);
				 
			}else if(info[0].equals("PF")) {
				 lstproductos.add(new ProductosFrescos(Integer.parseInt(info[1]),info[2],info[3],Integer.parseInt(info[4]),info[5]));
			 }else if(info[0].equals("PR")) {
				 lstproductos.add(new ProductosRefrigerados(Integer.parseInt(info[1]),info[2],info[3],Integer.parseInt(info[4]),info[5],Double.parseDouble(info[6])));
			 }else if(info[0].equals("PC")&info[1].equals("Aire")) {
				 lsproductocongelados.add(new CongeladoAire(info[2], info[3], Integer.parseInt(info[4]), info[5], Double.parseDouble(info[6]), Double.parseDouble(info[7]),Double.parseDouble(info[8]),Double.parseDouble(info[9]),Double.parseDouble(info[10])));
			 }else if(info[0].equals("PC")&info[1].equals("Agua")) {
				 lsproductocongelados.add(new CongeladoAgua(info[2], info[3], Integer.parseInt(info[4]), info[5], Double.parseDouble(info[6]), info[7]));
			 }else if(info[0].equals("PC")&info[1].equals("Nitrogeno")) {
				 lsproductocongelados.add(new CongeladoNitrogeno(info[2], info[3], Integer.parseInt(info[4]), info[5], Double.parseDouble(info[6]), info[7], Integer.parseInt(info[8])));
			 }
			 contId ++;
			 
		 }
		 
		 
		 for(int i=0;i<lstproductos.size();i++) {
			if(lstproductos.get(i)instanceof ProductosFrescos) {
				 System.out.println("PRODUCTOS FRESCOS");
				 ((ProductosFrescos)lstproductos.get(i)).ListaProductosFrescos();
				 System.out.println("-----------------------");
			 }else if(lstproductos.get(i)instanceof ProductosRefrigerados) {
				 System.out.println("PRODUCTOS REFRIGERADOS");
				 ((ProductosRefrigerados)lstproductos.get(i)).ListaProdRefrigerados();
				 System.out.println("-----------------------");
			 }
		 }
			
		  for(int j=0;j<lsproductocongelados.size();j++) {
			  if(lsproductocongelados.get(j)instanceof CongeladoAire)  {
					 System.out.println("PRODUCTOS CONGELADOS");
					 ((CongeladoAire)lsproductocongelados.get(j)).ListadeproductosAire();
					 System.out.println("-----------------------");
				 }else if(lsproductocongelados.get(j)instanceof CongeladoAgua) {
					 System.out.println("PRODUCTOS CONGELADOS");
					 ((CongeladoAgua)lsproductocongelados.get(j)).Listadeproductosagua();
					 System.out.println("-----------------------");
				 }else if(lsproductocongelados.get(j)instanceof CongeladoNitrogeno) {
					 System.out.println("PRODUCTOS CONGELADOS");
					 ((CongeladoNitrogeno)lsproductocongelados.get(j)).ListaproductosconNi();
					 System.out.println("-----------------------");
				 }
		  }
		 
	
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Error:" + e.getMessage());
	}
		
	}
	
}