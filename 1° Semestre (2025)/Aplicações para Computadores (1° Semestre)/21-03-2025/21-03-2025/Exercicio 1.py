idade = int(input("Digite sua idade: "))

if idade >= 0 and idade <= 11:
    print("Você é criança")

elif idade >= 12 and idade <= 18:
    print("Você é adolescente")

elif idade >= 19 and idade <= 34:
    print("Você é jovem")

elif idade >= 25 and idade <= 40:
    print("Você é adulto")

elif idade >= 41 and idade <= 60:
    print("Você é meia idade")

elif idade >= 60:
    print("Você é idoso")