package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.TaskModel;

import view.TasksView;

public class TasksController {
	
	private TasksView _view;
	private TaskModel _model;
	private LoginListener _loginListener = new LoginListener();
	private TaskListListener _taskListListener = new TaskListListener();
	private NewTaskListener _newTaskListener = new NewTaskListener();
	
	public TasksController(TaskModel model){
		_model = model;
	}
	public void setView(TasksView view){
		_view = view;
	}
	public LoginListener get_loginListener() {
		return _loginListener;
	}

	public TaskListListener get_taskListListener() {
		return _taskListListener;
	}

	public NewTaskListener get_newTaskListener() {
		return _newTaskListener;
	}

	public class LoginListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("login")){
				if(_model.login(_view.getUsername(), _view.getPassword())){
					System.out.println("OK");
				}
				else
					System.out.println("WRONG");
			}
			
		}
		
	}
	
	public class TaskListListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public class NewTaskListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	

}
