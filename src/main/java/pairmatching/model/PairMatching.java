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
        
    }

    private List<String> randomCrewNames(List<String> crewNames) {
        List<String> shuffledCrew = Randoms.shuffle(crewNames);
        return shuffledCrew;
    }

    public void reset() {

    }

    public void reMatch() {

    }
}
