estoque = {}

def adicionar_item(nome, quantidade):
    """Adiciona um novo item ao estoque ou atualiza a quantidade se já existir."""
    if nome in estoque:
        estoque[nome] += quantidade
        print(f"Quantidade de '{nome}' atualizada para {estoque[nome]}.")
    else:
        estoque[nome] = quantidade
        print(f"'{nome}' adicionado ao estoque com quantidade {quantidade}.")

def remover_item(nome, quantidade):
    """Remove uma certa quantidade de um item do estoque."""
    if nome in estoque:
        if estoque[nome] >= quantidade:
            estoque[nome] -= quantidade
            print(f"{quantidade} unidades de '{nome}' removidas do estoque. Resta {estoque[nome]}.")
            if estoque[nome] == 0:
                del estoque[nome]
                print(f"'{nome}' acabou no estoque.")
            else:
                print(f"Não há quatidade suficiente de '{nome}' no estoque para remover.")
        else:
            print(f"'{nome}' não encontrado no estoque.")
def exibir_estoque():
    """Exibe todos os itens e sua respectivas quantidades no estoque."""
    if estoque:
        print("\n--- Estoque Atual ---")
        for item, quantidade in estoque.items():
            print(f"{item}: {quantidade}")
        print("-------------------------")
    else:
        print("O estoque está vázio.")
# Loop principal para interagir com o usurário
while True:
    print("\n--- Menu ---")
    print("1. Adicionar item")
    print("2. Remover item")
    print("3. Exibir estoque")
    print("4. Sair")

    opcao = input("Escolha uma opção: ")

    if opcao == '1':
        nome_item = input("Digite o nome do item: ")
        try:
            quantidade_item = int(input("Digite a quantidade a adicionar: "))
            if quantidade_item > 0:
                adicionar_item(nome_item, quantidade_item)
            else:
                print("A quantidade deve ser maior que zero.")
        except ValueError:
            print("Por favor, digite um número inteiro para a quantidade.")
    elif opcao == '2':
        nome_item = input("Digite o nome do item a remover: ")
        try:
            quantidade_remover = int(input("Digite a quantidade a remover: "))
            if quantidade_remover > 0:
                remover_item(nome_item, quantidade_remover)
            else:
                (print("A quantidade deve ser maior que zero."))
        except ValueError:
            print("Por favor, digite um número inteiro para a quantidade.")
    elif opcao == '3':
        exibir_estoque()
    elif opcao == '4':
        print("Saindo do controle de estoque.")
        break
    else:
        print("Opção inválidade. Por favor, escolhe uma das opções do menu.")
        