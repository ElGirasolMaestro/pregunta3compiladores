#include <iostream>
#include <string>

#include "Bashiv2Visitor.cs"
#include "antlr4-runtime.h"
#include "Bashiv2Lexer.h"
#include "Bashiv2Parser.h"

int main() {
    std::string inputString;
    std::cout << "Ingrese los comandos (presione Ctrl+D o Ctrl+Z + Enter para finalizar):\n";
    std::cout << "bashi> ";
    // Leer datos de forma iterativa desde la entrada estándar
    while (std::getline(std::cin, inputString)) {
        std::cout << "bashi> ";
        antlr4::ANTLRInputStream input(inputString);
        Bashiv2Lexer lexer(&input);
        antlr4::CommonTokenStream tokens(&lexer);
        Bashiv2Parser parser(&tokens);
        auto tree = parser.script();
        BashiV2VisitorImpl eval;
        eval.visitScript(tree);

        // Llamadas a las funciones agregadas
        eval.generateIR();
        eval.optimizeIR();
        eval.executeRealTime();
    }

    return 0;
}
