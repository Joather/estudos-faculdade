import math
num = float(input("Digite um número real: "))
absoluto = math.fabs(num)
inteiro = math.trunc(num )
raiz = math.sqrt(absoluto)
fatorial = math.factorial(inteiro)

print("Absoluto:", absoluto)
print("Inteiro: ", inteiro)
print("Raiz: ", raiz)
print("Fatorial: ", fatorial)