# En esta clase veremos la sentencia if/else

condicion = True
if condicion:   #Importante el siempre utilizar la identacion
    print("Condicion Verdadera")
else:
    print("Condicion Falsa")


condicion = '' # Al comprobar que la variable esta vacia, en consola mostrara que la condicion es Falsa
if condicion:
    print("Condicion Verdadera")
else:
    print("Condicion Falsa")


condicion = "Hola gente"
if condicion == True:
    print("Condicion Verdadera")
elif condicion == False:
    print("Condicion Falsa")
else:
    print("Condicion sin especificar")