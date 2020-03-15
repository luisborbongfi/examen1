public class CongeladoAgua extends ProductosCongelados{
	
	private String salanidad;
	private String CodAgua;
	
	public CongeladoAgua() {}
	
	public CongeladoAgua(String fecha,String fechaenvasado,int numlote,String Paiso,double tem,String salanidad) {
		
		this.setFechacaducidad(fecha);
		this.setFechaenvasado(fechaenvasado);
		this.setNumerolote(numlote);
		this.setPaisOrigen(Paiso);
		this.setTemperatura(tem);
		this.salanidad=salanidad;
		
	}
	
	

	public String getCodAgua() {
		return CodAgua;
	}

	public String getSalanidad() {
		return salanidad;
	}
	
    public void Listadeproductosagua() {
		
		System.out.println("Informacion de Productos congelados por agua: 1) Fecha Caducidad: " + this.getFechacaducidad() + " 2) Fecha de envase: " +this.getFechaenvasado() + " 3) Numero de lote:  " +this.getNumerolote() + " 4) Pais Origen :" +this.getPaisOrigen()+ " 5) temperatura: " +this.getTemperatura() + " 6) Salanidad: "+this.getSalanidad());
	}
	
}