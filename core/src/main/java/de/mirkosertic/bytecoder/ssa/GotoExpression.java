/*
 * Copyright 2017 Mirko Sertic
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.mirkosertic.bytecoder.ssa;

import java.util.List;

import de.mirkosertic.bytecoder.core.BytecodeOpcodeAddress;

public class GotoExpression extends Expression {

    private final BytecodeOpcodeAddress jumpTarget;
    private final List<Variable> remainingStack;

    public GotoExpression(BytecodeOpcodeAddress aJumpTarget, List<Variable> aRemainingStack) {
        jumpTarget = aJumpTarget;
        remainingStack = aRemainingStack;
    }

    public BytecodeOpcodeAddress getJumpTarget() {
        return jumpTarget;
    }

    public List<Variable> getRemainingStack() {
        return remainingStack;
    }
}
