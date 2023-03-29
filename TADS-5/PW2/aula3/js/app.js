// Implementando o Dark/Light Theme
const btn = document.getElementById("checkbox_theme");
const css = document.getElementById("appcss");
const text = document.getElementById("theme_label");
const theme = window.localStorage.getItem("theme");

if (theme === "Dark"){
    css.href = "./css/app_dark.css";
}else{
    css.href = "./css/app.css";
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

function provisory_btn(){
    alert("Desculpe, Ainda não implementamos essa funcionalidade.");
}
