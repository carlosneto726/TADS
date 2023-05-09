<?php
unset($_COOKIE["email"]);
setcookie('email', null, -1, '/'); 
header("Location: http://localhost/aula6/?secao=login");
exit();
?>