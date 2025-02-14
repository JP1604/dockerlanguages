FROM gcc:latest
WORKDIR /app
COPY suma.cpp .
RUN mkdir -p resultados
RUN g++ suma.cpp -o suma -O2
CMD ["./suma"]