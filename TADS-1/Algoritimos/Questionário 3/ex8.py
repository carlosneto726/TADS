print("="*5, " Olá ", "="*5)
nlista = [7, 2, 10, 4, 9, 6, 1, 8, 5, 3]
nlista.sort()
soma = 0
for numeros in nlista:
    soma += numeros
media = soma / len(nlista)
print(f"O menor valor da lista {nlista} é {nlista[0]}, o maior valor é {nlista[len(nlista)-1]} e a média é {media}")
