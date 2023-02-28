running = True
while running:
    print("=====Bem Vindo(a) ao Item Price Calculator!=====")
    itemprice = float(input("Digite o valor do produto R$: "))
    itempercent = float(input("Digite a porcentagem á ser calculada: "))
    itemvalue = ((itempercent * itemprice) / 100) + itemprice
    print(f"O valor final do produto é R$ {itemvalue:.2f}")
    exit = int(input("Deseja sair? Sim[1] Não[0]"))
    if exit == 1:
        running = False

        47,5