package br.com.resource.webapp.alocados.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formulario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(length = 100, nullable = true)
	private String tecnologiaAtividade;

	@Column(length = 100, nullable = true)
	private String outraTecnologia;

	@Column(length = 100, nullable = true)
	private String formacaoAcademica;

	@Column(length = 100, nullable = true)
	private String certificacao;

	@Column(length = 100, nullable = true)
	private String quaisCertificacao;

	@Column(length = 100, nullable = true)
	private String tempo_Experiencia_Funcao;

	@Column(length = 100, nullable = true)
	private String idioma;

	@Column(length = 100, nullable = true)
	private String restricoes_Locais_Atuacao;

	@Column(length = 100, nullable = true)
	private String interesse_Atuar_Area;

	@Column(length = 100, nullable = true)
	private String qualArea;

	@Column(length = 100, nullable = true)
	private String temFilhos;

	@Column(length = 100, nullable = true)
	private String quantidadeFilhosIdade;

	@Column(length = 100, nullable = true)
	private String beneficios_Gostaria_Possuir;

	@Column(length = 100, nullable = true)
	private String quaisBeneficios;

	@Column(length = 100, nullable = true)
	private String temas_Interessa_Conhecer;

	@Column(length = 100, nullable = true)
	private String quaisTemas_Conhecer;

	@Column(length = 100, nullable = true)
	private String temas_Interessa_Ensinar;

	@Column(length = 100, nullable = true)
	private String quaisTemas_Ensinar;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTecnologiaAtividade() {
		return tecnologiaAtividade;
	}

	public void setTecnologiaAtividade(String tecnologiaAtividade) {
		this.tecnologiaAtividade = tecnologiaAtividade;
	}

	public String getOutraTecnologia() {
		return outraTecnologia;
	}

	public void setOutraTecnologia(String outraTecnologia) {
		this.outraTecnologia = outraTecnologia;
	}

	public String getFormacaoAcademica() {
		return formacaoAcademica;
	}

	public void setFormacaoAcademica(String formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}

	public String getCertificacao() {
		return certificacao;
	}

	public void setCertificacao(String certificacao) {
		this.certificacao = certificacao;
	}

	public String getQuaisCertificacao() {
		return quaisCertificacao;
	}

	public void setQuaisCertificacao(String quaisCertificacao) {
		this.quaisCertificacao = quaisCertificacao;
	}

	public String getTempo_Experiencia_Funcao() {
		return tempo_Experiencia_Funcao;
	}

	public void setTempo_Experiencia_Funcao(String tempo_Experiencia_Funcao) {
		this.tempo_Experiencia_Funcao = tempo_Experiencia_Funcao;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getRestricoes_Locais_Atuacao() {
		return restricoes_Locais_Atuacao;
	}

	public void setRestricoes_Locais_Atuacao(String restricoes_Locais_Atuacao) {
		this.restricoes_Locais_Atuacao = restricoes_Locais_Atuacao;
	}

	public String getInteresse_Atuar_Area() {
		return interesse_Atuar_Area;
	}

	public void setInteresse_Atuar_Area(String interesse_Atuar_Area) {
		this.interesse_Atuar_Area = interesse_Atuar_Area;
	}

	public String getQualArea() {
		return qualArea;
	}

	public void setQualArea(String qualArea) {
		this.qualArea = qualArea;
	}

	public String getTemFilhos() {
		return temFilhos;
	}

	public void setTemFilhos(String temFilhos) {
		this.temFilhos = temFilhos;
	}

	public String getQuantidadeFilhosIdade() {
		return quantidadeFilhosIdade;
	}

	public void setQuantidadeFilhosIdade(String quantidadeFilhosIdade) {
		this.quantidadeFilhosIdade = quantidadeFilhosIdade;
	}

	public String getBeneficios_Gostaria_Possuir() {
		return beneficios_Gostaria_Possuir;
	}

	public void setBeneficios_Gostaria_Possuir(String beneficios_Gostaria_Possuir) {
		this.beneficios_Gostaria_Possuir = beneficios_Gostaria_Possuir;
	}

	public String getQuaisBeneficios() {
		return quaisBeneficios;
	}

	public void setQuaisBeneficios(String quaisBeneficios) {
		this.quaisBeneficios = quaisBeneficios;
	}

	public String getTemas_Interessa_Conhecer() {
		return temas_Interessa_Conhecer;
	}

	public void setTemas_Interessa_Conhecer(String temas_Interessa_Conhecer) {
		this.temas_Interessa_Conhecer = temas_Interessa_Conhecer;
	}

	public String getQuaisTemas_Conhecer() {
		return quaisTemas_Conhecer;
	}

	public void setQuaisTemas_Conhecer(String quaisTemas_Conhecer) {
		this.quaisTemas_Conhecer = quaisTemas_Conhecer;
	}

	public String getTemas_Interessa_Ensinar() {
		return temas_Interessa_Ensinar;
	}

	public void setTemas_Interessa_Ensinar(String temas_Interessa_Ensinar) {
		this.temas_Interessa_Ensinar = temas_Interessa_Ensinar;
	}

	public String getQuaisTemas_Ensinar() {
		return quaisTemas_Ensinar;
	}

	public void setQuaisTemas_Ensinar(String quaisTemas_Ensinar) {
		this.quaisTemas_Ensinar = quaisTemas_Ensinar;
	}

}
