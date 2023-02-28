running = True
while running:
    print("=====Bem Vindo(a) ao Test Grade Calculator!=====")
    name = str(input("Digite o nome do Aluno(a)"))
    test1 = float(input("Digite a nota de uma prova: "))
    test2 = float(input("Digite a nota de uma outra prova: "))
    test3 = float(input("Digite a nota de mais uma prova: "))
    media = (test1 + test2 + test3) / 3
    print(f"A Média das provas do(a) {name} foi de {media:.1f}")
    if media < 6:
        print("Estude mais da próxima vez :(")
    elif media >= 6:
        print("Muito bem, continue assim :)")
    exit = int(input("Deseja sair? Sim[1] Não[0]"))
    if exit == 1:
        running = False