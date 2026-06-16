# Ejercicio 3: Calular la estacion del año

mes = int(input("Ingrese un mes del año (1-12): "))

estacion = None

if mes < 1 or mes > 12:
    print("Mes invalido, debe ingresar un numero entre el 1 y 12")
else:
    if mes >= 1 and mes <= 3:
        estacion = "Verano"
    elif mes >= 4 and mes <= 6:
        estacion = "Otoño"
    elif mes >= 7 and mes <= 9:
        estacion = "Invierno"
    else:
        estacion = "Primavera"

if estacion != None:
    print(f"La estacion del año es: {estacion}")
