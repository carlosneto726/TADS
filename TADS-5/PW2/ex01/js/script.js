var c = 0;
var valorTotal = 0;

function adicionar(){
    
    var item = document.createTextNode(c+=1);
    var produto = document.createTextNode(document.getElementById("produto").value);
    var valor = document.createTextNode(document.getElementById("valor").value);
    var quantidade = document.createTextNode(document.getElementById("quantidade").value);
    var subTotal = document.createTextNode(parseFloat(document.getElementById("valor").value) * parseFloat(document.getElementById("quantidade").value));

    var tdItem = document.createElement("td");
    var tdProduto = document.createElement("td");
    var tdValor = document.createElement("td");
    var tdQuantidade = document.createElement("td");
    var tdSubTotal = document.createElement("td");
    tdItem.appendChild(item);
    tdProduto.appendChild(produto);
    tdValor.appendChild(valor);
    tdQuantidade.appendChild(quantidade);
    tdSubTotal.appendChild(subTotal);

    var tr = document.createElement("tr");
    tr.appendChild(tdItem);
    tr.appendChild(tdProduto);
    tr.appendChild(tdValor);
    tr.appendChild(tdQuantidade);
    tr.appendChild(tdSubTotal);

    var tbody = document.getElementById("produtos");
    tbody.appendChild(tr);


    var val = parseFloat(document.getElementById("valor").value);
    var qtd = parseFloat(document.getElementById("quantidade").value);
    valorTotal += val * qtd

    document.getElementById("valorTotal").innerHTML = valorTotal

}

function dinheiro(){
    document.getElementById("imagem").src = "img/dinheiro.png";
}
function cartao(){
    document.getElementById("imagem").src = "img/cartao.png";
}



//function colorirLinhas(){}



function finalizar(){
    
}
