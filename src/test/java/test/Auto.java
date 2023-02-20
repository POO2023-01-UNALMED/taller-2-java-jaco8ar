package test;


public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int count = 0;  
		for (Asiento i : this.asientos) {
			if (i != null) {
				count += 1;
			}
		}
		return count;
	}
	
	String verificarIntegridad() {
		if (this.registro == this.motor.registro) {
			for (Asiento asI : this.asientos) {				
				if (asI != null) {
					if (asI.registro != this.registro) {
						return ("Las piezas no son originales");
					}
				}else {
					continue;
				}	
			}
			return ("Auto original");
		
		}else {
			return ("Las piezas no son originales");
		}
	}
}


