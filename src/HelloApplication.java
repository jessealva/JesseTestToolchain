import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/hello/*")
public class HelloApplication extends Application {
	 @Override
	public Set<Class<?>> getClasses() {
		 Set<Class<?>> classes = new HashSet<Class<?>>();
		 classes.add(HelloResponse.class);
		 return classes;
	}
}
