running = True
while running:
    print("=====Bem Vindo(a) ao Pants Calculator!=====")
    p = int(input("Quantas calças (P) vai levar?: "))
    m = int(input("Quantas calças (M) vai levar?: "))
    g = int(input("Quantas calças (G) vai levar?: "))
    finalvalue = (p * 10) + (m * 12) + (g * 15)
    print(f"O valor Final da compra foi de R$ {finalvalue:.2f}")
    exit = int(input("Deseja sair? Sim[1] Não[0]"))
    if exit == 1:
        running = False