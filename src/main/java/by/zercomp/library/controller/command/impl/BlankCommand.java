package by.zercomp.library.controller.command.impl;

import by.zercomp.library.controller.command.Command;

import java.util.Map;

public class BlankCommand implements Command {

    @Override
    public Map<String, Object> execute(Map<String, Object> params) {
        return null;
    }
}
