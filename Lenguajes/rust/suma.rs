use std::fs::OpenOptions;
use std::io::Write;
use std::time::Instant;

fn main() {
    // Creamos el vector con 10 millones de elementos en orden descendente
    let mut arr: Vec<i32> = (1..=10_000_000).rev().collect();

    // Medimos el tiempo
    let start = Instant::now();
    arr.sort();
    let duration = start.elapsed();

    // Guardamos en resultados.csv
    let mut file = OpenOptions::new()
        .create(true)
        .append(true)
        .open("resultados/resultados.csv")
        .unwrap();
    writeln!(file, "rust,{}", duration.as_millis()).unwrap();

    println!("{}", duration.as_millis());
}