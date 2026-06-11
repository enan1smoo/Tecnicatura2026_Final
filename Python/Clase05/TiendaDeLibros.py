# Ejercicio: Tienda de Libros

print("Ingrese los sgtes datos del libro")
nombre = input("Ingrese el nombre del libro: ")
id = int(input("Ingrese el ID del libro: "))
precio = float(input("Ingrese el precio del libro: "))
envioGratis = input("El envio es gratuito? (True/False): ")

if envioGratis == "True":
    envioGratis = True
elif envioGratis == "False":
    envioGratis = False
else:
    envioGratis = "El dato ingresado es incorrecto, debe escribir True o False"

print(f'''
    Nombre del Libro: {nombre}
    ID: {id}
    Precio: {precio}
    Envio Gratis?: {envioGratis}
''')