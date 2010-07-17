package view;

import java.awt.Frame;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableColumn;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Shape;
import java.awt.Window;

import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;

import org.delegator.wsclient.NubemetTask;

import com.sun.awt.AWTUtilities;

import controller.TasksController;

import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class TasksView {

	private final int FRAME_HIGHT = 450;
	private final int FRAME_WIDTH = 300;
	private JFrame mainFrame;
	private JScrollPane scrollPane;
	private JPanel tasks;
	private JPanel buttons;
	private JPanel loginPanel;
	private JPanel addTaskPanel;
	private JTable table;
	private JButton loginButton;
	private JTextField userText;
	private JPanel cards;
	private JPasswordField passwordText;
	private List<JCheckBox> descendants;
	private TasksController tControl;
	private JTextField title;
	private JTextArea description;
	private JFormattedTextField dueDate;
	
	public TasksView(TasksController controller){
		tControl = controller;
		mainFrame = (JFrame) getFrame();

		//		try {
		//			Class<?> awtUtilitiesClass = Class.forName("com.sun.awt.AWTUtilities");
		//			Method mSetWindowOpacity = awtUtilitiesClass.getMethod("setWindowOpacity", Window.class, float.class);
		//			mSetWindowOpacity.invoke(null, mainFrame, Float.valueOf(0.75f));
		//			mainFrame.addComponentListener(new ComponentAdapter() {
		//			     @Override
		//			     public void componentResized(ComponentEvent evt) {
		//			       Shape shape = null;
		//			       shape = new RoundRectangle2D.Float();
		//			       AWTUtilities.setWindowShape(mainFrame, shape);
		//			     }
		//			});
		//		} catch (NoSuchMethodException ex) {
		//			ex.printStackTrace();
		//		} catch (SecurityException ex) {
		//			ex.printStackTrace();
		//		} catch (ClassNotFoundException ex) {
		//			ex.printStackTrace();
		//		} catch (IllegalAccessException ex) {
		//			ex.printStackTrace();
		//		} catch (IllegalArgumentException ex) {
		//			ex.printStackTrace();
		//		} catch (InvocationTargetException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		} 


		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
	
	private JFrame getFrame() {
		if (mainFrame == null) {
			mainFrame = new JFrame("NuBemet Tasks");
			mainFrame.setLayout(null);
			cards = new JPanel(new CardLayout());
			//mainFrame.setBounds(new Rectangle(270, 250, FRAME_WIDTH, FRAME_HIGHT));
			mainFrame.setMinimumSize(new Dimension(FRAME_WIDTH, FRAME_HIGHT));
			mainFrame.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HIGHT));
			//mainFrame.setSize(new Dimension(780, 550));
			mainFrame.setResizable(false);
			
			cards.add(getLoginPanel(),"Login");
			cards.add(getAddTaskPane(),"AddTask");
			mainFrame.setContentPane(cards);
			CardLayout cl = (CardLayout)(cards.getLayout());
		    cl.show(cards, "Login");
			//mainFrame.setContentPane(getTasksPanel());
			//mainFrame.setContentPane(getLoginPanel());
			//mainFrame.setContentPane(getAddTaskPane());
			//mainFrame.add(getButtonsPanel(), BorderLayout.PAGE_END);
			//mainFrame.add(getOfficePanel(), null);
			//mainFrame.add(getCalcPanel(), null);
		}
		return mainFrame;
	}
	private Container getAddTaskPane() {
		if (addTaskPanel == null) {
			JLabel titleLabel = new JLabel();
			titleLabel.setBounds(new Rectangle(10, 14, 100, 27));
			titleLabel.setText("Title:");
			
			JLabel descriptionLabel = new JLabel();
			descriptionLabel.setBounds(new Rectangle(10, 52, 100, 27));
			descriptionLabel.setText("Description:");
			
			title = new JTextField();
			title.setBounds(new Rectangle(85, 20, 185, 23));
			
			description = new JTextArea(5, 10);
			description.setBounds(new Rectangle(85, 57, 185, 120));
			JScrollPane scrollPane = new JScrollPane(description); 
			scrollPane.setBounds(new Rectangle(85, 57, 185, 120));
			description.setEditable(true);
			
			JLabel dueLabel = new JLabel();
			dueLabel.setBounds(new Rectangle(10, 182, 100, 27));
			dueLabel.setText("Due Date:");
			
			dueDate = new JFormattedTextField(new SimpleDateFormat("dd-MM-yyyy"));
			dueDate.setBounds(new Rectangle(85, 190, 70, 23));
			
			JLabel delegateLabel = new JLabel();
			delegateLabel.setBounds(new Rectangle(10, 230, 100, 27));
			delegateLabel.setText("Delegate to:");
			
			JButton addTask = new JButton();
			addTask.setBounds(new Rectangle(10, 385,90,23));
			addTask.setText("Add Task");
			addTask.setActionCommand("addTask");
			addTask.addActionListener(tControl.get_newTaskListener());
			
			JButton cancelBtn = new JButton();
			cancelBtn.setBounds(new Rectangle(110,385,90,23));
			cancelBtn.setText("Cancel");
			cancelBtn.setActionCommand("cancel");
			cancelBtn.addActionListener(tControl.get_newTaskListener());
			
			addTaskPanel = new JPanel();
			addTaskPanel.setLayout(null);
			//loginPanel.setBounds(new Rectangle(10, 10, 10, 10));
			addTaskPanel.setBorder(BorderFactory.createTitledBorder(null,
					"", TitledBorder.DEFAULT_JUSTIFICATION,
					TitledBorder.DEFAULT_POSITION, new Font("Dialog",
							Font.BOLD, 12), Color.black));
			
			addDescendants(addTaskPanel,100,235);
			
			addTaskPanel.add(titleLabel, null);
			addTaskPanel.add(title, null);
			addTaskPanel.add(descriptionLabel, null);
			addTaskPanel.add(scrollPane, null);
			addTaskPanel.add(dueLabel, null);
			addTaskPanel.add(dueDate, null);
			addTaskPanel.add(delegateLabel, null);
			addTaskPanel.add(addTask, null);
			addTaskPanel.add(cancelBtn, null);
			//addTaskPanel.add(getPasswordText(), null);
			//addTaskPanel.add(getLoginButton(), null);
		}
		return addTaskPanel;
	}

	private void addDescendants(JPanel panel, int x, int y) {
		
		JCheckBox j;
		descendants = new ArrayList<JCheckBox>();
		JScrollPane scrollPane = new JScrollPane(); 
		scrollPane.setBounds(new Rectangle(x, y, 120, 400));
		
		List<String> desc = getListOfDesc();
		
		for(int i=0;i<desc.size();i++){
//			j = new JCheckBox(desc.get(i).getName());
			j = new JCheckBox(desc.get(i));
			j.setBounds(new Rectangle(x, y+(i*20), 400, 23));
			//j.addItemListener(tControl.get_descendantsListener(j));
			scrollPane.add(j);
			descendants.add(j);
			panel.add(j);
		}
		//panel.add(scrollPane);
	}

	private List getListOfDesc() {
		List<String> l = new ArrayList<String>();
		//List<String> l = tControl.getWorksForNames();
		l.add("Shimon Mizrahi");
		l.add("Barak Obama");
		l.add("Puyol");
		l.add("Ehud Barak");
		
		return l;
	}

	private JPanel getButtonsPanel() {
		if (buttons == null) {
			FlowLayout buttonsLayout = new FlowLayout();
			buttons = new JPanel(buttonsLayout);
			
			JButton newTask = new JButton("New Task");
			newTask.setActionCommand("addNewTask");
			newTask.addActionListener(tControl.get_taskListListener());
			
			JButton deleteTask = new JButton("Delete");
			deleteTask.setActionCommand("deleteTask");
			deleteTask.addActionListener(tControl.get_taskListListener());
			
			JButton exit = new JButton("Logout");
			exit.setActionCommand("logout");
			exit.addActionListener(tControl.get_taskListListener());
			
			buttons.add(newTask);
			buttons.add(deleteTask);
			buttons.add(exit);

			buttons.setComponentOrientation(
					ComponentOrientation.LEFT_TO_RIGHT);
		}
		return buttons;
	}

	private JScrollPane getTablePanel(){
		String[] columnNames = {"","",
		""};
		
		Object[][] data = tControl._getTasksList();

		table = new JTable(data, columnNames);
		table.setRowHeight(30);
		table.setAlignmentX(10);
		table.setBackground(Color.ORANGE);
		table.setGridColor(Color.ORANGE);
		table.setSelectionForeground(Color.BLACK);
		table.setSelectionBackground(Color.ORANGE);
		TableColumn column = null;
		for (int i = 0; i < 3; i++) {
			column = table.getColumnModel().getColumn(i);
			if (i == 0) {
				column.setPreferredWidth(3); //third column is bigger
			}else if(i==2){
				column.setPreferredWidth(100);
			}
			else if(i == 1) {
				column.setPreferredWidth(400);
			}
		}
		scrollPane = new JScrollPane(table);
		table.setPreferredScrollableViewportSize(new Dimension(270, 365));
		table.setFillsViewportHeight(true);
		
		
		return scrollPane;

	}
	private JPanel getTasksPanel() {
		if (tasks == null) {

			tasks = new JPanel();
			//tasks.setLayout(new FlowLayout());
			//tasks.setBounds(new Rectangle(8, 28, 396, 436));
			//			tasks.setBorder(BorderFactory.createTitledBorder(null,
			//					"Personal Information", TitledBorder.DEFAULT_JUSTIFICATION,
			//					TitledBorder.DEFAULT_POSITION, new Font("Dialog",
			//							Font.BOLD, 12), Color.black));
			tasks.add(getTablePanel(), BorderLayout.PAGE_START);
			tasks.add(getButtonsPanel(), BorderLayout.PAGE_END);

		}
		table.setOpaque(true);

		return tasks;
	}

	private JPanel getLoginPanel() {
		if (loginPanel == null) {
			JLabel passwordLabel = new JLabel();
			passwordLabel.setBounds(new Rectangle(10, 65, 100, 27));
			passwordLabel.setText(" Password :");
			JLabel usernameLabel = new JLabel();
			usernameLabel.setBounds(new Rectangle(10, 30, 100, 27));
			usernameLabel.setText(" User Name :");
			loginPanel = new JPanel();
			loginPanel.setLayout(null);
			//loginPanel.setBounds(new Rectangle(10, 10, 10, 10));
			loginPanel.setBorder(BorderFactory.createTitledBorder(null,
					"", TitledBorder.DEFAULT_JUSTIFICATION,
					TitledBorder.DEFAULT_POSITION, new Font("Dialog",
							Font.BOLD, 12), Color.black));
			loginPanel.add(usernameLabel, null);
			loginPanel.add(getUserText(), null);
			loginPanel.add(passwordLabel, null);
			loginPanel.add(getPasswordText(), null);
			loginPanel.add(getLoginButton(), null);
			
			JButton exit = new JButton();
			exit.setBounds(new Rectangle(100, 120, 80, 23));
			exit.setText("Exit");
			exit.setActionCommand("Exit");
			exit.addActionListener(tControl.get_loginListener());
			loginPanel.add(exit);
		}
		return loginPanel;
	}

	/**
	 * This method initializes loginButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getLoginButton() {
		if (loginButton == null) {
			loginButton = new JButton();
			loginButton.setBounds(new Rectangle(10, 120, 80, 23));
			loginButton.setText("Login");
			loginButton.setActionCommand("login");
			loginButton.addActionListener(tControl.get_loginListener());
		}
		return loginButton;
	}
	
	public String getUsername(){
		return userText.getText();
	}
	
	public String getPassword(){
		return passwordText.getText();
	}

	/**
	 * This method initializes userText
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextField getUserText() {
		if (userText == null) {
			userText = new JTextField();
			userText.setBounds(new Rectangle(100, 34, 110, 23));
			userText.setActionCommand("username");
		}
		return userText;
	}

	/**
	 * This method initializes passwordText
	 * 
	 * @return javax.swing.JPasswordField
	 */
	private JPasswordField getPasswordText() {
		if (passwordText == null) {
			passwordText = new JPasswordField();
			passwordText.setBounds(new Rectangle(100, 69, 110, 23));
			passwordText.setActionCommand("password");
		}
		return passwordText;
	}

	public void goToTasks() {
		cards.add(getTasksPanel(),"TasksList");
		CardLayout cl = (CardLayout)(cards.getLayout());
	    cl.show(cards, "TasksList");
	}
	
	public void goToAddTask(){
		CardLayout cl = (CardLayout)(cards.getLayout());
	    cl.show(cards, "AddTask");
	}
	
	public void goToLogin(){
		CardLayout cl = (CardLayout)(cards.getLayout());
	    cl.show(cards, "Login");
	}

	public int getSelectedTaskId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void reloadTasksList() {
		// TODO Auto-generated method stub
		
	}

	public NubemetTask getNewNubemetTask() {
		NubemetTask task = new NubemetTask();
		task.setTitle(" Title ");
		task.setDescription("A TASK");
		return task;
	}


}
