public class ProductosCongelados extends Productos{
	
	
	
	public ProductosCongelados() {}
	
	public ProductosCongelados(String fecha,String fechaenvasado,int numlote,String Paiso,double tem ) {
		
		this.setFechacaducidad(fecha);
		this.setFechaenvasado(fechaenvasado);
		this.setNumerolote(numlote);
		this.setPaisOrigen(Paiso);
		this.setTemperatura(tem);
		
	}

	public void Listaproductoscong() {
		
		System.out.println("Informacion de los productos congeledas 2) Fecha de caducidad"+this.getFechacaducidad()+"3) Fecha de envase"+this.getFechaenvasado()+"4) Numero de lote"+this.getNumerolote()+"5) Pais Origen"+this.getPaisOrigen()+"6)Temperatura"+getTemperatura());
	}

		
}