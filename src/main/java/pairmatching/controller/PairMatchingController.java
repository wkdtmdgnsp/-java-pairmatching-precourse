package pairmatching.controller;

import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class PairMatchingController {
    private OutputView outputView = new OutputView();
    private InputView inputView = new InputView();
    private String menuNumber = "";

    public void run() {
        while (!menuNumber.contentEquals("Q")) {
            menu();
            selectMenu();
        }
    }

    private void menu() {
        try {
            outputView.printMenu();
            menuNumber = inputView.readMenu();
        } catch (IllegalArgumentException e) {
            menu();
        }
    }

    private void selectMenu() {
        if (menuNumber.contentEquals("1")) {
            pair();
            return;
        }
        if (menuNumber.contentEquals("2")) {
            return;
        }
        if (menuNumber.contentEquals("3")) {
            return;
        }
    }

    private void pair() {
        outputView.printMathInfo();
    }
}
