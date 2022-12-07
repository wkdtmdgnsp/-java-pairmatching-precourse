package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.util.UserException;

import java.util.List;

public class InputView {
    private UserException userException = new UserException();

    public String readMenu() {
        try {
            String menu = Console.readLine();
            userException.menuException(menu);
            return menu;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    public List<String> readInfo() {
        return null;
    }
}
