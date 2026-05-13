# .append() = push
# [-1] = peek
# .pop() = pop

pilha = []  # Criando pilha (Vazia);

pilha.append("Messi")
pilha.append("Neymar")
pilha.append("CR7")

# PEEK - ver o topo sem remover
print(pilha[-1])  # [-1] sempre acessa o último elemento

pilha.pop()
