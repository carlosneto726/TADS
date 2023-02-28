print("="*5, " Olá ", "="*5)
print("Os números entre 1000 e 1999, que divididos por 11, os seus restos é igual á 5. são: ")
for c in range(1000, 2000):
    if c % 11 == 5:
        print(c, end=" ")