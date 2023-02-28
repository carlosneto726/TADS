running = True
while running:
    print("=====Bem Vindo(a) ao Thrift Calculator!=====")
    money = float(input("Digite o valor depositado em R$: "))
    moneyfees = ((0.70 * money) / 100)
    print(f"Sua poupança lhe rendeu R${moneyfees:.2f} á mais neste mês")
    exit = int(input("Deseja sair? Sim[1] Não[0]"))
    if exit == 1:
        running = False 