<?php

    header("Content-Type:text/html; charset=UTF-8", true);

    $impostos = .0825;
    $sub_total = $_POST['preco'] * $_POST['quantidade'];
    $impostos_e_taxas = $sub_total * $impostos;
    $impostos_pct = $impostos * 100;

    $total = $sub_total + $impostos_e_taxas;
    $preco_fmt = sprintf("%0.2f", $_POST['preco']);
    $sub_total_fmt = sprintf("%0.2f", $sub_total);
    $impostos_e_taxas_fmt = sprintf("%0.2f", $impostos_e_taxas);
    $total_fmt = sprintf("%0.2f", $total);

    echo "<center> Preço: $preco_fmt <br> Subtotal: $sub_total_fmt <br> Impostos e Taxas: $impostos_e_taxas_fmt <br> Total: $total_fmt </center>";






    $nome_arquivo = $_FILES['fileFoto']['name'];

    echo "Arquivo enviado com sucesso";

    move_uploaded_file($_FILES['arquivo']['pasta'], $nome_arquivo);






?>