package adapter_with_pipes_and_filters;

public class DataValidator implements Filter {
    @Override
    public void process(Data data) {
        // Validate the data to ensure it meets the requirements of the target system
        if (data.getValue() < 0) {
            throw new IllegalArgumentException("Data value must be non-negative");
        }
    }
}
