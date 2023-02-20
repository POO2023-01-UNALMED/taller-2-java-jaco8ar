package test;
import java.util.Arrays;

public class Asiento {
	public String color;
	int precio;
	int registro;

	public void cambiarColor(String unColor) {
		if (Arrays.asList("rojo","verde","amarillo","negro","blanco").contains(unColor)) {
			color = unColor;
		}
	}
	

}
