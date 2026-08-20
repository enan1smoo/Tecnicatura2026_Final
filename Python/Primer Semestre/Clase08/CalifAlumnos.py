# Ejercicio 4: Supongan que se tiene un conjunto de calificaciones de un
#grupo de 10 alumnos. Realizar un algoritmo para calcular la
#calificacion promedio y la calificacion mas baja de todo el grupo
i = 1
calif_baja = 99999
suma = 0
while i <= 10:
    calif = int(input("Digite una calificacion"))
    suma = suma + calif
    if calif < calif_baja:
        calif_baja = calif
    i = i + 1
calif_prom = suma/10
print("")
print(f"La calificacion promedio es: {calif_prom}")
print(f"La calificacion mas baja es: {calif_baja}")
print("")