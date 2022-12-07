package pairmatching.util;

public class UserException {
    public void menuException(String menu) {
        if (!menu.contentEquals("1") && !menu.contentEquals("2") && !menu.contentEquals("3") && !menu.contentEquals("Q")) {
            System.out.println("[ERROR] 메뉴를 올바르게 입력해 주세요.");
            throw new IllegalArgumentException();
        }
    }
}
