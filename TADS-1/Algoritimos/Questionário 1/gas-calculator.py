running = True
while running:
    print("=====Bem Vindo(a) ao Gas Calculator!=====")
    km = float(input("Digite a Distância total percorrida em (Km): "))
    l = float(input("Digite o volume do combustível consumido em (L): "))
    kml = km / l
    print(f"A média de combustível que seu carro consome é de {kml:.1}(Km/L)")
    exit = int(input("Deseja sair? Sim[1] Não[0]"))
    if exit == 1:
        running = False