print("="*5, " Olá ", "="*5)

lista1 = [1, 2, 0, 7, 3]
lista2 = [3, 1, 5, 9, 6]
lista1copy = lista1[:]
lista2copy = lista2[:]
for l1 in lista1:
    for l2 in lista2:
        if l1 == l2:
            lista1.remove(l1)
            lista2.remove(l2)

lista3 = lista1 + lista2
print(f"Este é o resultado da soma da lista1 {lista1copy} com a lista2 {lista2copy} sem números repitidos: {lista3}.")