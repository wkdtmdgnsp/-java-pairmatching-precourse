package pairmatching.model;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class PairMatching {
    private List<String> backCrewNames;
    private List<String> frontCrewNames;

    public PairMatching() {
        try {
            Scanner scanner = new Scanner(new File("C:\\-java-pairmatching-precourse\\src\\main\\resources\\backend-crew.md"));
            while (scanner.hasNextLine()) {
                backCrewNames.add(scanner.nextLine());
            }
            scanner = new Scanner(new File("C:\\-java-pairmatching-precourse\\src\\main\\resources\\frontend-crew.md"));
            while (scanner.hasNextLine()) {
                frontCrewNames.add(scanner.nextLine());
            }
        } catch (IOException e) {
        }
    }

    public void pair() {

    }

    public void reset() {

    }

    public void reMatch() {

    }
}
