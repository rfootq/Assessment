package controllers;

import static services.TestingService.TESTING_SERVICE;

public class TestingController {

    public void start() {
        TESTING_SERVICE.startTesting();
    }

    public void stop() {
        TESTING_SERVICE.stopTesting();
    }

    public void nextQuestion() {
        TESTING_SERVICE.nextQuestion();
    }

}
