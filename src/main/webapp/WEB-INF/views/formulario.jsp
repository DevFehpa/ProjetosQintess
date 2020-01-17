<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>




<meta charset="UTF-8">
<title>Formulário</title>

<spring:url value="formulario/salvaFormulario" var="salvaFormulario"></spring:url>

</head>
<c:import url="comum/files.jsp" />






<body>




	<div class="container">
		<div class="row">
			<div class="col">
				<h2>
					<strong>Formulario Qintess:</strong>
				</h2>
			</div>

		</div>
		<div class="form-row-12">

			<form:form method="post" modelAttribute="formulario"
				action="/index/formulario/cadastroForm" class="form-row">


				<div class="form-group col-12">
					<label for="tecnologiaAtividade">Tecnologia principal ou
						atividades que executa?</label> <input class="form-control"
						id="tecnologiaAtividade" type="text" name="tecnologiaAtividade"></input>
				</div>


				<div class="form-group col-12" id="outraTecnologia">
					<label for="outraTecnologia">Conhecimento em outra
						tecnologia?</label><br> <input id="outraTecnologia"
						class="form-control" name="outraTecnologia" type="text" />
				</div>



				<div class="form-group col-6 Opcoes">
					<label for="formacaoAcademica">Formação Acadêmica </label><br>
					<select class="custom-select" id="formacaoAcademica"
						name="formacaoAcademica">
						<option value="OpcaoFormacao_Academica" selected disabled>Escolha
							uma opção?</option>

						<option value="Ensino Médio">Ensino Médio</option>
						<option value="Ensino Superior">Ensino Superior</option>
						<option value="Pós">Pós</option>
						<option value="Pós">Mestrado</option>
						<option value="Pós">Doutorado</option>
						<option value="Pós">PHD</option>


					</select>

				</div>








				<div class="col-6">
					<label for="tempo_Experiencia_Funcao">Tempo de experiência
						na área na função atua?</label><br> <select class="custom-select"
						id="tempo_Experiencia_Funcao" name="tempo_Experiencia_Funcao">
						<option value="OpcaoTempo_Experiencia" selected disabled>Escolha
							uma opção?</option>
						<option value="1-2">1-2 anos</option>
						<option value="3-5">3-5 anos</option>
						<option value="mais que 5">mais que 5</option>

					</select>

				</div>








				<div class="col">
					<div class="form-group" id="certificacao">
						<label for=" certificacao">Possui Certificaçoes?</label> <br /> <select
							class="OpSelects" name="certificacao"
							onchange="changeCertificacao(event);">
							<option disabled selected hidden>Selecione</option>
							<option value="Sim">Sim</option>
							<option value="Não">Não</option>

						</select>
					</div>
				</div>



				<div class="col" id="quaisCertificacao" style="display: none">
					<label for="quaisCertificacao" id="quaisCertificacao">Adicionar
						Certificacões?</label> <a class="btn btn-primary"
						href="javascript:void(0)" id="addInputCertificacao"> <span
						class="glyphicon glyphicon-plus" aria-hidden="true"></span> +

					</a>

				</div>



				<div id="dynamicDivCertificacao">
					<p>


						<input name="quaisCertificacao" type="text" id="inputeste"
							size="20" value="" placeholder="Remover" /> <a
							class="btn btn-danger" href="javascript:void(0)"
							id="remInputCertificacao"> <span
							class="glyphicon glyphicon-plus" aria-hidden="true"></span> -

						</a>

					</p>


				</div>


				<div class="col-12" id="idioma">
					<label for="idioma">Idiomas Fluentes?</label>

					<div
						class="content-itens-language d-flex flex-row justify-content-between">

						<div class="d-flex flex-row justify-content-start">
							<label>Inglês</label> <input type="checkbox" name="idiomas[]"
								class="checkbox-control ml-4 mt-4" value="Ingles" />
						</div>

						<div class="d-flex flex-row justify-content-start">
							<label>Espanhol</label> <input type="checkbox" name="idiomas[]"
								class="checkbox-control ml-4 mt-4" value="Espanhol" />
						</div>
						<div class="d-flex flex-row justify-content-start">
							<label>Italiano</label> <input type="checkbox" name="idiomas[]"
								class="checkbox-control ml-4 mt-4" value="Italiano" />
						</div>

						<div class="d-flex flex-row justify-content-start">
							<label>Francês</label> <input type="checkbox" name="idiomas[]"
								class="checkbox-control ml-4 mt-4" value="Francês" />
						</div>
						<div class="d-flex flex-row justify-content-start">
							<label>Alemão</label> <input type="checkbox" name="idiomas[]"
								class="checkbox-control ml-4 mt-4" value="Alemão" />
						</div>

					</div>

				</div>
				<br>




				<div class="col-12" id="restricoes_Locais_Atuacao">
					<label for="restricoes_Locais_Atuacao">Qual a restrição de
						local do atuação ?</label> <input id="restricoes_Locais_Atuacao"
						name="restricoes_Locais_Atuacao" class="form-control" type="text" />
				</div>







				<div class="col" id="interesse_Atuar_Area">
					<label for=" interesse_Atuar_Area">Tem interesse em atuar
						em outra área?</label> <br /> <select class="OpSelects"
						name="interesse_Atuar_Area"
						onchange="changeInteresse_Atuar_Area(event);">
						<option disabled selected hidden>Selecione</option>
						<option value="Sim">Sim</option>
						<option value="Não">Não</option>
					</select>
				</div>




				<div class="col-6" id="qualArea" style="display: none">
					<label for="qualArea">Qual área? </label> <input type="text"
						name="qualArea" id="qualArea" />
				</div>





				<br>


				<div class="form-group col-12">
					<label for="temFilhos">Você tem filhos?</label><br /> <select
						class="form-control custom-select" name="temFilhos"
						onchange="changeTemFilhos(event);">
						<option disabled selected hidden>Selecione</option>
						<option value="Sim">Sim</option>
						<option value="Não">Não</option>
					</select>
				</div>
				<br>

				<div class="col-6" id="quantidadeFilhosIdade" class="col-6"
					style="display: none">
					<label for="quantidadeFilhosIdade">Digite a quantidade de
						filhos? e a idade dos filhos?</label><br /> <input
						id="quantidadeFilhosIdade" type="text"
						name="quantidadeFilhosIdade" />
				</div>


				<br>






				<div class="col">
					<div class="form-group" id="beneficios_Gostaria_Possuir">
						<label for="beneficios_Gostaria_Possuir">Gostaria de
							possuir algum benefício?</label><select
							name="beneficios_Gostaria_Possuir"
							onchange="changeBeneficios_Gostaria_Possuir(event);"
							class="form-control custom-select">
							<option disabled selected hidden>Selecione</option>
							<option>Sim</option>
							<option>Não</option>
						</select>
					</div>
				</div>


				<div class="col-6" id="quaisBeneficios" style="display: none">
					<label for="quaisBeneficios">Quais? </label><br> <input
						type="text" id="quaisBeneficios" name="quaisBeneficios"
						class="form-control" />
				</div>









				<div class="col-6">
					<div class="temas_Interessa_Conhecer" id="temas_Interessa_Conhecer">
						<label for="temas_Interessa_Conhecer">Gostaria de conhecer
							algum tema específico ou de seu interesse? </label><br> <select
							name="temas_Interessa_Conhecer" class="form-control"
							onchange="changeTemas_Interessa_Conhecer(event);">
							<option disabled selected hidden>Selecione</option>
							<option value="Sim">Sim</option>
							<option value="Não">Não</option>
						</select>
					</div>
				</div>


				<div class="col-6" id="quaisTemas_Conhecer" style="display: none">
					<label for="quaisTemas_Conhecer" id="quaisTemas_Conhecer">Adicionar
						temas</label> <a class="btn btn-primary" href="javascript:void(0)"
						id="addInputConhecer"> <span class="glyphicon glyphicon-plus"
						aria-hidden="true"></span> Add

					</a>

				</div>



				<div id="dynamicDivConhecer">
					<p>


						<input name="quaisTemas_Conhecer" type="text" id="inputeste"
							size="20" value="" placeholder="Remover" /> <a
							class="btn btn-danger" href="javascript:void(0)"
							id="remInputConhecer"> <span class="glyphicon glyphicon-plus"
							aria-hidden="true"></span> Deletar

						</a>

					</p>


				</div>
				<br>




				<div class="col-12">
					<div class="temas_Interessa_Ensinar" id="temas_Interessa_Ensinar">
						<label for="temas_Interessa_Ensinar"><br>Gostaria de
							ensinar novos temas. Exemplo: tecnologias, (Quais?) Línguas,
							(Quais?) outros? Comportamentais? (Quais?) <br> Off-topic?
							(Quais?) <br> </label><br> <select class="form-control"
							name="temas_Interessa_Ensinar"
							onchange="changeTemas_Interessa_Ensinar(event);">
							<option disabled selected hidden>Selecione</option>
							<option value="Sim">Sim</option>
							<option value="Não">Não</option>
						</select>
					</div>
				</div>



				<div class="col-6" id="quaisTemas_Ensinar" style="display: none">
					<label for="quaisTemas_Ensinar" id="quaisTemas_Ensinar">Adicionar
						temas</label> <a class="btn btn-primary" href="javascript:void(0)"
						id="addInputEnsinar"> <span class="glyphicon glyphicon-plus"
						aria-hidden="true"></span>Add

					</a>

				</div>



				<div id="dynamicDivEnsinar">
					<p>


						<input type="text" name="quaisTemas_Ensinar" id="inputeste"
							size="20" placeholder="Add" /> <a class="btn btn-danger"
							href="javascript:void(0)" id="remInputEnsinar"> <span
							class="glyphicon glyphicon-plus" aria-hidden="true"></span>Remover

						</a>

					</p>


				</div>


				<br>

				<button type="submit" id="salvaFormulario" value="Salvar"
					name="salvaFormulario" class="btn btn-primary"
					onclick="alert('Formulario Qintess: Eviado com sucesso')">Salvar</button>


			</form:form>
		</div>
		<br>


	</div>
</body>
</html>