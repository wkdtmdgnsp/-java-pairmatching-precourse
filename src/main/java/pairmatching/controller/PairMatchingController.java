package pairmatching.controller;

import pairmatching.view.OutputView;

public class PairMatchingController {
    private OutputView outputView = new OutputView();

    public void run() {
        menu();
    }

    private void menu() {
        outputView.printMenu();
    }
}
