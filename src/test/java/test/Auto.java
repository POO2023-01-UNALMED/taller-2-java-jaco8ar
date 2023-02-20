package test;


public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos(Auto auto) {
		int count = 0;  
		for (Asiento i : auto.asientos) {
			if (i != null) {
				count += 1;
			}
		}
		return count;
	}
	
	String verificarIntegridad(Auto auto) {
		if (auto.registro == auto.motor.registro) {
			for (Asiento asI : auto.asientos) {				
				if (asI != null) {
					if (asI.registro != auto.registro) {
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


