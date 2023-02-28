var c = 0;

function questoes(){
	var respostasQ1 = document.getElementsByName('q1');
	var respostasQ2 = document.getElementsByName('q2');
	var respostasQ3 = document.getElementsByName('q3');
	var respostasQ4 = document.getElementsByName('q4');

	for(let i = 0; i < respostasQ1.length; i++){
		if(respostasQ1[i].checked){
			if (respostasQ1[i].value == 'a'){
				c+=1;
			}
		}
	}

	for(let i = 0; i < respostasQ2.length; i++){
		if(respostasQ2[i].checked){
			if (respostasQ2[i].value == 'b'){
				c+=1;
			}
		}
	}
	for(let i = 0; i < respostasQ3.length; i++){
		if(respostasQ3[i].checked){
			if (respostasQ3[i].value == 'c'){
				c+=1;
			}
		}
	}
	for(let i = 0; i < respostasQ4.length; i++){
		if(respostasQ4[i].checked){
			if (respostasQ4[i].value == 'd'){
				c+=1;
			}
		}
	}


	document.getElementById('acertos').innerHTML += c;
	document.getElementById('erros').innerHTML += 4 - c;

	c=0;

}

