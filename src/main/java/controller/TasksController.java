package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;

import model.TaskModel;

import view.TasksView;

public class TasksController {
	
	private TasksView _view;
	private TaskModel _model;
	private LoginListener _loginListener = new LoginListener();
	private TaskListListener _taskListListener = new TaskListListener();
	private NewTaskListener _newTaskListener = new NewTaskListener();
	private descendantsListener _dListener = new descendantsListener();
	private List<JCheckBox> descendantsList = new ArrayList<JCheckBox>();
	
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
	
	public descendantsListener get_descendantsListener(JCheckBox j){
		descendantsList.add(j);
		return _dListener;
	}

	public class LoginListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("login")){
				if(_model.login(_view.getUsername(), _view.getPassword())){
					System.out.println("OK");
					_view.goToTasks();
				}
				else
					System.out.println("WRONG");
			}
			else if(e.getActionCommand().endsWith("Exit")){
				System.exit(0);
			}
		}
		
	}
	
	public class TaskListListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("logout")){
				_model.logout();
				_view.goToLogin();
			}
			else if(e.getActionCommand().equals("addNewTask")){
				_view.goToAddTask();
			}
			else if(e.getActionCommand().equals("deleteTask")){
				if(_model.deleteTask(_view.getSelectedTaskId()))
					_view.reloadTasksList();
			}
		}	
	}
	
	public class NewTaskListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("cancel")){
				_view.goToTasks();
			}
			else if(e.getActionCommand().equals("addTask")){
				_model.addTask(_view.getNewNubemetTask());
				_view.goToTasks();
			}
		}
	}
	
	public class descendantsListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			
			Object source = e.getItemSelectable();
			
		}
		
	}

	public Object[][] _getTasksList() {
		return _model.getTasksList();
	}
	public List<String> getWorksForNames(){
		return _model.getWorksForNames();
		
	}

}
