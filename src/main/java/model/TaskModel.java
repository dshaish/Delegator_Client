package model;

import org.delegator.wsclient.NubemetWebService;

import container.SpringContextContainer;


public class TaskModel {
	private NubemetWebService client;
	private String username;
	private String password;
	private boolean loggedIn=false;
	
	public TaskModel(NubemetWebService client){	
		this.client = client;
	}
	
	public boolean login(String username, String password){
		
		if(!loggedIn){
			if(client.authenticate(username, password)){
				this.username = username;
				this.password = password;
				loggedIn = true;
			}
			else
				loggedIn = false;
		}
		
		return loggedIn;
	}
}
