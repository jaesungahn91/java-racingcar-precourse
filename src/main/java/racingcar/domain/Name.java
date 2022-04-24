package racingcar.domain;

public class Name {

    private static final int NAME_MIN_LENGTH = 5;
    private static final String ERROR_MESSAGE = "[ERROR]";

    private String value;

    public Name(String name) {
        validation(name);
        this.value = name;
    }

    private void validation(String name) {
        if (name.length() > NAME_MIN_LENGTH) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
    }

    public String getValue() {
        return value;
    }

}
