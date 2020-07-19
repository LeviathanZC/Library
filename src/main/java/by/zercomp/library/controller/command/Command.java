package by.zercomp.library.controller.command;

import java.util.Map;

public interface Command {

    /**
     * Command executor.
     * @param params - parameters of the command (String - name of param, Object - value)
     * @return response
     */
    Map<String, Object> execute(Map<String, Object> params);

}
