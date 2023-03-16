<?php
    include_once("outra.php");
    
    echo "Hello, World! \n";

    $nova = new outra;

    $valor = 3;

    echo $nova->mais10($valor)."\n";


    function teste(){
        static $a = 0;
        echo $a;
        $a++;
    }

    teste();
    teste();
    teste();




    /*
    define("pi", 3.14);

    $multi = 5*pi;

    echo "$multi";
    */


    // phpinfo()


    /*

    $arr = array(1=>"um", 2=>"dois", 3=>"tres", "a"=>"Letra A");

    list($a, $b, $c, $d) = $arr;

    echo "A: ".$a." B: ".$b." C: ".$c." D: ".$d;

    */

?>