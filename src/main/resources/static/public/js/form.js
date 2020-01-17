function changeInteresse_Atuar_Area(event) {
	if (event.target.value == 'Sim') {
		document.getElementById("qualArea").style.display = "block";
	} else {
		document.getElementById("qualArea").style.display = "none";

	}
}

function changeCertificacao(event) {
	if (event.target.value == 'Sim') {
		document.getElementById("quaisCertificacao").style.display = "block";
	} else {
		document.getElementById("quaisCertificacao").style.display = "none";

	}
}

function changeBeneficios_Gostaria_Possuir(event) {
	if (event.target.value == 'Sim') {
		document.getElementById("quaisBeneficios").style.display = "block";
	} else {
		document.getElementById("quaisBeneficios").style.display = "none";

	}
}

function changeTemas_Interessa_Conhecer(event) {
	if (event.target.value == 'Sim') {
		document.getElementById("quaisTemas_Conhecer").style.display = "block";
	} else {
		document.getElementById("quaisTemas_Conhecer").style.display = "none";

	}
}

function changeTemas_Interessa_Ensinar(event) {
	if (event.target.value == 'Sim') {
		document.getElementById("quaisTemas_Ensinar").style.display = "block";
	} else {
		document.getElementById("quaisTemas_Ensinar").style.display = "none";

	}
}

function changeTemFilhos(event) {
	if (event.target.value == 'Sim') {
		document.getElementById("quantidadeFilhosIdade").style.display = "block";
	} else {
		document.getElementById("quantidadeFilhosIdade").style.display = "none";

	}
}

$(function() {
	var scnDiv = $('#dynamicDivCertificacao');
	scnDiv.hide(); // display: none

	$(document)
			.on(
					'click',
					'#addInputCertificacao',
					function() {
						scnDiv.show(); // display: block;

						$(
								'<p>'
										+ '<input type="text" id="inputeste" size="20" value="" placeholder="" /> '
										+ '<a class="btn btn danger" href="javascript:void(0)" id="remInput"> '
										+ '<span class="glyphicon glyphicon-minus" aria-hidden="true"</span> '
										+ '-' + '</a>' + '</p>').appendTo(
								scnDiv);

						return false;

					});
	$(document).on('click', '#remInputCertificacao', function() {
		$(this).parents('p').remove();
		return false;

	});

});

$(function() {
	var scnDiv = $('#dynamicDivConhecer');
	scnDiv.hide(); // display: none

	$(document)
			.on(
					'click',
					'#addInputConhecer',
					function() {
						scnDiv.show(); // display: block;

						$(
								'<p>'
										+ '<input type="text" id="inputeste" size="20" value="" placeholder="" /> '
										+ '<a class="btn btn danger" href="javascript:void(0)" id="remInput"> '
										+ '<span class="glyphicon glyphicon-minus" aria-hidden="true"</span> '
										+ '-' + '</a>' + '</p>').appendTo(
								scnDiv);
						return false;

					});
	$(document).on('click', '#remInputConhecer', function() {
		$(this).parents('p').remove();
		return false;

	});

});

$(function() {
	var scnDiv = $('#dynamicDivEnsinar');
	scnDiv.hide(); // display: none

	$(document)
			.on(
					'click',
					'#addInputEnsinar',
					function() {
						scnDiv.show(); // display: block;

						$(
								'<p>'
										+ '<input type="text" id="inputeste" size="20" value="" placeholder="" /> '
										+ '<a class="btn btn danger" href="javascript:void(0)" id="remInput"> '
										+ '<span class="glyphicon glyphicon-minus" aria-hidden="true"</span> '
										+ '-' + '</a>' + '</p>').appendTo(
								scnDiv);
						return false;

					});
	$(document).on('click', '#remInputEnsinar', function() {
		$(this).parents('p').remove();
		return false;

	});

});


