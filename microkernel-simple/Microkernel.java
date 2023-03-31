// Microkernel interface
public interface Microkernel {
    void registerService(String serviceName, Service service);
    Service getService(String serviceName);
}

