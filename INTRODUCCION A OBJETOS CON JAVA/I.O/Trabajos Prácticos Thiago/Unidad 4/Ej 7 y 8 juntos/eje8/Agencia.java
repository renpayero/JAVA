package eje8;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;

public class Agencia {

	private List<Bien> bienes = new ArrayList<Bien>();
	private List<Cobro> cobros = new ArrayList<Cobro>();
	
	public void agregarBien(Bien b) {
		bienes.add(b);
	}
	
	public void borrarrBien(Bien b) {
		bienes.remove(b);
	}
	
	public void agregarCobroAnual(Bien bien) {
		Anual anual = new Anual();
		
		anual.setBien(bien);
		anual.setFecha(Calendar.getInstance().getTime());
		
		cobros.add(anual);
	}
	
	 public float valorCobro(Cobro cobro) {
		 return cobro.montoAPagar();
	 }
	 
	 public float sumaCobros() {
		 float suma = 0;
		 
		 for(Cobro c:cobros) {
			 suma+=c.montoAPagar();
		 }
		 
		 return suma;
	 }
	 
	 public Cobro cobroMayor() {
		 float mayor = 0;
		 Cobro cMayor = null;
		 
		 for(Cobro c:cobros) {
			if (c.montoAPagar()>mayor) {
				mayor = c.montoAPagar();
				cMayor = c;
			}
		 }
		 
		 return cMayor;
	 }
	 
	 public Vector<Cobro> cobroMayoresA(float valor) {
		 Vector<Cobro> mayores = new Vector<Cobro>();
		 
		 for(Cobro c:cobros) {
			if (c.montoAPagar()> valor) {
				mayores.add(c);
			}
		 }
		 
		 return mayores;
	 }	 
	
	 public float valorFiscal() {
		 float suma = 0;
		 
		 for(Bien b:bienes) {
			 suma+=b.getValorFiscal();
		 }
		 
		 return suma;
	 }
	 
}
