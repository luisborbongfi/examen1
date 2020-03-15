public class CongeladoNitrogeno extends ProductosCongelados{
	
	private String Metododecongelacion;
	private int tiempo;
	
	public CongeladoNitrogeno() {}
	
	public CongeladoNitrogeno(String fecha,String fechaenvasado,int numlote,String Paiso,double tem,String metcongelacion,int tiempo) {
		
		this.setFechacaducidad(fecha);
		this.setFechaenvasado(fechaenvasado);
		this.setNumerolote(numlote);
		this.setPaisOrigen(Paiso);
		this.setTemperatura(tem);
		this.Metododecongelacion=metcongelacion;
		this.tiempo=tiempo;
	}
	
	

	public String getMetododecongelacion() {
		return Metododecongelacion;
	}

	public int getTiempo() {
		return tiempo;
	}
	
	
	public void ListaproductosconNi() {
		System.out.println("Informacion de Productos congelados por Nitrogeno 1) Fecha Caducidad :" + this.getFechacaducidad() + " 2) Fecha de envase: " + this.getFechaenvasado() + " 3) Numero de lote: " +this.getNumerolote() +" 4) Pais Origen: " +this.getPaisOrigen()+" 5) temperatura: " +this.getTemperatura() + " 6) Metodo de congelacion:" +this.getMetododecongelacion()+" 7) Tiempo:"+this.getTiempo());
	}
}