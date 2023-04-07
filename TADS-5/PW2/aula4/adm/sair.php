<?php
session_start();
$_SESSION['userToken'] = 'none';
header("Location: http://localhost/aula4/?secao=login");
exit();
?>