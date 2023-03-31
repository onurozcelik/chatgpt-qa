// Example service implementation
public class ExampleService implements Service {
    private final Microkernel microkernel;

    public ExampleService(Microkernel microkernel) {
        this.microkernel = microkernel;
    }

    @Override
    public void execute() {
        System.out.println("Example service is executing");
        AnotherService anotherService = (AnotherService) microkernel.getService("AnotherService");
        if (anotherService != null) {
            anotherService.execute();
        }
    }
}
