package ProdCong;

import java.util.ArrayList;
import java.util.List;

public class Prod_cong_Aire extends ProductoCong{

	
	private ArrayList<String> comp=new ArrayList();
	
	public Prod_cong_Aire() {
		
	}
	



	public Prod_cong_Aire(int idProducto, String nombre, String fechaCaducidad, long nro_lote, String pais_orgin) {
		super(idProducto, nombre, fechaCaducidad, nro_lote, pais_orgin);
		// TODO Auto-generated constructor stub
	}


	public Prod_cong_Aire(String fech_ens) {
		super(fech_ens);
		// TODO Auto-generated constructor stub
	}


 //(% de nitrógeno, % de oxígeno, % de dióxido de carbono y % de
	//vapor de agua).
   public void tasas(String tn,String to,String tco2,String tva) {
	   
	   comp.add(tn);
	   comp.add(to);
	   comp.add(tco2);
	   comp.add(tva);
	   
   }
   public List mtasas(){
	   return this.comp;
   }

	
	
	
}
