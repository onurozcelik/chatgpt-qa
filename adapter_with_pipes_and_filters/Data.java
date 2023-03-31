package adapter_with_pipes_and_filters;

public class Data {
    private int value;

    public Data(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "value=" + value +
                '}';
    }
}
