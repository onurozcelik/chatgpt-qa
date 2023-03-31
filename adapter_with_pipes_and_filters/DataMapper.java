package adapter_with_pipes_and_filters;

public class DataMapper implements Filter {
    @Override
    public void process(Data data) {
        // Map the data from the source system to the target system
        data.setValue(data.getValue() * 2);
    }
}
