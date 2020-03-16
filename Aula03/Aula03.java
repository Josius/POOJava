public class Aula03{
	
	public static void main(String[] args){
		
		Caneta c1 = new Caneta();
		
		c1.modelo = "BIC cristal";
		c1.cor = "Azul";
		c1.carga = 80;
		System.out.println(c1);
		c1.rabiscar();
		c1.tampar();
		c1.rabiscar();
		c1.destampar();
		c1.rabiscar();
	}
}