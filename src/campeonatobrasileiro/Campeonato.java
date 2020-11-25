package campeonatobrasileiro;

//Versão do JDK: 15.0.1.

public class Campeonato {
// 38 rodadas 
// Cada rodada tem 10 partidas
	
	public static void main(String[] args) {
		
//		Time t1 = new Time(Times.nomes[0]);
//		Time t2 = new Time(Times.nomes[1]);
//		Time t3 = new Time(Times.nomes[2]);
//		Time t4 = new Time(Times.nomes[3]);
//		Time t5 = new Time(Times.nomes[4]);
//		Time t6 = new Time(Times.nomes[5]);
//		
//		Partida p1 = new Partida(t1, t2);
//		Partida p2 = new Partida(t3, t4);
//		Partida p3 = new Partida(t5, t6);
//		
//		for(int i = 0; i<5; i++) {		
//			p1.jogar();
//			p2.jogar();
//			p3.jogar();
//			System.out.println();
//			p1.MostrarResultado();
//			p2.MostrarResultado();
//			p3.MostrarResultado();
//			System.out.println();
//			t1.mostrarStatus();
//			t2.mostrarStatus();
//			t3.mostrarStatus();
//			t4.mostrarStatus();
//			t5.mostrarStatus();
//			t6.mostrarStatus();
//		}
		
		Time[] mandantes = new Time[10];
		Time[] visitantes = new Time[10];
		Partida[] partidas = new Partida[10];
		
		for(int i = 0; i<mandantes.length; i++) {
			mandantes[i] = new Time(Times.nomes[i]);
		}
		
		int indice2 = 10;
		
		for(int i = 0; i<visitantes.length; i++) {
			visitantes[i] = new Time(Times.nomes[indice2]);
			indice2++;
		}
		
		for (int i = 0; i<partidas.length; i++) {
			partidas[i] = new Partida(mandantes[i], visitantes[i]);
		}
		
		Rodada[] rodadas = new Rodada[38];
		
//		Rodada r1 = new Rodada(partidas);
//		r1.jogar();
//		r1.mostrarResultado();
//		r1.mostrarStatus();
//		
//		Rodada r2 = new Rodada(partidas);
//		r2.jogar();
//		r2.mostrarResultado();
//		r2.mostrarStatus();
		
		for(int i = 0; i<rodadas.length; i++) {
			rodadas[i] = new Rodada(partidas);
		}
		
		for(int i = 0; i<rodadas.length;i++) {
			rodadas[i].jogar();
			rodadas[i].mostrarResultado();
			rodadas[i].mostrarStatus();
		}

	}
	
}
