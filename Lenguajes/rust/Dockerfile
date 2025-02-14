FROM rust:latest
WORKDIR /app
COPY suma.rs .
RUN mkdir -p resultados
RUN rustc suma.rs
CMD ["./suma"]