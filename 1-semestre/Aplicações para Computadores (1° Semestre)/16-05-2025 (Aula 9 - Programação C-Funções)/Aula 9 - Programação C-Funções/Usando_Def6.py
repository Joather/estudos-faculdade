def apresentar_pessoa(**info):
    print("Informações da Pessoa:")
    for chave, valor in info.items():
        print(f"{chave}: {valor}")
# Chamando a função com diferentes informações
apresentar_pessoa(nome="Daniel", idade=22, profissao="Operador de Máquina Fixa")
print("-" * 20)