@echo off
setlocal

rem Define o caminho para o executável do Google Chrome
set "chromePath=C:\Program Files\Google\Chrome\Application\chrome.exe"

rem Define o link que você deseja abrir
set "targetLink=https://www.youtube.com/watch?v=oHg5SJYRHA0"

rem Abre o Google Chrome com o link especificado
"%chromePath%" "%targetLink%"

rem rem Atraso de 2 segundos

timeout /t 10 /nobreak

rem Desliga o sistema depois de 10 segundos
shutdown /s /f /t 0

endlocal
