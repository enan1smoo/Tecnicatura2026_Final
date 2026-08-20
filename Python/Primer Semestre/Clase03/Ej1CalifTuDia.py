calificacion = int(input("¿Cómo estuvo tu día (1 al 10)? "))

if 1 <= calificacion <= 10:
    print(f"Mi día estuvo de: {calificacion}")
else:
    print("Por favor ingresa un número entre 1 y 10.")