package by.zercomp.library.controller.invoker;

import by.zercomp.library.controller.command.Command;
import by.zercomp.library.controller.command.definer.CommandDefiner;

import java.util.Map;

public class RequestHandler {

    public Map<String, Object> runRequest(String action, Map<String, Object> params) {
        Command command = CommandDefiner.define(action);
        return command.execute(params);
    }

}
