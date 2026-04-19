numeros = [1,3,6,10,5,23]
numero_digitado = int(input("Digite um número: "))
if numero_digitado in numeros:
    print(f"O número {numero_digitado} está na lista")
else:
    print(f"O número {numero_digitado} não está na lista")