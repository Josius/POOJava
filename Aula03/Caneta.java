//Modificadores de visibilidade
/*
	'+' -> public - a classe atual e todas as outras classes teram acesso
	'-' -> privado - somente a classe atual tem acesso
	'#' -> protected - a classe atual e todas as subclasses têm acesso
*/

public class Caneta{
	
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void rabiscar(){
		if(this.tampada == true){
			System.out.println("ERRO! Não posso rabiscar");
		}else{
			System.out.println("Estou rabiscando");
		}
	}
	protected void tampar(){
		this.tampada = true;
	}
	protected void destampar(){
		this.tampada = false;
	}
	public String toString(){
		return "Modelo: " + modelo + "\nUma caneta: " + cor + "\nPonta: " + ponta + "\nCarga: " + carga + "%" + "\nEstá tampada? " + tampada + "\n";
	}
	
}

