print("=====Bem Vindo(a)=====")
nome = input("Digite o seu nome: ")
idade = int(input("Digite a sua idade: "))
sexo = input("Digite o seu sexo Masculino[M] Feminino[F]: ")

if idade == 18 and sexo == 'M' or sexo =='m':
    print(f"Por favor {nome}, compareça a junta militar mais proxima.")
elif idade > 18 or idade < 18:
    print(f"{nome}, Tenha um bom dia.")
else:
    print("Não entendi.")