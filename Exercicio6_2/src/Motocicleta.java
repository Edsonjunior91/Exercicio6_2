
public class Motocicleta extends Veiculo {
	/*
	 * Perceba que, ao sobrescrever os m�todos, o m�todo da superclasse � chamado, pois ele precisa
	 * definir o valor correto para o atrinbuto 'ligado'
	 */
	public void ligar() {
		super.ligar();
		System.out.println("Motocicleta ligada");
	}
	
	public void desligar() {
		super.desligar();
		System.out.println("Motocicleta Desligada");
	}
}
