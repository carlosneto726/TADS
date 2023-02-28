running = True
while running:
    print("=====Bem Vindo(a) ao Car Price Calculator!=====")
    carprice = float(input("Digite o valor de fabrica do carro que deseja calcular em R$: "))
    cartax = ((45 * carprice) / 100) + carprice 
    carseller = ((28 * cartax) / 100) + cartax
    print(f"O valor final do carro com impostos e taxas é de R$ {carseller:.2f}")
    exit = int(input("Deseja sair? Sim[1] Não[0]"))
    if exit == 1:
        running = False