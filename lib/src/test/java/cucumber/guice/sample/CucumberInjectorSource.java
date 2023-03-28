package cucumber.guice.sample;

import io.cucumber.guice.InjectorSource;
import com.google.inject.Injector;

public class CucumberInjectorSource implements InjectorSource {
    @Override
    public Injector getInjector() {
        throw new RuntimeException("This is the root cause error message");
    }
}
