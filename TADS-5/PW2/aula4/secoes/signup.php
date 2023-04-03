<div class="titulo-pagina">
    <center><p><h1>Sign up</h1></p></center>
    <center><p><h4>Faça o cadastrado aqui.</h4></p></center>
</div>

<div class="card-login container card mb-3">
    <div class="card-header"><h4>Cadastro</h4></div>
        <div class="card-body">
            <p class="card-text text-break">
                <div class="center-login">
                    <form method="post" action="adm/cadsignup.php">
                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label"><h5>Endereço de email</h5></label>
                            <input type="email" name='email' class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        </div>
                        <div class="mb-3">
                            <label for="exampleInputPassword1" class="form-label"><h5>Senha</h5></label>
                            <input type="password" name='password' class="form-control" id="exampleInputPassword1">
                        </div>
                        <div class="mb-3 form-check">
                        </div>
                        <button type="submit" class="btn btn-primary">Cadastrar</button>
                    </form>
                </div>
            </p>
        </div>
    </div>
</div>

<center>

    <br>
    <br>
    <?php
        include_once("dao/conexao.php");
        $conexao_bd = new conexao();
    ?>
    <br>
    <br>
</center>
