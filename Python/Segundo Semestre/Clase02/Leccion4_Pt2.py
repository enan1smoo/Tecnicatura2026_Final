# Colecciones en Python

 # Tipo set (Tambien conocido como conjunto)
 # Estos nos permiten evitar elementos duplicados o repetidos
planetas = {"Marte", "Jupiter", "Venus"}
print(len(planetas)) # Usamos la funcion "len = length" la cual significa largo

# Revisar si un elemento existe o no, dentro de un set
print("Marte" in planetas) # Siempre tener cuidado a la hora de poner bien un elemento, respetar Mayusculas, acentos, etc

# Agregar un elemento
planetas.add("Tierra") # "add" es una funcion
planetas.add("Tierra") # No se pueden agregar elementos duplicados o repetidos
print(planetas)

# Eliminar elementos, puede arrojar un error si el elemento no existe
planetas.remove("Jupiter") # Esta funcion ante un mal ingresp u inexistencia del elemento da error
print(planetas)
planetas.discard("tierra") # Esta funcion no nos presenta ningun error
print(planetas)

# Limpiar set
planetas.clear()
print(planetas)

# Eliminar set
# del planetas Al eliminar nos muestra un error
#print(planetas)

print("")

# "Messi" : 10 Un diccionario esta compuesto por dos elementos
# UNA LLAVE Y UN VALOR
# dict(key, value)
diccionario = {
    "IDE" : "Integrated Development Enviroment",
    "POO" : "Programacion Orientada a Objetos",
    "SABD" : "Sistema de Administracion de Base de Datos",
}
# Verificar la cantidad de elementos dentro del diccionario
print(len(diccionario))
print(diccionario)

# Acceder a un diccionario con la llave(key)
print(diccionario["IDE"])

# Otra forma de recuperar un elemento (con la funcion "get")
print(diccionario.get("POO"))
print(diccionario.get("SABD"))

# Modificamos elementos
diccionario["IDE"] = "Entorno de Desarrollo Integrado"
print(diccionario)

# Como recorrer los elementos
for termino in diccionario: # Recorremos mostrando solo las llaves
    print(termino)

# Necesitamos una funcion para recorrer un diccionario (en este caso, la funcion "items")
for termino, valor in diccionario.items():
    print(termino, valor)

# Otras maneras de acceder a un diccionario
for termino in diccionario.keys(): # Estamos usando una funcion que
    print(termino) # muestra solo las llaves

for valor in diccionario.values(): # Usamos una funcion para acceder a los valores
    print(valor)

# Comprobar la existencia de algun elemento
print("IDE" in diccionario) # Devuelve un valor boolean

# Agregar un elemento
diccionario["PK"] = "Primary Key"
print(diccionario)

# Eliminar un elemento
diccionario.pop("SABD")
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar diccionario
#del diccionario # EL diccionario se borro
print(diccionario)

# Concatenamos listas
lista1 = [1, 2, 3, 1]
lista2 = [4, 5, 6, 1]
lista3 = lista1 + lista2 # Concatenamos
print(lista3)

lista3.extend([7, 8, 9, 1]) # Funcion para agregar varios elementos a una lista
print(lista3)

print(lista3.index(5)) # Funcion para ubicar en que indice esta el valor ingresado
# print(lista3.index(0)) # esto daria un error por no ser el elemento parte de la lista

# Como saber cuantos valores repetidos hay en una lista
print(lista3.count(1)) # Cuenta cuantos valores iguales hay dentro de la lista

# Para poner la lista al reves
lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos
lista3 = lista3 * 2
print(lista3)

# Metodos de ordenamiento (en python es una funcion)
lista3.sort()
print(lista3)
# De manera descendente
lista3.sort(reverse=True)
print(lista3)

print("")

# Repaso de Tuplas
tupla = (4, "Que onda", 3.56, [1, 23, 78], 4, "Que onda")
print(tupla)

print(4 in tupla) # Accion booleana, su respuesta es de tipo booleana
# Lo que podemos usar dentro de tuplas son: index, count, len
# En tuplas se pude convertir de tupla a lista y de lista a tupla



