package Clases;

public class Moto extends Padre{
	private String tipo;
	public Moto(){
		super();
		tipo="moto";
	}
	public Moto(String placa, int anio, String color, double km, String tipo) {
		super(placa, anio, color, km);
		this.tipo=tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	@Override
	public void mostrar() {
		System.out.println("Placa: " + placa + "\n Anio: " + anio + "\n Color: " + color + "\n Kilometraje: " + km + "\n Tipo: " + tipo);
	}
}
