# Solicita ao usuário que insira os quatros dígitos  da placa e armazena o valor como um inteiro na variável "Placa"
placa = int(input("Digite os quatros digitos da placa: "))
# Calcula o resto da divisão da variável "placa" por 10. O resultado é o último dígito da placa e é armazenado.
final = placa % 10
if final==1 or final==2:
    print("O veiculo não pode circular as segundas-feiras")
elif final==3 or final==4:
    print("O veiculo não pode circular as terças-feiras")
elif final==5 or final==6:
    print("O veiculo não pode circular as quartas-feiras")
elif final==7 or final==8:
    print("O veiculo não pode circular as quintas-feiras")
else:
    print("O veiculo não pode circular as sextas-feiras")