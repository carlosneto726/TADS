<?php

require "../fpdf185/fpdf.php";

$pdf = new FPDF("L","pt","A4");

// Frente
$pdf->AddPage();

$pdf->Image("../img/fundo.jpg",0,0,$pdf->GetPageWidth(), $pdf->GetPageHeight());

$pdf->SetFont('Arial','B',32);
$pdf->Ln(60);
$pdf->MultiCell(0,0,utf8_decode('Certificado de conclusão de curso'),0,"C");

$pdf->SetFont('Arial','B',12);
$pdf->Ln(30);
$texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean congue neque augue, sed vulputate eros accumsan vitae. Proin id justo cursus dolor hendrerit blandit quis eget velit. Pellentesque faucibus dui libero, at aliquam quam rutrum sed. Nam porttitor cursus ante, non iaculis nunc dictum in. Nunc nec fringilla lectus. Donec varius elit eget augue consectetur porta. Vestibulum aliquet sem at condimentum ullamcorper. Vivamus ut ullamcorper lacus, nec elementum justo. Praesent luctus nibh nec ligula luctus, eget pulvinar mi egestas. Aenean eleifend augue quis risus ullamcorper sagittis. Phasellus vel felis nunc. Curabitur vitae nulla quis ex rutrum fringilla ut eget risus. Nulla sit amet orci vitae felis mattis elementum.";
$pdf->SetLeftMargin(40);
$pdf->MultiCell(0,27,utf8_decode($texto),0,"");

$pdf->SetY(470);
$pdf->MultiCell(0, 30, "Assinatura do diretor", 0, "C");


$pdf->Line(250,500,600,500);

// Verso
$pdf->AddPage();

$pdf->Image("../img/fundo.jpg",0,0,$pdf->GetPageWidth(), $pdf->GetPageHeight());

$pdf->SetFont('Arial','B',32);
$pdf->Ln(60);
$pdf->MultiCell(0,0,utf8_decode('Certificado de conclusão de curso'),0,"C");

$pdf->SetFont('Arial','B',12);
$pdf->SetXY(600, 150);
$pdf->MultiCell(0,30,"Verso do certificado");

$pdf->SetY(470);
$pdf->MultiCell(0, 30, "Assinatura do formando", 0, "C");


$pdf->Line(250,500,600,500);



$pdf->Output("I", "certificado.pdf", true);


?>