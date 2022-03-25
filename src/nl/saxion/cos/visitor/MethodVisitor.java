package nl.saxion.cos.visitor;

import nl.saxion.cos.SexyLangBaseVisitor;
import nl.saxion.cos.SexyLangParser;

public class MethodVisitor extends SexyLangBaseVisitor<Void> {
    @Override
    public Void visitBedActivityStmt(SexyLangParser.BedActivityStmtContext ctx) {
        return super.visitBedActivityStmt(ctx);
    }
}
