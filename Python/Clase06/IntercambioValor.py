# Ejercicio 3: Intercambiar el valor de dos variables.

a= int(input("Digite el numero a: "))
b= int(input("Digite el numero b: "))
c= 0

rta= input("Desea intercambiar los valores a y b (si/no): ")

if rta == "si":
    c=b
    b=a
    a=c
    print("a=",a)
    print("b=",b)
else:
    print("No se intercambiaron los valores de a y b.")
    print("a=",a)
    print("b=",b)