<?php
unset($_COOKIE["email"]);
unset($_SESSION["email"]);
setcookie('email', null, -1, '/'); 
header("Location: ../../?secao=home");
exit();
?>