<div class="titulo-pagina">
    <center><p><h1>LOGIN</h1></p></center>
    <center><p><h4>Faça login aqui.</h4></p></center>
</div>



<div class="card-login card mb-3">
    <div class="card-header"><h4>Login</h4></div>
        <div class="card-body">
            <p class="card-text text-break">
                <div class="center-login">
                    <form>
                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label"><h5>Email address</h5></label>
                            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                            <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                        </div>
                        <div class="mb-3">
                            <label for="exampleInputPassword1" class="form-label"><h5>Password</h5></label>
                            <input type="password" class="form-control" id="exampleInputPassword1">
                        </div>
                        <div class="mb-3 form-check">
                            <input type="checkbox" class="form-check-input" id="exampleCheck1">
                            <label class="form-check-label" for="exampleCheck1">Check me out</label>
                        </div>
                        <button type="submit" class="btn btn-primary">Submit</button>
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
