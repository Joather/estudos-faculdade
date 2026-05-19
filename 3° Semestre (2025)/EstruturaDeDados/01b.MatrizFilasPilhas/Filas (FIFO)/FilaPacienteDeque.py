# Mais recomendada para o dia a dia
from collections import deque

# Criando a fila
fila = deque()

# Adicionando (Igual ao offer/addLast)
fila.append("José")
fila.append("João")
fila.append("Maria")

# Saída da fila até o momento
print(f"Fila atual: {list(fila)}")
# Removendo o primeiro da fila (Equivalente ao poll)
# O popleft() remove e retorna o primeiro elemento
atendido = fila.popleft()

print(f"Atendido agora: {atendido}")
print(f"Próximos da fila: {list(fila)}")
