package com.nagi.cs.canvas.command;

import java.util.Optional;

public interface CommandSupplier {

    Optional<String> getNextCommand();
}
