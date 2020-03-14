

public class ProductosFrescos extends Productos{
	
	private int Codprodfresco;
	
	public ProductosFrescos() {}
	
	public ProductosFrescos(int codprofresco,String fecha,String fechaenvasado,int numlote,String Paiso) {
		this.Codprodfresco=codprofresco;
		this.setFechacaducidad(fecha);
		this.setFechaenvasado(fechaenvasado);
		this.setNumerolote(numlote);
		this.setPaisOrigen(Paiso);
		

     }

	public int getCodprodfresco() {
		return Codprodfresco;
	}
	
	
	
	public void setCodprodfresco(int codprodfresco) {
		Codprodfresco = codprodfresco;
	}

	public void ListaProductosFrescos() {
		System.out.println("Productos Frescos 1) Codigo del producto: "+ this.getCodprodfresco()+  " 2) Fecha de Caducidad: " + this.getFechacaducidad()+ " 3)Fecha de envase: "+ this.getFechaenvasado()+ " 4)Numero de lote :" + this.getNumerolote()+ " 5) pais origen: " + this.getPaisOrigen());
	}

	
		
}