# Ejercicio 1: Diseñar un programa que ingresando un año, nos devuelva
#por consola si es un año bisiesto o no, repetir la accion
#hasta que el usuario lo decida.


opcion = 0
while opcion == 0:
    print("")
    print("Comprobamos que el anio es bisiesto")
    año = int(input("Ingrese un año: "))
    if año % 4 == 0 and año % 100 != 0 or año % 400 == 0:
        print("El año es bisiesto")
        opcion = int(input("Ingrese 1 si dicide finalizar"))
    else:
        print("El año no es bisiesto")
        opcion = int(input("Ingrese 1 si dicide finalizar"))