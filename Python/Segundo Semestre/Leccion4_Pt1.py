# Lista = Axel, Marcos, Iara, Benicio

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
print(lista) # En esta parte nos mostrara un error
