listaRestaurantes = {
    "donnaPizza": 500,
    "cleitonSalgados": 350,
    "padariaJose": 750,
    }
clienteEstaEm = 1000;
menorDistancia = float('inf');
restauranteMaisProximo = "";

for nome, distancia in listaRestaurantes.items():
    resultado = clienteEstaEm - distancia;
    if resultado < menorDistancia:
        menorDistancia = resultado;
        restauranteMaisProximo = nome;

print("Restaurante mais próximo:", restauranteMaisProximo, "-", menorDistancia, "metros");
