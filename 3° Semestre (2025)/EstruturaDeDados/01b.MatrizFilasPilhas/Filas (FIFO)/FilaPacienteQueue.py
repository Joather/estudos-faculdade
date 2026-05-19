# quere.Queue (Ideal para programas com múltiplas threads)
from queue import Queue

# Criando a fila em Queue
fila = Queue()

# Adicionando os pacientes na fila
fila.put("José")  # enqueue
fila.put("João")
fila.put("Maria")

# Removendo o primeiro da fila
primeiro = fila.get()  # dequeue

# Imprimindo resultado
print(f"Atendido agora: {primeiro}")
print(fila.empty())  # Boolean para fila vazia
