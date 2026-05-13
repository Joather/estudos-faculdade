def eleva_ao_quadrado(n):
    return n ** 2  # Retorna n elevado ao quadrado

def eleva_ao_cubo(n):
    return n ** 3  # Retorna n elevado ao cubo

def eleva_a_6(n):
    return eleva_ao_quadrado(eleva_ao_cubo(2))  # Eleva 2 ao cubo e depois o resultado ao quadrado

print(eleva_a_6(2))

# A equação será (2³)² = (8)² = 64