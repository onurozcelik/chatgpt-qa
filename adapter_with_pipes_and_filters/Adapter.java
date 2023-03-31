package adapter_with_pipes_and_filters;

import java.util.ArrayList;
import java.util.List;

public class Adapter {
    private final List<Filter> filters = new ArrayList<>();

    public Adapter() {
        // Add the filters to the pipeline
        filters.add(new DataMapper());
        filters.add(new DataValidator());
    }

    public void process(Data data) {
        // Process the data through the pipeline of filters
        for (Filter filter : filters) {
            filter.process(data);
        }
    }
}
