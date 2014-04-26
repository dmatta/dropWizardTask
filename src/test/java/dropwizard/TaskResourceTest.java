package dropwizard;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TaskResourceTest {

	
	@Test
	public void testIndex() {
		TaskResource tr = new TaskResource();
		List<Task> taskList = tr.index();
		assertEquals(2, taskList.size());
	}
	
}
