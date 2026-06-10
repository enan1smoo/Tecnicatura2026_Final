# Rango entre las edades 20 y 30 años

edad = int(input("Que edad tienes?: "))

veinte = edad >= 20 and edad < 30
print(veinte)
treinta = edad >= 30 and edad < 40
print(treinta)

if veinte or treinta:
    if veinte:
        print("Estas dentro del rango de los (20\'0) años")
    elif treinta:
        print("Estas dentro del rango de los (30\'0) años")
else:
    print("No estas dentro del rango de edades")

print("") # Salto de linea

# Version simplificada con el operador AND
if (edad >= 20 and edad < 30) or (edad >= 30 and edad < 40):
    print("Estas dentro del rango de los (20\'0) y (30\'0) años")
else:
    print("Estas fuera del rango de edades")