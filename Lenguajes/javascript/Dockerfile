FROM node:20-alpine
WORKDIR /app
COPY suma.js .
RUN mkdir -p resultados
CMD ["node", "--max-old-space-size=4096", "suma.js"]
