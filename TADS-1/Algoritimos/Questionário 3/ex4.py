print("="*5, " Olá ", "="*5)

N = input('Digite um ou mais números separados por um espaço " ": ').split()

for c in range(0, len(N)):
    if float(N[c]) < 0:
        print(f"O numero {float(N[c])} é negativo.")
    elif float(N[c]) > 0:
        print(f"O numero {float(N[c])} é positivo.")
    elif float(N[c]) == 0:
        print(f"O numero {float(N[c])} é igual á zero.")
