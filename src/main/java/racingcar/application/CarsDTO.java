package racingcar.application;

public class CarsDTO {
    private static final String SPLIT_REGEX = ",";
    private static final String ERROR_MESSAGE = "[ERROR]";

    String carNames;

    public CarsDTO(String carNames) {
        validation(carNames);
        this.carNames = carNames;
    }

    public String[] toCarNames() {
        return this.carNames.split(SPLIT_REGEX);
    }

    public void validation(String carNames) {
        if (carNames == null || carNames.isEmpty() || !carNames.contains(SPLIT_REGEX)) {
            System.out.println(ERROR_MESSAGE);
            throw new IllegalArgumentException();
        }
    }

}
