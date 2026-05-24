pesoCarro = int(input('Qual o peso do carro?:'));
potenciaHP = int(input('Qual a potência do carro (Em HorsePower)?:'));

def calcularPesoPotencia (pesoCarro, potenciaHP):
    return (pesoCarro ** 2) + (3 * potenciaHP) - 10
resultado = calcularPesoPotencia(pesoCarro, potenciaHP);
print(pesoCarro, potenciaHP, resultado);
