package campeonatobrasileiro;

import java.util.Random;

public class Partida {
	
	Time time1;
	Time time2;
	int golsDoTime1;
	int golsDoTime2;
	
	public Partida(Time time1, Time time2) {
		this.time1 = time1;
		this.time2 = time2;
	}
	
	private void gerarGols() {
		
		Random gerador = new Random();
		
		int sorteio1 = gerador.nextInt(10);
		int sorteio2 = gerador.nextInt(10);
		
		if(sorteio1 > sorteio2) {
			this.time1.marcarGol();
			this.time2.sofrerGol();
			this.golsDoTime1++;
		}
		else if(sorteio2 > sorteio1){
			this.time2.marcarGol();
			this.time1.sofrerGol();
			this.golsDoTime2++;
		}
	}
	
	private void emjogo() {
		gerarGols();
		gerarGols();
		gerarGols();
		gerarGols();
		gerarGols();
	}
	
	private void finalizar() {
		if(this.golsDoTime1 > this.golsDoTime2) {
			this.time1.vitorias++;
			this.time2.derrotas++;
			this.time1.pontos += 3;
		}
		else if(this.golsDoTime2 > this.golsDoTime1){
			this.time2.vitorias++;
			this.time1.derrotas++;
			this.time2.pontos += 3;
		}
		else if(this.golsDoTime2 == this.golsDoTime1){
			this.time1.pontos++;
			this.time1.empates++;
			this.time2.pontos++;
			this.time2.empates++;
		}
	}
	
	private void primeiroTempo() {
		this.emjogo();
	}
	private void segundoTempo() {
		this.finalizar();
	}
	
	void jogar() {
		this.golsDoTime1 = 0;
		this.golsDoTime2 = 0;
		primeiroTempo();
		segundoTempo();
		this.time1.jogos++;
		this.time2.jogos++;
	}
	
	
	void MostrarResultado() {
		String status = String.format("%s %d X %d %s", this.time1.nome, this.golsDoTime1, this.golsDoTime2, this.time2.nome);
		System.out.println(status);
	}
	
}
