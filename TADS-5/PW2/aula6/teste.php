
<center><h1>teste</h1></center>

<?php 
$teste = 0;
function teste(){
    $GLOBALS['teste'] = 1;
}
;?>



<script>
    alert(!true);
</script>


<?php echo $teste; ?>