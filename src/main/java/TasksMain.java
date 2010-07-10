import org.delegator.wsclient.NubemetWebService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import container.SpringContextContainer;
import controller.TasksController;
import model.TaskModel;
import view.TasksView;


public class TasksMain {

	/**
	 * @param args
	 */
	static ClassPathXmlApplicationContext ctx;
	
	public static void main(String[] args) {
		NubemetWebService client = (NubemetWebService) SpringContextContainer.getBean("nubemeServiceClient");
		TaskModel model = new TaskModel(client);
		TasksController controller = new TasksController(model);
		TasksView view = new TasksView(controller);
		controller.setView(view);
	}

}
