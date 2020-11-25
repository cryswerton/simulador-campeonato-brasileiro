package campeonatobrasileiro;

public class Rodada {

	Partida[] partidas = new Partida[10];
	
	
	
	Rodada(Partida[] partidas) {
		this.partidas = partidas;
	}
	
	void mostrarMandantes() {
		System.out.println("\nMandantes: \n");
		for(int i = 0; i<this.partidas.length; i++) {
			System.out.println(this.partidas[i].time1.nome);
		}
	}
	
	void mostrarVisitantes() {
		System.out.println("\nVisitantes: \n");
		for(int i = 0; i<this.partidas.length; i++) {
			System.out.println(this.partidas[i].time2.nome);
		}
	}
	
	void jogar() {
		for(int i = 0; i<this.partidas.length; i++) {
			this.partidas[i].jogar();
		}
	}
	
	void mostrarResultado() {
		System.out.println();
		for(int i = 0; i<this.partidas.length; i++) {
			this.partidas[i].MostrarResultado();
		}
	}
	
	private void mostrarStatusMandantes() {
		for(int i = 0; i< this.partidas.length; i++) {
			System.out.println(this.partidas[i].time1.mostrarStatus());
		}
	}
	private void mostrarStatusVisitantes() {
		for(int i = 0; i< this.partidas.length; i++) {
			System.out.println(this.partidas[i].time2.mostrarStatus());
		}
	}
	
	void mostrarStatus() {
		System.out.println();
		mostrarStatusMandantes();
		mostrarStatusVisitantes();
	}
	
}
