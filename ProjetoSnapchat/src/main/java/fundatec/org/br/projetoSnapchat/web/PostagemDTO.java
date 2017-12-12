package fundatec.org.br.projetoSnapchat.web;

public class PostagemDTO {

	private Long id;

	private boolean foto;

	private boolean video;

	private String legenda;

	private int temporizador;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isFoto() {
		return foto;
	}

	public void setFoto(boolean foto) {
		this.foto = foto;
	}

	public boolean isVideo() {
		return video;
	}

	public void setVideo(boolean video) {
		this.video = video;
	}

	public String getLegenda() {
		return legenda;
	}

	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}

	public int getTemporizador() {
		return temporizador;
	}

	public void setTemporizador(int temporizador) {
		this.temporizador = temporizador;
	}

}
