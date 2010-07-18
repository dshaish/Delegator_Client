package model;

import java.util.List;

import org.delegator.wsclient.Employee;
import org.delegator.wsclient.NubemetTask;
import org.delegator.wsclient.NubemetWebService;
import org.delegator.wsclient.UserTasksFilter;
import container.SpringContextContainer;


public class TaskModel {
	private NubemetWebService client;
	private String username;
	private Long eid;
	private boolean loggedIn=false;
	
	public TaskModel(NubemetWebService client){	
		this.client = client;
	}
	public boolean deleteTask(int tid){
//		if(!client.removeTask(tid)){
//			System.out.println("Task Deleted");
//			return true;
//		}
//		else{
//			System.err.println("Error Deleting Task");
//			return false;
//		}
		return false;
	}
	public boolean addTask(NubemetTask task){
		if(client.addTask(task,eid)){
			System.out.println("Task Added succesfully");
			return true;
		}
		return false;	
	}
	public boolean login(String username, String password){
		
		//this.username = username;
		//loggedIn = true;
		//return true;
		
		if(!loggedIn){
			Long eid = client.authenticate(username, password);
			if(eid>=0){
				this.username = username;
				this.eid = eid;
				loggedIn = true;
			}
			else
				loggedIn = false;
		}
		
		return loggedIn;
	}

	public void logout() {
		loggedIn = false;
		username="";
	}
	
	public Object[][] getTasksList(){
		List<NubemetTask> tasks = client.getTasks(eid);
		
		Object[][] data = new String[tasks.size()][3];
		
		for(int i=0;i<tasks.size();i++){
			data[i][0] = String.valueOf(i);
			data[i][1] = tasks.get(i).getTitle();
			if (tasks.get(i).getEdate()!= null){
				data[i][2] = tasks.get(i).getEdate().toString();
			}else {
				data[i][2] = "NONE";
			}
		}
		return data;
	}
	public List<Employee> getWorksForNames() {
		return client.getWorksForMe(new Long(1));
	}
	
	//public String[][] getWorksForMe(){

	//	org.delegator.wsclient.HashMap m = client.getWorksForMe();
		
		
	//}
}
