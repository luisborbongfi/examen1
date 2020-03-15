public class CongeladoAire extends ProductosCongelados{
	
	private double nitrogeno;
	private double oxigeno;
	private double dioxidodecarbono;
	private double vaporagua;
	
	public CongeladoAire() {}
	
	public CongeladoAire(String fecha,String fechaenvasado,int numlote,String Paiso,double tem,double nitro,double oxigeno,double dioxidocarbono,double vaporagua) {
		
		this.setFechacaducidad(fecha);
		this.setFechaenvasado(fechaenvasado);
		this.setNumerolote(numlote);
		this.setPaisOrigen(Paiso);
		this.setTemperatura(tem);
		this.nitrogeno=nitro;
		this.dioxidodecarbono=dioxidocarbono;
		this.vaporagua=vaporagua;
	}

	public double getNitrogeno() {
		return nitrogeno;
	}

	public double getOxigeno() {
		return oxigeno;
	}

	public double getDioxidodecarbono() {
		return dioxidodecarbono;
	}

	public double getVaporagua() {
		return vaporagua;
	}
	
	
	
	
	public void setNitrogeno(double nitrogeno) {
		this.nitrogeno = nitrogeno;
	}

	public void setOxigeno(double oxigeno) {
		this.oxigeno = oxigeno;
	}

	public void setDioxidodecarbono(double dioxidodecarbono) {
		this.dioxidodecarbono = dioxidodecarbono;
	}

	public void setVaporagua(double vaporagua) {
		this.vaporagua = vaporagua;
	}

	public void ListadeproductosAire() {
		
		System.out.println("Informacion de Productos congelados por aire: 1) Fecha Caducidad: " + this.getFechacaducidad() + " 2) Fecha de envase: " +this.getFechaenvasado() + " 3) Numero de lote: " +this.getNumerolote() +" 4) Pais Origen :"+this.getPaisOrigen()+" 5) temperatura: " +this.getTemperatura() + " 6) Nitrogeno: "+this.getNitrogeno() + " 7) dioxido de carbono: " + this.getDioxidodecarbono()+" 8) Vapor agua: " +this.getVaporagua());
	}
	
	
}