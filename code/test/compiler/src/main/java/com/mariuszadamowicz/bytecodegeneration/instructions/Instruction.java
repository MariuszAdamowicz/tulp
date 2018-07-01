package com.mariuszadamowicz.bytecodegeneration.instructions;

import org.objectweb.asm.MethodVisitor;

public interface Instruction {
    void apply(MethodVisitor methodVisitor);
}