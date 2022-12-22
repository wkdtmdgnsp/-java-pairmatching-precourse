package pairmatching.util;

import pairmatching.model.Course;
import pairmatching.model.Mission;

import java.util.ArrayList;
import java.util.List;

public class UserException {
    public void menuException(String menu) {
        if (!menu.contentEquals("1") && !menu.contentEquals("2") && !menu.contentEquals("3") && !menu.contentEquals("Q")) {
            System.out.println("[ERROR] 메뉴를 올바르게 입력해 주세요.");
            throw new IllegalArgumentException();
        }
    }

    public List<String> infoToList(String input) {
        List<String> info = new ArrayList<>();
        String infos[] = input.split(", ");
        for (int i=0; i<infos.length; i++) {
            info.add(infos[i]);
        }
        if (info.size() != 3) {
            System.out.println("[ERROR] 과정, 레벨, 미션을 모두 입력 해주세요.");
            throw new IllegalArgumentException();
        }
        return info;
    }

    public void infoNoneException(List<String> info) {
        if (Course.findCourse(info.get(0)) == null || Mission.findMission(info.get(2), info.get(1)) == null) {
            System.out.println("[ERROR] 올바른 정보를 입력해 주세요.");
            throw new IllegalArgumentException();
        }
    }
}
