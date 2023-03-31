package adapter_with_pipes_and_filters;

public class Main {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        Data data = new Data(10); // Create some sample data
        adapter.process(data); // Process the data through the adapter
        System.out.println(data); // Output the processed data
    }
}
