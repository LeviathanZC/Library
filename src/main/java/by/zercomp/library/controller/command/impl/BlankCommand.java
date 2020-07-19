package by.zercomp.library.controller.command.impl;

import by.zercomp.library.controller.command.Command;
import by.zercomp.library.controller.command.parameter.ResponseParameter;

import java.util.HashMap;
import java.util.Map;

public class BlankCommand implements Command {

    @Override
    public Map<String, Object> execute(Map<String, Object> params) {
        Map<String, Object> response = new HashMap<>();
        response.put(ResponseParameter.STATUS, ResponseParameter.STATUS_FAIL);
        return response;
    }
}
