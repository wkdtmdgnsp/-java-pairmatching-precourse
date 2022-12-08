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
        try {
            System.out.println("과정, 레벨, 미션을 선택하세요.");
            System.out.println("ex) 백엔드, 레벨1, 자동차경주");
            List<String> info = userException.infoToList(Console.readLine());
            userException.infoNoneException(info);
            return info;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }
}
