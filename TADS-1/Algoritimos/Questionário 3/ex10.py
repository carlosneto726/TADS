print("="*5, " Olá ", "="*5)

def n_maior(n1, n2):
    if n1 > n2:
        return n1
    elif n2 > n1:
        return n2

numero1 = int(input("Digite um número: "))
numero2 = int(input("Digite outro número: "))

print(f"O maior dos dois números digitados é: {n_maior(numero1, numero2)}")