package com.mariuszadamowicz.bytecodegeneration.instructions;

import jdk.internal.org.objectweb.asm.MethodVisitor;

public interface Instruction {
    void apply(MethodVisitor methodVisitor);
}