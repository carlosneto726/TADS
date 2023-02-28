n = int(input())

cem = int(n / 100)
ncem = n - (cem * 100)

cinquenta = int(ncem / 50)
ncinquenta = ncem - (cinquenta * 50)

vinte = int(ncinquenta / 20)
nvinte = ncinquenta - (vinte * 20)

dez = int(nvinte / 10)
ndez = nvinte - (dez * 10)

cinco = int(ndez / 5)
ncinco = ndez - (cinco * 5)

dois = int(ncinco / 2)

um = ncinco - (dois * 2)

print(f"{n}")
print(f"{cem} nota(s) de R$ 100,00")
print(f"{cinquenta} nota(s) de R$ 50,00")
print(f"{vinte} nota(s) de R$ 20,00")
print(f"{dez} nota(s) de R$ 10,00")
print(f"{cinco} nota(s) de R$ 5,00")
print(f"{dois} nota(s) de R$ 2,00")
print(f"{um} nota(s) de R$ 1,00")