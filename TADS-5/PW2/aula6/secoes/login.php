<div class="titulo-pagina">
    <center><p><h1>LOGIN</h1></p></center>
    <center><p><h4>Faça login aqui.</h4></p></center>
</div>

<div class="card-login container card mb-3">
    <div class="card-header"><h4>Login</h4></div>
        <div class="card-body">
            <p class="card-text text-break">
                <div class="center-login">
                    <form method="post" action="adm/validar_cookie.php">
                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label"><h5>Endereço de email</h5></label>
                            <input type="email" name='email' class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        </div>
                        <div class="mb-3">
                            <label for="exampleInputPassword1" class="form-label"><h5>Senha</h5></label>
                            <input type="password" name='password' class="form-control" id="exampleInputPassword1">
                        </div>

                        <div class="btn-group">
                            <button type="submit" class="btn btn-primary">Entrar</button><br/>
                            <a class="btn btn-primary" href="?secao=signup">Cadastre-se</a>
                        </div>
                    </form>
                </div>
            </p>
        </div>
    </div>
    <div id="liveAlertPlaceholder" class="z-3 position-fixed bottom-0 end-0"></div>
</div>

<script>
    const alertPlaceholder = document.getElementById('liveAlertPlaceholder')
    const appendAlert = (message, type) => {
    const wrapper = document.createElement('div')
        wrapper.innerHTML = [
            `<div class="alert alert-${type} alert-dismissible" role="alert">`,
            `   <div>${message}</div>`,
            '   <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>',
            '</div>'
        ].join('')

        alertPlaceholder.append(wrapper)
    }

    const alertTrigger = "<?php echo $_SESSION['jsAlert']; ?>";
    if (alertTrigger != "none") {
        appendAlert(alertTrigger, 'warning');
    }
</script>

<?php
$_SESSION['jsAlert'] = "none";
?>
