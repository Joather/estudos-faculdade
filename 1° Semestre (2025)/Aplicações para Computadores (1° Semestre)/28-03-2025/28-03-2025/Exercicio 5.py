# Vamos pedir o valor original da compra
valor_original = float(input("Digite o valor compra: R$"))
# Desconto que será concedido
desconto = float(input("Desconto (em %) para essa compra: "))
# Transformando a porcetagem em número decimal
desconto = desconto / 100
# Exibindo tudo
print("Valor original: R$", valor_original)
print("Desconto ganho: R$", valor_original * desconto)
print("Valor com desconto: R$", valor_original * (1-desconto))