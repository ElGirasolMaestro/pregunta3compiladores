#include "Bashiv2VisitorImpl.h"
#include "Bashiv2BaseVisitor.cs"
#include <cstdlib> // Para std::system()

/**/
antlrcpp::Any BashiV2VisitorImpl::visitScript(Bashiv2Parser::ScriptContext *ctx) {
    //std::cout<<"visitScript\n";
    // Implementa la visita para la regla script
    for (auto statementContext : ctx->statement()) {
        visit(statementContext);
    }
    return nullptr;
}
antlrcpp::Any BashiV2VisitorImpl::visitStatement(Bashiv2Parser::StatementContext *ctx){
    return visitChildren(ctx);
}
antlrcpp::Any BashiV2VisitorImpl::visitCommand(Bashiv2Parser::CommandContext *ctx) {
    std::cout<<"visitCommand\n";
    // Implementa la visita para la regla command
    if (ctx->simpleCommand()) {
        return visit(ctx->simpleCommand());
    } else if (ctx->ifCommand()) {
        return visit(ctx->ifCommand());
    }
    // Añade lógica para otras reglas de command si es necesario
    return nullptr;
}

antlrcpp::Any BashiV2VisitorImpl::visitIfCondition(Bashiv2Parser::IfConditionContext *ctx) {
    std::cout << "visitIfCondition\n";

    // Obtener la condición como una cadena
    std::string condition = ctx->condition()->getText();

    // Puedes procesar la condición según tus necesidades, por ejemplo, imprimir la condición
    std::cout << "Condition: " << condition << std::endl;

    // Continuar visitando el bloque 'then'
    visit(ctx->script());

    return nullptr;
}

antlrcpp::Any BashiV2VisitorImpl::visitPrefixExpression(Bashiv2Parser::PrefixExpressionContext *ctx) {
    std::cout << "visitPrefixExpression\n";

    // Obtener el operador y la expresión
    std::string op = ctx->OPERATOR()->getText();
    std::string expression = ctx->expression()->getText();

    // Puedes procesar la expresión en notación prefijo según tus necesidades
    std::cout << "Prefix Expression: " << op << " " << expression << std::endl;

    // Retornar un valor si es necesario
    return nullptr;
}

antlrcpp::Any BashiV2VisitorImpl::visitNumber(Bashiv2Parser::NumberContext *ctx) {
    std::cout << "visitNumber\n";

    // Obtener el número como una cadena
    std::string number = ctx->getText();

    // Puedes procesar el número según tus necesidades
    std::cout << "Number: " << number << std::endl;

    // Retornar un valor si es necesario
    return nullptr;
}

antlrcpp::Any BashiV2VisitorImpl::visitSimpleCommand(Bashiv2Parser::SimpleCommandContext *ctx) {
    std::cout<<"visitSimpleCommand\n";
    // Obtener todos los tokens WORD
    std::vector<antlr4::tree::TerminalNode *> words = ctx->getTokens(Bashiv2Lexer::WORD);

    // Recorrer los tokens WORD y obtener el texto
    for (auto wordToken : words) {
        std::string wordText = wordToken->getText();
        std::cout << wordText << " ";
    }

    // Imprimir una nueva línea al final
    std::cout << std::endl;

    // Retornar un valor (ajustar según sea necesario)
    return 0; // Por ejemplo, 0 para indicar éxito
}
antlrcpp::Any BashiV2VisitorImpl::visitLoop(Bashiv2Parser::LoopContext *ctx) {
    std::cout<<"visitLoop\n";
    std::string loopType = ctx->WORD(0)->getText();

    if (loopType == "for") {
        // Es un bucle 'for'
        std::string loopVariable = ctx->WORD(1)->getText();

        // Puedes hacer algo con la variable del bucle 'for' si es necesario

        // Resto de la lógica para el bucle 'for'
        if (ctx->WORD(2)->getText() == "in") {
            // Iterar sobre las palabras después de 'in'
            for (size_t i = 3; i < ctx->WORD().size(); ++i) {
                std::string loopIterationValue = ctx->WORD(i)->getText();

                // Puedes hacer algo con el valor de la iteración si es necesario
            }
        }

        // Visitar el cuerpo del bucle 'for'
        visit(ctx->script());
    } else if (loopType == "while") {
        // Es un bucle 'while'

        // Puedes hacer algo con la condición del bucle 'while' si es necesario
        visit(ctx->condition());

        // Visitar el cuerpo del bucle 'while'
        visit(ctx->script());
    }

    return nullptr;
}

