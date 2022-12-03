package com.curso;

public class GestionDeImpresion {

	public static void main(String[] args) {
		
		Pagina p1 = new Pagina(22, 33);
		Pagina p2 = new Pagina(25, 35);
		
		Factura f1 = new Factura(123, 1001);
		Factura f2 = new Factura(126, 1065);
		
		
		
		p1.informeCorto();
		p1.informeLargo();
		p2.informeCorto();
		p2.informeLargo();
		
		f1.informeCorto();
		f1.informeLargo();
		f2.informeCorto();
		f2.informeLargo();
		
		//No necesito getter y setter
		
		// Con los arrays es más sencillo que hacerlo como en la forma de arriba

		Imprimible[] imprimibles = new Imprimible[4];
		
		imprimibles[0] = new Factura(3, 45);
		imprimibles[1] = p1;
		imprimibles[2] = f1;
		imprimibles[3] = f2;
		
		for (Imprimible imp:imprimibles) {
			System.out.println("--------------------Informes desde el forEach--------------------");
			imp.informeCorto();
			imp.informeLargo();
		}
		
		//Imprimible [] imprimibles = {p1, p2, f1, f2}; //Con esto establezco el array y lo recorro con los bucles invocando los métodos
		
		//Establezco los arrays y con un bucle puedo recorrerlos e invocar el método que necesite para cada índice

}}
