# El objetivo del programa sera crear un sistema de calificaciones de la sgte manera:
# Le pedimos al usuario que ingrese un valor del 0 al 10.

calificacion = int(input("Ingrese la nota: "))

if calificacion == 9 or calificacion == 10:
    print("La nota es A")
elif calificacion == 8 and calificacion <= 9:
    print("La nota es B")
elif calificacion == 7 and calificacion <= 8:
    print("La nota es C")
elif calificacion == 6 and calificacion <= 7:
    print("La nota es D")
elif calificacion == 0 or calificacion < 6:
    print("La nota es F")
elif calificacion > 10:
    print("El valor ingresado es incorrecto")
