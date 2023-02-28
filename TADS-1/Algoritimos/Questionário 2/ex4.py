print('=====Companhia de Seguros=====')
nome = input('Digite o seu nome: ')
idade = int(input('Digite a sua idade: '))
if idade < 17 or idade > 70:
    print('Você não tem a idade minima/máxima necessaria.')
else:
    print('Baixo[1] Médio[2] Alto[3]')
    gprisco = int(input('Digite o grupo de risco á qual pertence: '))

    if 17 <= idade <= 20:
        gprisco = gprisco
    elif 21 <= idade <= 24:
        gprisco = gprisco + 1
    elif 25 <= idade <= 34:
        gprisco = gprisco + 2
    elif 35 <= idade <= 64:
        gprisco = gprisco + 3
    elif 65 <= idade <= 70:
        gprisco = gprisco + 6
    print(f'Olá {nome}, a idade informada foi de {idade} e o(a) Senhor(a) se encaixa na categoria {gprisco}')
