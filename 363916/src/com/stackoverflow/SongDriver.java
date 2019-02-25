package com.stackoverflow;

public class SongDriver {

	public static String formatoTempo(long tempo){
	    int hora = 60;
	    int minuto = 60;
	    long h= tempo /hora;
	    long m= tempo % minuto;
	        return String.format("%02dh %02dmin", h, m);
	}

	public static void main(String[] args) {
		Playlist lista = new Playlist();
		Musica num1 = new Musica("Agua de beber", "Antonio Carlos Jobim", "Astrud Gilberto", 140);
		Musica num2 = new Musica("O mar serenou", "Candeia", " Clara Nunes", 179);
		Musica num3 = new Musica("Rapaz Folgado", "Noel Rosa", " Martinho da Vila Mart'nália", 180);

		Video num4 = new Video("Musica", " Despacito", " Luis Fonsi", 5926796, 280);

		lista.add(num1);
		lista.add(num2);
		lista.add(num3);
		lista.add(num4);

		lista.print();
	}
	
	public interface Item {	
		public long getDuracao();		
	}

	public static class Playlist {
		private Item[] itens;
		private int cont;

		public Playlist() {
			itens = new Item[1000];
			cont = 0;
		}

		public void add(Item item) {
			if (cont == itens.length) {
				System.out.println("ERROR: playlist atingiu sua quantidade máxima de itens.");
			}
			itens[cont] = item;
			cont++;
		}

		public Item get(int i) {
			if (cont > i) {
				return itens[i];
			} else {
				return null;
			}
		}

		public void print() {
			String result = "Total de Musicas e Videos Alocados = " + cont + "\n";
			for (int i = 0; i < cont; i++) {
				result += (i + " => " + itens[i] + "\n");
			}
			result += "Tempo Total da PlayList: " + formatoTotalTempo();
			System.out.println(result.toString());
		}

		public int totalTempo() {
			int totalTempo = 0;
			for (int i = 0; i < cont; i++) {
				totalTempo += itens[i].getDuracao();
			}
			return totalTempo;
		}

		public String formatoTotalTempo() {
			return formatoTempo(totalTempo());
		}
	}

	public static class Musica implements Item {
		private String nome;
		private String interprete;
		private String compositor;
		private long duracao;

		public Musica(String musicaNome, String interprteNome, String compositorNome, int tamanhoDuracao) {
			this.nome = musicaNome;
			this.interprete = interprteNome;
			this.compositor = compositorNome;
			this.duracao = tamanhoDuracao;
		}

		public void setNome(String musicaNome) {
			nome = musicaNome;
		}

		public String getNome() {
			return nome;
		}

		public void setInterprte(String interpreteNome) {
			interprete = interpreteNome;
		}

		public String getInterprete() {
			return interprete;
		}

		public void setCompositor(String compositorNome) {
			compositor = compositorNome;
		}

		public String getCompositor() {
			return compositor;
		}

		public long getDuracao() {
			return duracao;
		}

		public String toString() {
			return "Nome: " + getNome() + ", Interprete:" + getInterprete() + ", Compositor:" + getCompositor()
					+ ", Duracao: " + formatoTempo(getDuracao());
		}
	}

	public static class Video implements Item {
		String titulo;
		String assunto;
		String canal;
		int visualizacoes;
		long duracao;

		public Video(String tituloNome, String assuntoNome, String canalNome, int visualizacoes_video,
				long tempo_video) {
			this.titulo = tituloNome;
			this.assunto = assuntoNome;
			this.canal = canalNome;
			this.visualizacoes = visualizacoes_video;
			this.duracao = tempo_video;
		}

		public void setTitulo(String tituloNome) {
			titulo = tituloNome;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setAssunto(String assuntoNome) {
			assunto = assuntoNome;
		}

		public String getAssunto() {
			return assunto;
		}

		public void setCanal(String canalNome) {
			canal = canalNome;
		}

		public String getCanal() {
			return canal;
		}

		public void setVisualizacoes(int visualizacoes_video) {
			visualizacoes = visualizacoes_video;
		}

		public int getVisualizacoes() {
			return visualizacoes;
		}
		
		public long getDuracao() {
			return duracao;
		}

		public String toString() {
			return "Titulo: " + getTitulo() + ", Assunto:" + getAssunto() + ", Canal:" + getCanal()
					+ ", Visualizações: " + getVisualizacoes() + " Duração do video:"
					+ formatoTempo(getDuracao());
		}
	}
}
