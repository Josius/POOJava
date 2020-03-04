public class Aula02{
	
	public static void main(String[] args){
		
		Caneta can = new Caneta();
		can.setModelo("Blic");
		can.setCor("Azulada");
		can.setPonta(0.5f);
		can.setTampada(false);
		
		System.out.println(can);
		can.rabiscar();
		
		can.tampar();
		System.out.println(can);
		can.rabiscar();
		
		can.destampar();
		System.out.println(can);
		can.rabiscar();
		
	}
}