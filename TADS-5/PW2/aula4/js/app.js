// Implementando o Dark/Light Theme
const btn = document.getElementById("checkbox_theme");
const css = document.getElementById("appcss");
const text = document.getElementById("theme_label");
var theme = window.localStorage.getItem("theme");
var token = window.localStorage.getItem("userToken");

if (theme === "Dark"){
    css.href = "./css/app_dark.css";
    btn.checked = true;
    text.innerHTML = "Dark Mode";
}else if(theme === "Light"){
    css.href = "./css/app.css";
    btn.checked = false;
    text.innerHTML = "Light Mode";
}

function change_theme(){
    if(btn.checked == true){
        text.innerHTML = "Dark Mode";
        window.localStorage.setItem("theme", "Dark");
        css.href = "./css/app_dark.css";

    }else{
        text.innerHTML = "Light Mode";
        window.localStorage.setItem("theme", "Light");
        css.href = "./css/app.css";
    } 
}

function checkSession(userToken){
    if (userToken == null){
        alert("bem vindo(a), por favor faça o login ou cadastre-se.");
    }else{
        alert("você está logado com o token" + userToken);
    }
}

function provisory_btn(){
    alert("Desculpe, Ainda não implementamos essa funcionalidade.");
}

