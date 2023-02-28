const TEMPO_INICIO = 15;
const QTD_MATHEUSES = 50;

var pontos = 0;
var tempo;
var timer;

function contarTempo(){
	tempo--;
	document.getElementById('tempo').innerHTML = tempo;

	if(tempo<=0){
		clearInterval(timer);
		alert('parabens! voce pegou ' + pontos + ' Matheuses.')
		iniciarJogo();
	}
}

function iniciarJogo(){
	tempo = TEMPO_INICIO;
	pontos = 0;
	document.getElementById('tela').innerHTML = '';
	for(let i = 0; i < QTD_MATHEUSES; i++){
		var imgs = document.createElement('img');
		imgs.src = 'imagens/de_frente.png';
		imgs.id='matheus'+(i+1);
		imgs.onclick = function(){pegarMatheus(this);}
		document.getElementById('tela').appendChild(imgs);
	}
	document.getElementById('tempo').innerHTML = tempo;
	document.getElementById('pontos').innerHTML = pontos;
	timer = setInterval(contarTempo, 1000);
}


function pegarMatheus(elemento){
	pontos++;
	elemento.src = 'imagens/de_lado.png';
	elemento.onclick = null;
	document.getElementById('pontos').innerHTML = pontos;
}

