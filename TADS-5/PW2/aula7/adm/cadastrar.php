<div class="position-relative">
    <div class="titulo-pagina">
        <center><p><h1>CADASTRO</h1></p></center>
        <center><p><h4>Faça o cadastrado aqui.</h4></p></center>
    </div>

    <div class="card-login container card mb-3">
        <div class="card-header"><h4>Cadastro</h4></div>
            <div class="card-body">
                <p class="card-text text-break">
                    <div class="center-login">

                        <form method="post" action="adm/cadsignup.php" enctype="multipart/form-data">

                            <div class="mb-3">
                                <label class="form-label">Usuário</label>                            
                                <div class="input-group mb-3">
                                    <input type="email" name="email" class="form-control" id="exampleInputEmail1" placeholder="E-mail" aria-label="Recipient's username" aria-describedby="emailHelp">
                                    <span class="input-group-text" id="basic-addon2">user@example.com</span>
                                </div>

                                <div class="input-group mb-3">
                                    <input type="password" name='password' class="form-control" id="exampleInputPassword1" placeholder="Password" aria-label="Password" aria-describedby="basic-addon1">
                                    <span class="input-group-text" id="basic-addon1">Use sua melhor senha.</span>                                
                                </div>
                            </div>

                            <div class="mb-3">
                                <label for="basic-url" class="form-label">Sua loja</label>
                                <div class="input-group">
                                    <input type="text" name='nomeloja' class="form-control" placeholder="Nome da sua loja" aria-describedby="basic-addon1">
                                    <span class="input-group-text" id="basic-addon3">Digite o nome da sua loja.</span>
                                </div>

                                <div class="input-group">                                    
                                    <textarea class="form-control" name="descloja" placeholder="ex: Montadora de carros." aria-label="With textarea" aria-describedby="basic-addon6"></textarea>
                                    <span class="input-group-text">Uma breve descrição da sua loja.</span>
                                </div>
                                <div class="form-text" id="basic-addon4">Example help text goes outside the input group.</div>
                            </div>

                            <label class="btn btn-primary btn-sm custom-file-upload">
                                Inserir imagem
                                <input type="file" id="file-input" name="image"/>
                            </label>
                            <button type="submit" class="btn btn-primary">Cadastrar</button>
                        </form>

                    </div>
                </p>
            </div>
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
        appendAlert(alertTrigger, 'success');
    }
</script>

<?php
$_SESSION['jsAlert'] = "none";
?>