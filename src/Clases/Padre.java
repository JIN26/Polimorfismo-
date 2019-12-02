package Clases;

public class Padre {
	protected String placa;
	protected int anio;
	protected String color;
	protected double km;
	public Padre() {}
	public Padre(String placa, int anio, String color, double km) {
		this.placa=placa;
		this.anio=anio;
		this.color=color;
		this.km=km;
	}
	public String getPlaca() {
		return this.placa;
	}
	public void setPlaca(String placa) {
		this.placa=placa;
	}
	public int getAnio() {
		return this.anio;
	}
	public void setAnio(int anio) {
		this.anio=anio;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public double getKm() {
		return this.km;
	}
	public void setKm(double km) {
		this.km=km;
	}
	public void mostrar() {
		System.out.println("Placa: " + placa + "\n Anio: " + anio + "\n Color: " + color + "\n Kilometraje: " + km);
	}
}
