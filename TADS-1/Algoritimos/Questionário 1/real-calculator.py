running = True
while running:
    print("=====Bem Vindo(a) ao Dollar Calculator!=====")
    money = float(input("Digite quanto você tem em US$: "))
    dollar = float(input("Digite a Cotação do Dollar: "))
    valuereal = money * dollar
    print(f"Você tem R$ {valuereal:.2f}")
    exit = int(input("Deseja sair? Sim[1] Não[0]"))
    if exit == 1:
        running = False