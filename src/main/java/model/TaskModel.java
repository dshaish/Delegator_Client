package model;

import java.util.HashMap;
import java.util.List;

import org.delegator.wsclient.NubemetTask;
import org.delegator.wsclient.NubemetWebService;
import org.delegator.wsclient.UserTasksFilter;

import container.SpringContextContainer;


public class TaskModel {
	private NubemetWebService client;
	private String username;
	private boolean loggedIn=false;
	
	public TaskModel(NubemetWebService client){	
		this.client = client;
	}
	public boolean deleteTask(int tid){
		if(!client.removeTask(tid)){
			System.out.println("Task Deleted");
			return true;
		}
		else{
			System.err.println("Error Deleting Task");
			return false;
		}
	}
	public boolean addTask(NubemetTask task){
		if(client.addTask(task)){
			System.out.println("Task Added succesfully");
			return true;
		}
		System.err.println("Error Deleting Task");
		return false;	
	}
	public boolean login(String username, String password){
		
		this.username = username;
		loggedIn = true;
		return true;
//		if(!loggedIn){
//			if(client.authenticate(username, password)){
//				this.username = username;
//				loggedIn = true;
//			}
//			else
//				loggedIn = false;
//		}
//		
//		return loggedIn;
	}

	public void logout() {
		loggedIn = false;
		username="";
	}
	
	public Object[][] getTasksList(){
		List<NubemetTask> tasks = client.getTasks(UserTasksFilter.ALL);
		
		Object[][] data = new String[tasks.size()][3];
		
		for(int i=0;i<tasks.size();i++){
			data[i][0] = i;
			data[i][1] = tasks.get(i).getTitle();
			data[i][2] = tasks.get(i).getEdate().toString();
		}
		
		return data;
	}
	public List<String> getWorksForNames() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//public String[][] getWorksForMe(){

	//	org.delegator.wsclient.HashMap m = client.getWorksForMe();
		
		
	//}
}
