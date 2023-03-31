import java.util.HashMap;
import java.util.Map;

// Microkernel implementation
public class SimpleMicrokernel implements Microkernel {
    private Map<String, Service> services = new HashMap<>();

    @Override
    public void registerService(String serviceName, Service service) {
        services.put(serviceName, service);
    }

    @Override
    public Service getService(String serviceName) {
        return services.get(serviceName);
    }
}
