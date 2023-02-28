print("="*5, " Olá ", "="*5)
print("Digite vários números para que possam ser contados, e quando acabar digite um número negativo.")
c1 = c2 = c3 = c4 = 0 
while True:
    n = float(input("Digite um número: "))
    
    if n < 0:
        break

    if 0 <= n <= 25:
        c1 += 1
    elif 26 <= n <= 50:
        c2 += 1
    elif 51 <= n <= 75:
        c3 += 1
    elif 76 <= n <= 100:
        c4 += 1

print(f"no intevalo de 0 a 25, você digitou {c1} vezes.")
print(f"no intevalo de 26 a 50, você digitou {c2} vezes.")
print(f"no intevalo de 51 a 75, você digitou {c3} vezes.")
print(f"no intevalo de 76 a 100, você digitou {c4} vezes.")
