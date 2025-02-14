const fs = require('fs');
const path = 'resultados';

// Aseguramos que la carpeta exista
if (!fs.existsSync(path)) {
  fs.mkdirSync(path, { recursive: true });
}

const arr = Array.from({ length: 10000000 }, (_, i) => 10000000 - i);
const start = Date.now();
arr.sort((a, b) => a - b);
const end = Date.now();

// Guardamos el resultado en resultados.csv
fs.writeFileSync(`${path}/resultados.csv`, `javascript,${end - start}\n`, { flag: 'a' });

// Mostramos el tiempo de ejecución en la consola
console.log(end - start);