package eje2;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

	private List<Poliza> polizas = new ArrayList<Poliza>();
	
	public void addPoliza(Poliza e) {
		polizas.add(e);
	}
	
	public void removePoliza(Poliza e) {
		polizas.remove(e);
	}
	
	public float montoAPagarDe(Poliza unaPoliza) {
		return unaPoliza.monto();
	}
	 public float montoTotalAsegurado() {
		 float t = 0;
		 for(Poliza p :polizas) {
			 t+=p.montoValuacion();
		 }
		 return t;
	 }
	 
	 public float montoTotalACobrar() {
		 float t = 0;
		 for(Poliza p :polizas) {
			 t+=p.monto();
		 }
		 return t;
	 }
	 
	 public int cantidadPolizas() {
		 return polizas.size();
	 }
	 
 	public void asegurarAutoTotal(Auto unAuto, String unNombre) {
 		Total t = new Total();
 		
 		t.setAuto(unAuto);
 		t.setNombre(unNombre);
 		
 		addPoliza(t); 	
 	}
}
