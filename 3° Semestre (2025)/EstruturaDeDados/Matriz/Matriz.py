# Criando o tabuleiro
tabuleiro = [["O", "O", "X"], ["O", "X", "O"], ["X", "O", "O"]]

# Usando o loop pra percorrer todos os itens e imprimir o tabuleiro

# Loop da linha da matriz
for i in range(len(tabuleiro)):
    # Loop da coluna da matriz
    for j in range(len(tabuleiro[i])):
        # Imprime a peça atual; end="" serve para o Python não pular linha automaticamente
        print(tabuleiro[i][j], end="")

        # Fazer a barra de separação
        if j < 2:
            print(" | ", end="")

    # Print vazio para pular linha
    print()
