# Calcular la suma de "N" primeros numeros

numN = int(input("Cuantos numeros desea sumar?: "))

i = 1
suma = 0

for i in range(1, numN + 1):
    suma = suma + i
print("El resultado de la suma es: ", suma)
