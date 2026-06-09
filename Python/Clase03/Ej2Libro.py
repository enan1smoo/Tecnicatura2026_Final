# Ejercicio: Información de un libro

print("=== Registro de libro ===")

# Pedir título (validando que no esté vacío)
titulo = input("Proporciona el título: ").strip()
while titulo == "":
    print("El título no puede estar vacío.")
    titulo = input("Proporciona el título: ").strip()

# Pedir autor (validando que no esté vacío)
autor = input("Proporciona el autor: ").strip()
while autor == "":
    print("El autor no puede estar vacío.")
    autor = input("Proporciona el autor: ").strip()

# Mostrar resultado formateado
print("\n=== Resultado ===")
print(f"El libro \"{titulo}\" fue escrito por {autor}.")