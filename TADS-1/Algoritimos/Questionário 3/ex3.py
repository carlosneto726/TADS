print("="*5, " Olá ", "="*5)
print("Digite dois números para vermos o intervalo fechado entre os mesmos.")

n1 = int(input("Digite um número: "))
n2 = int(input("Digite outro número: "))

l = [n1, n2]
l.sort()

print("O intervalo requisitado é: ")
for n in range(l[0], l[1] + 1):
    print(f"{n}", end=" ")
