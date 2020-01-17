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
	
	@Column(length = 100, nullable=false)
	private String tecnologia_E_Atividade;
	
	@Column(length = 100, nullable=false)
	private String outraTecnologia;
	
	@Column(length = 100, nullable=false)
	private String formacaoAcademica;
	
	@Column(length = 100, nullable=false)
	private String certificacao;
	
	@Column(length = 100, nullable=false)
	private String tempo_Experiencia_Funcao;
	
	@Column(length = 100, nullable=false)
	private String idioma;
	
	@Column(length = 100, nullable=false)
	private String quaisIdiomas;
	
	@Column(length = 100, nullable=false)
	private String restricoes_Locais_Atuacao;
	
	@Column(length = 100, nullable=false)
	private String quais_Locais;
	
	@Column(length = 100, nullable=false)
	private String interesse_Atuar_Area;
	
	@Column(length = 100, nullable=false)
	private String qualArea;
	
	@Column(length = 100, nullable=false)
	private String temFilhos;
	
	@Column(length = 100, nullable=false)
	private String quntidade_Filhos;
	
	@Column(length = 100, nullable=false)
	private String idade_Filhos;
	
	@Column(length = 100, nullable=false)
	private String beneficios_Gostaria_Possuir;
	
	@Column(length = 100, nullable=false)
	private String temas_Interessa_Conhecer;
	
	@Column(length = 100, nullable=false)
	private String temas_Interessa_Ensinar;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTecnologia_E_Atividade() {
		return tecnologia_E_Atividade;
	}

	public void setTecnologia_E_Atividade(String tecnologia_E_Atividade) {
		this.tecnologia_E_Atividade = tecnologia_E_Atividade;
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

	public String getQuaisIdiomas() {
		return quaisIdiomas;
	}

	public void setQuaisIdiomas(String quaisIdiomas) {
		this.quaisIdiomas = quaisIdiomas;
	}

	public String getRestricoes_Locais_Atuacao() {
		return restricoes_Locais_Atuacao;
	}

	public void setRestricoes_Locais_Atuacao(String restricoes_Locais_Atuacao) {
		this.restricoes_Locais_Atuacao = restricoes_Locais_Atuacao;
	}

	public String getQuais_Locais() {
		return quais_Locais;
	}

	public void setQuais_Locais(String quais_Locais) {
		this.quais_Locais = quais_Locais;
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

	public String getQuntidade_Filhos() {
		return quntidade_Filhos;
	}

	public void setQuntidade_Filhos(String quntidade_Filhos) {
		this.quntidade_Filhos = quntidade_Filhos;
	}

	public String getIdade_Filhos() {
		return idade_Filhos;
	}

	public void setIdade_Filhos(String idade_Filhos) {
		this.idade_Filhos = idade_Filhos;
	}

	public String getBeneficios_Gostaria_Possuir() {
		return beneficios_Gostaria_Possuir;
	}

	public void setBeneficios_Gostaria_Possuir(String beneficios_Gostaria_Possuir) {
		this.beneficios_Gostaria_Possuir = beneficios_Gostaria_Possuir;
	}

	public String getTemas_Interessa_Conhecer() {
		return temas_Interessa_Conhecer;
	}

	public void setTemas_Interessa_Conhecer(String temas_Interessa_Conhecer) {
		this.temas_Interessa_Conhecer = temas_Interessa_Conhecer;
	}

	public String getTemas_Interessa_Ensinar() {
		return temas_Interessa_Ensinar;
	}

	public void setTemas_Interessa_Ensinar(String temas_Interessa_Ensinar) {
		this.temas_Interessa_Ensinar = temas_Interessa_Ensinar;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}