#include <cstdlib>
#include <iostream>
/*int main(int argc, char const *argv[])
{
    // Verifica si se proporcionó al menos un argumento adicional (el comando a ejecutar)
    if (argc <= 1) {
        std::cerr << "Uso: " << argv[0] << " <comando> [argumentos...]\n";
        return 1;
    }

    // Construye una cadena que representa el comando y sus argumentos
    std::string command;
    for (int i = 1; i < argc; ++i) {
        command += argv[i];
        command += ' ';  // Agrega un espacio entre cada argumento
    }

    // Ejecuta el comando utilizando system()
    int result = system(command.c_str());

    if (result != 0) {
        std::cerr << "Error al ejecutar el comando: " << command << "\n";
        return 1;
    }

    return 0;
}*/
