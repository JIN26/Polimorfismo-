package Principal;
import Clases.*;
public class Principal {
	public static void main(String [] args) {
	Padre vec [] = new Padre [4];
	
	vec [0] = new Carro ("GHU0841",1993,"VERDE",1000.00,"CARRO");
	vec [1] = new Moto ("GHU0841",2015,"NEGRO",85.5,"MOTO");
	vec [2] = new Carro ();
	vec [3] = new Moto ();
	for(int i=0;i<vec.length;i++) {
		vec[i].mostrar();
		System.out.println(" ");
		
		if (vec[i].getClass() != Moto.class) {
			System.out.print(vec[i].getClass()+" \n");
		}
			
	}
	}
}
