public class Caneta{
	
	private String modelo;
	private String cor;
	private float ponta;
	private int carga;
	private boolean tampada;
	
	public String getModelo(){
		return modelo;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public String getCor(){
		return cor;
	}
	public void setCor(String cor){
		this.cor = cor;
	}
	public float getPonta(){
		return ponta;
	}
	public void setPonta(float ponta){
		this.ponta = ponta;
	}
	public int getCarga(){
		return carga;
	}
	public void setCarga(int carga){
		this.carga = carga;
	}
	public boolean isTampada(){
		return tampada;
	}
	public void setTampada(boolean tampada){
		this.tampada = tampada;
	}
	
	public void rabiscar(){
		if(this.tampada==true){
			System.out.println("ERRO! Nao posso rabiscar.");
		}else{
			System.out.println("Estou rabiscando!");
		}
	}
	
	public void tampar(){
		this.tampada = true;
		
	}
	public void destampar(){
		this.tampada = false;
		
	}
	
	public String toString(){
		return "\nModelo: " +modelo+ "\nUma caneta " + cor + "\nPonta: " + ponta + "\nCarga: " +carga+ "\nEstá tampada? " + tampada;
	}
}