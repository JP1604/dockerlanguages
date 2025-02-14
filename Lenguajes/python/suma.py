import time
import os

# Crea la carpeta 'resultados' si no existe
os.makedirs("resultados", exist_ok=True)

start = time.time()
resultado = sum(range(1, 10_000_000))
end = time.time()

tiempo = int((end - start) * 1000)

# 🔹 Imprime solo el tiempo (para `run.sh`)
print(tiempo)

# Guarda el resultado de la suma
with open("resultados/salida.txt", "w") as file:
    file.write(str(resultado))

# Guarda el tiempo de ejecución
with open("resultados/resultados.csv", "a") as file:
    file.write(f"Python,{tiempo}\n")
