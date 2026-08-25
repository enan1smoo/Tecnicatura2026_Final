# Lista = Axel, Marcos, Iara, Benicio
# Colecciones en python

# Las listas es lo que se conoce en otros lenguajes como arreglos o vectores

lista = ["Axel", "Marcos", "Iara", "Benicio"]
print(lista) #Imprimimos todos los elementos dentro de la lista
print(lista[0]) #Imprimimos por posiciones
print(lista[1])
print(lista[3])
print(lista[-1]) # Con el -1 Imprimimos el ultimo elemento de la lista, en caso de, que no se pueda saber cual es la posicion final
print(lista[-2]) # Con el -2 imprimimos el penultimo

print("")

print(lista[0:2]) # Solo muestra el inice 0 y 1 pero no el indice 2
# Ir del inicio de la lista al indice (Sin incluirlo)
print(lista[ :3]) # Indice a mostrar 0, 1 y 2
# Desde el indice indicado hasta el final
print(lista[1: ])

# Modificamos un valor
lista[1] = "Marquitos"
lista[3] = "Astrolopitecus"
print(lista)

print("")

#Iterar una lista
for nombre in lista:
    print(nombre)
else:
    print("Se han acabado los elementos de la lista")

print("")

# Preguntamos cuantos elementos tiene nuestra lista
print(len(lista))

# Agregamos un elemento a nuestra lista
lista.append("Cade")
lista.append([1, 2, 3])
lista.append(True)
lista.append(10.45)
lista.append([4, 5])
lista.append(7)
print(lista)
print(len(lista))

# Insertar un elemento en un indice en especifico
lista.insert(1, "Alberto")
print(lista)
lista.insert(3, "Bumbelbee")
print(lista)

# Eliminamos un elemento
lista.remove("Alberto")
print(lista)

# Eliminar el ultimo elemento
lista.pop()
print(lista)

# Eliminar un indice en especifico
del lista[2] # "del" significa DELETE (eliminar)
print(lista)

# Eliminar, borrar o limpiar todos los elementos de la lista
lista.clear()
print(lista)

# Eliminar la lista
del lista
#print(lista) # En esta parte nos mostrara un error


# Definimos una tupla
cocina = ("cuchara", "cuchillo", "tenedor")
print(len(cocina))

# Acceder a un elemento, para esto utilizaremos corchetes, no parentesis
print(cocina[0])
# mostrar de la manera inversa
print(cocina[-1])

# Como acceder a un rango
print(cocina[0 : 2])

# Ejemplo
verduras = ("papa",) #Aqui aunque se tenga un solo elemento, para que este sea una tupla se necesita poner una coma, ya que sin ella nos toma como que es una cadena de tipo str


# Recorremos los elementos de la tupla
for cocinar in cocina: # Print esta usando el \n para saltos de lineas
    print(cocinar, end=' ') # Usamos "end=" para eliminar los saltos de lineas

#cocina[0] = "plato" No se puede modificar una tupla

#Manera de modificar una tupla (NO es una buena practica realizar esta conversion)
cocinaLista = list(cocina)
cocinaLista[0] = "Plato"
cocina = tuple(cocinaLista)
print("\n",cocina)

# Como eliminar una tupla (se usa el mismo proceso que el de eliminar una lista)
# del cocina


