# Dockerfile
FROM python:3.11

WORKDIR /app
COPY suma.py .

# Crea la carpeta 'resultados' antes de ejecutar
RUN mkdir -p resultados

CMD ["python", "suma.py"]

