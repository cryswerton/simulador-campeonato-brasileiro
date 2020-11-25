package campeonatobrasileiro;

public class Time {
	
	String nome;
	int jogos;
	int pontos;
	int empates;
	int vitorias;
	int derrotas;
	int golsMarcados;
	int golsSofridos;
	int saldoGols;
	int CartoesAmarelos;
	int CartoesVermelhos;
	
	public Time(String nome) {
		this.nome = nome;
//		this.nomeDoTecnico = nomeDoTecnico;
	}
	
	void marcarGol() {
		this.golsMarcados += 1;
	}
	
	void sofrerGol() {
		this.golsSofridos += 1;
	}
	String mostrarStatus() {
		int tamanhoNome = this.nome.length();
		int nEspacos = 19 - tamanhoNome;
		String espacos = "";
		
		for(int i = 0; i<nEspacos; i++) {
			espacos += " ";
		}
		
		String statusTime = 
				String.format("%s%s P: %d; J: %d GP: %d; GC: %d.",
				this.nome, espacos, this.pontos,this.jogos, this.golsMarcados,
				this.golsSofridos);
		return statusTime;
	}
	
	

}
