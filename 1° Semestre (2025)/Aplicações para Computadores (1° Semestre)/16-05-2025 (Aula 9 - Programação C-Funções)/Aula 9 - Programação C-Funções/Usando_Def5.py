# Define uma função que aceita argumentos nomeados variáveis
def saudacao(**kwargs):
    # Verifica se o argumento 'nome' foi passado
    if 'nome' in kwargs:
        print(f"Olá, {kwargs['nome']}!")
    else:
        print("Olá, visitante!")

# Chamada da função com o nome fornecido
saudacao(nome="Maria")

# Chamada da função sem fornecer nome
saudacao()
