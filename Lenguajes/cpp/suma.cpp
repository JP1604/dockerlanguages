#include <iostream>
#include <vector>
#include <algorithm>
#include <chrono>
#include <fstream>

int main() {
    // Creamos el vector con 10 millones de elementos en orden descendente
    std::vector<int> arr;
    arr.reserve(10000000);
    for (int i = 10000000; i > 0; i--) {
        arr.push_back(i);
    }

    // Medimos el tiempo
    auto start = std::chrono::high_resolution_clock::now();
    std::sort(arr.begin(), arr.end());
    auto end = std::chrono::high_resolution_clock::now();
    auto diff = std::chrono::duration_cast<std::chrono::milliseconds>(end - start).count();

    // Guardamos en resultados.csv
    std::ofstream file("resultados/resultados.csv", std::ios::app);
    file << "c++," << diff << std::endl;
    file.close();

    std::cout << diff << std::endl;
    return 0;
}