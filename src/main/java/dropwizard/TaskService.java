package dropwizard;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class TaskService extends Service<TaskConfiguration> {

    public static void main(String[] args) {
		try {
			new TaskService().run(new String[] {"server"});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void initialize(Bootstrap<TaskConfiguration> bootstrap) {
		bootstrap.setName("task");
	}

	@Override
	public void run(TaskConfiguration configuration, Environment environment)
			throws Exception {
		environment.addResource(new TaskResource());
		
	}

}
