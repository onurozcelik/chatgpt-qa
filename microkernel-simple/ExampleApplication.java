// Example application
public class ExampleApplication {
    public static void main(String[] args) {
        Microkernel kernel = new SimpleMicrokernel();
        Service exampleService = new ExampleService(kernel);
        Service anotherService = new AnotherService();

        kernel.registerService("ExampleService", exampleService);
        kernel.registerService("AnotherService", anotherService);

        Service service = kernel.getService("ExampleService");
        if (service != null) {
            service.execute();
        }
    }
}
