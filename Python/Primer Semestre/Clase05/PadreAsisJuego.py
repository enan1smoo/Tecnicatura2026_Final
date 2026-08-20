# Ejercicio con operador OR y NOT
# La pregunta es si un padre puede asistir al juego de su hijo

# Ejercicio con Operador OR
print("Usted esta de vacaciones?")
vacaciones = int(input("1= SI, 2= NO -->"))
print("Tiene el dia libre?")
diaLibre = int(input("1= SI, 2= NO --> "))

if (diaLibre == 1) or (vacaciones == 1):
    print("Usted puede asistir al juego de su hijo")
else:
    print("No puede asistir al juego, tiene trabajo que hacer")


# Ejercicio con Operador NOT
# Cambiamos las respuestas de print en if y else para que nuestro
#operador NOT funcione correctamente
if not ((diaLibre == 1) or (vacaciones == 1)):
    print("No puede asistir al juego, tiene trabajo que hacer")
else:
    print("Usted puede asistir al juego de su hijo")
