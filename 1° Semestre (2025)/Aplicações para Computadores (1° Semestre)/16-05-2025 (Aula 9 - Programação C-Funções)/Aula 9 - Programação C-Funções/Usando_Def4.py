# Define uma função chamada 'adicao' que aceita um número variável de argumentos
def adicao(*args):
    # Inicializa a variável 'resultado' com 0, que armazenará a soma dos argumentos
    resultado = 0
    # Percorre cada valor passado como argumento
    for argumento in args:
        # Adiciona o valor atual à variável 'resultado'
        resultado += argumento
    return resultado

# Chama a função 'adicao' com os argumentos 1 e 2, e imprime o resultado: 1 + 2 = 3
print(adicao(1, 2))
print(adicao(1, 2, 4, 6))
print(adicao(1, 2, 4, 6, 8, 10))