a = int(input("Digite un numero: "))

print(f"El residuo de la division es: {a % 2}")

if a % 2 == 0:
    print(f"El numero {a} es PAR")
else:
    print(f"El numero {a} es IMPAR")