<?php
    include_once('../dao/manipular_dados.php');

    $manipula = new manipular_dados();

    $email = $_POST['email'];
    $password = $_POST['password'];

    $manipula->setTable("tb_users");
    $users = $manipula->getAllDataTable();
    $user_id;

    foreach($users as $user){
        if($user['email'] == $email){
            if($user['passw'] == $password){
                $user_id = $user['id'];
                break;
            }
        }
    }
?>

<script>
    var userToken = window.localStorage.getItem("userToken");
    window.localStorage.setItem("userToken", '<?php echo $user_id;?>');

    var teste = '<?php echo $user_id ?>';
    
    alert(teste);
</script>