antlrcpp::Any BashiV2VisitorImpl::visitIfCommand(Bashiv2Parser::IfCommandContext *ctx) {
    // Generar código para la condición del comando 'if'
    llvm::Value *conditionValue = visit(ctx->condition()).as<llvm::Value *>();

    // Crear bloques básicos para 'then' y 'else'
    llvm::BasicBlock *thenBlock = llvm::BasicBlock::Create(*context, "then", currentFunction);
    llvm::BasicBlock *elseBlock = llvm::BasicBlock::Create(*context, "else");
    llvm::BasicBlock *mergeBlock = llvm::BasicBlock::Create(*context, "ifcont");

    // Crear una instrucción de condición y realizar el salto condicional
    builder->CreateCondBr(conditionValue, thenBlock, elseBlock);

    // Emitir código para el bloque 'then'
    builder->SetInsertPoint(thenBlock);
    visit(ctx->script(0)); // Cuerpo del 'then'
    builder->CreateBr(mergeBlock); // Salto al bloque de fusión después del 'then'

    // Emitir código para el bloque 'else' si existe
    currentFunction->getBasicBlockList().push_back(elseBlock);
    builder->SetInsertPoint(elseBlock);
    if (ctx->script(1)) {
        visit(ctx->script(1)); // Cuerpo del 'else'
    }
    builder->CreateBr(mergeBlock); // Salto al bloque de fusión después del 'else'

    // Establecer el punto de inserción en el bloque de fusión
    currentFunction->getBasicBlockList().push_back(mergeBlock);
    builder->SetInsertPoint(mergeBlock);

    return nullptr;
}
antlrcpp::Any BashiV2VisitorImpl::visitAssignment(Bashiv2Parser::AssignmentContext *ctx) {
    std::cout<<"visitAssignment\n";
    std::string id = ctx->WORD()->getText();
    // Puedes hacer algo con el nombre de la variable si es necesario

    // Visitar la expresión a la derecha de la asignación
    auto value = visitChildren(ctx->expression());

    // Realizar las acciones necesarias para la generación de código LLVM o cualquier otra lógica
    memory[id] = value;
    return visitChildren(ctx);
}
antlrcpp::Any BashiV2VisitorImpl::visitWord(Bashiv2Parser::WordContext *ctx){
    std::string id = ctx->WORD()->getText();
	if (memory.count(id)) return memory[id];
	return std::any();
}

antlrcpp::Any BashiV2VisitorImpl::visitSwitchCommand(Bashiv2Parser::SwitchCommandContext *ctx) {
    std::cout << "visitSwitchCommand\n";
    std::string switchVariable = ctx->WORD()->getText();
    std::cout << "Switch on variable: " << switchVariable << std::endl;
    visit(ctx->switchCases());
    return nullptr;
}

antlrcpp::Any BashiV2VisitorImpl::visitSwitchCases(Bashiv2Parser::SwitchCasesContext *ctx) {
    std::cout << "visitSwitchCases\n";
    for (auto caseCtx : ctx->switchCase()) {
        visit(caseCtx);
    }
    return nullptr;
}

antlrcpp::Any BashiV2VisitorImpl::visitSwitchCase(Bashiv2Parser::SwitchCaseContext *ctx) {
    std::cout << "visitSwitchCase\n";
    std::string caseValue = ctx->NUMBER()->getText();
    std::cout << "Case value: " << caseValue << std::endl;
    return nullptr;
}

antlrcpp::Any BashiV2VisitorImpl::visitOperator(Bashiv2Parser::OperatorContext *ctx) {
    std::cout << "visitOperator\n";
    std::string operatorText = ctx->OPERATOR()->getText();
    std::cout << "Operator: " << operatorText << std::endl;
    return nullptr;
}

antlrcpp::Any BashiV2VisitorImpl::visitExpression(Bashiv2Parser::ExpressionContext *ctx) {
    std::cout << "visitExpression\n";
    for (auto child : ctx->children) {
        visit(child);
    }
    return nullptr;
}
