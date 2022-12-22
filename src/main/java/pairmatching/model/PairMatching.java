package pairmatching.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PairMatching {
    private List<String> backCrewNames = new ArrayList<>();
    private List<String> frontCrewNames = new ArrayList<>();

    public PairMatching() {
        try {
            Scanner scanner = new Scanner(new File("src/main/resources/backend-crew.md"));
            while (scanner.hasNextLine()) {
                backCrewNames.add(scanner.nextLine());
            }
            scanner = new Scanner(new File("src/main/resources/frontend-crew.md"));
            while (scanner.hasNextLine()) {
                frontCrewNames.add(scanner.nextLine());
            }
        } catch (IOException e) {
        }
    }

    public void pair(List<String> pairInfo) {
        List<String> shuffledCrew = randomCrewNames(pairInfo.get(0));
        List<List<String>> pairMatching = matching(shuffledCrew);
    }

    private List<List<String>> matching(List<String> shuffledCrew) {
        List<List<String>> pairMatch = new ArrayList<>();
        List<String> match = new ArrayList<>();
        for (int i=0; i<shuffledCrew.size(); i++) {
            if (match.size() != 2) {
                match.add(shuffledCrew.get(i));
            }
            if (match.size() == 2) {
                pairMatch.add(match);
                match = new ArrayList<>();
            }
        }
        if (shuffledCrew.size() % 2 != 0) {
            pairMatch.get(pairMatch.size()-1).add(match.get(0));
        }
        return pairMatch;
    }

    private List<String> randomCrewNames(String course) {
        if (Course.findCourse(course) == Course.BACKEND) {
            List<String> shuffledCrew = Randoms.shuffle(backCrewNames);
            return shuffledCrew;
        }
        List<String> shuffledCrew = Randoms.shuffle(frontCrewNames);
        return shuffledCrew;
    }

    public void reset() {

    }

    public void reMatch() {

    }
}
