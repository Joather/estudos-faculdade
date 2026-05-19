# .append() = push
# [-1] = peek
# .pop() = pop

# Criando o Menu Principal
menu_historico = []
print("// ----------------- //")
menu_historico.append("Menu Principal")
print(menu_historico[-1])
print("// ----------------- //")

# 4 "Botões": Novo Jogo, Continuar, Opções, Créditos

# Indo para: Novo Jogo
print(menu_historico[-1])
menu_historico.append(" --> Novo Jogo")
print("Menu Principal" + menu_historico[-1])
menu_historico.append(" --> Save 1:")
print("Menu Principal --> Novo Jogo" + menu_historico[-1])
# Voltando para Menu Principal
menu_historico.pop()
print("Menu Principal" + menu_historico[-1])
menu_historico.pop()
print(menu_historico[-1])

#  Menu Principal
print("// ----------------- //")
print(menu_historico[-1])
print("// ----------------- //")

# Indo para: Continuar
print(menu_historico[-1])
menu_historico.append(" --> Continuar")
print("Menu Principal" + menu_historico[-1])
menu_historico.append(" --> Missão 3")
print("Menu Principal --> Continuar" + menu_historico[-1])
# Voltando para Menu Principal
menu_historico.pop()
print("Menu Principal" + menu_historico[-1])
menu_historico.pop()
print(menu_historico[-1])


# Menu Principal
print("// ----------------- //")
print(menu_historico[-1])
print("// ----------------- //")

# Indo para: Opções
print(menu_historico[-1])
menu_historico.append(" --> Opções")
print("Menu Principal" + menu_historico[-1])
menu_historico.append(" --> Sons")
print("Menu Principal --> Opções" + menu_historico[-1])
# Voltando para Menu Principal
menu_historico.pop()
print("Menu Principal" + menu_historico[-1])
menu_historico.pop()
print(menu_historico[-1])

# Menu Principal
print("// ----------------- //")
print(menu_historico[-1])
print("// ----------------- //")

# Indo para: Créditos:
print(menu_historico[-1])
menu_historico.append(" --> Créditos")
print("Menu Principal" + menu_historico[-1])
print(
    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
)
# Voltando para Menu Principal
menu_historico.pop()
print(menu_historico[-1])

# Menu Principal
print("// ----------------- //")
print(menu_historico[-1])
print("// ----------------- //")
