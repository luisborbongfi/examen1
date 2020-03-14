public class ProductosRefrigerados extends Productos{
	
	private int codigoOrganismo;
		
	public ProductosRefrigerados() {}
	
	public ProductosRefrigerados(int codigoOrg,String fecha,String fechaenvasado,int numlote,String Paiso,double tem) {
		
		this.codigoOrganismo=codigoOrg;
		this.setFechacaducidad(fecha);
		this.setFechaenvasado(fechaenvasado);
		this.setNumerolote(numlote);
		this.setPaisOrigen(Paiso);
		this.setTemperatura(tem);
		
	}

	public int getCodigoOrganismo() {
		return codigoOrganismo;
	}
	
	public void ListaProdRefrigerados() {
		
		System.out.println("Lista de los productos refrigerados 1)Codigo de organismo: " + this.getCodigoOrganismo() + " 2)Fecha de Caducidad: " + this.getFechacaducidad() + " 3) Fecha de envase: " + this.getFechaenvasado() + " 4)numero de lote: " + this.getNumerolote() + " 5) Pais Origen:"  + this.getPaisOrigen() + " 6)Temperatura: " + this.getTemperatura());
	}

		
	
}
