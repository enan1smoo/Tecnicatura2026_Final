# Ejercicio 4: Etapas de vida

# Pedir edad al usuario y según lo que ingrese decir en que etapa de la vida se encuentra.

edad = int(input("Introduzca su edad: "))

if edad >= 0 and edad <= 10:
    print("La infancia es increíble y bella.")
elif edad > 10 and edad <= 19:
    print("Tienes muchos cambios, mucho que estudiar.")
elif edad >= 20 and edad <= 29:
    print("Amor y comienza el trabajo.")
elif edad >= 30 and edad <= 39:
    print("Estas formando una familia.")
elif edad >= 40 and edad <= 49:
    print("Hay que ponerle vida a los años.")
elif edad >= 50 and edad <= 59:
    print("Estas en un momento de solo disfrutar.")
elif edad >= 60 and edad <= 69:
    print("La familia lo es todo.")
elif edad >= 70 and edad <= 79:
    print("Tienes muchas cosas para contar.")
elif edad >= 80 and edad <= 89:
    print("Comienzas a perder lindos recuerdos.")
elif edad >= 90 and edad <= 100:
    print("Tenes más olor a cajón que a manzanas.")
else:
    print("Estas a la altura de Mirtha")