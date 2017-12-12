package fundatec.org.br.projetoSnapchat.dao;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "Usuario")
	public class PostagemEntity {

		@Id
		@Column(name = "id")
		private Long id;
		
		@Column(name = "foto")
		private boolean foto;
		
		@Column(name = "video")
		private boolean video;
		
		@Column(name = "legenda")
		private String legenda;
		
		@Column(name = "temporizador")
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
