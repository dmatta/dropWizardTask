package dropwizard;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yammer.metrics.annotation.Timed;

@Path("/")
public class TaskResource {

	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	@Timed
	public List<Task> index() {
		Date curDate = new Date(System.currentTimeMillis());
		return Arrays.asList(
				new Task("learn angular js", "Do it now", curDate),
				new Task("boston duck tour", "Take kids to the duck tour", new Date(curDate.getTime() + TimeUnit.DAYS.toMillis(7))));
		
		
	}
}
