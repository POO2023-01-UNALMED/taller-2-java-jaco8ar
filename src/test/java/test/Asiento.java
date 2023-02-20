package test;
import java.util.Arrays;

public class Asiento {
	String color;
	int precio;
	int registro;

	void cambiarColor(String unColor) {
		if (Arrays.asList("rojo","verde","amarillo","negro","blanco").contains(unColor)) {
			color = unColor;
		}
	}
	

}
