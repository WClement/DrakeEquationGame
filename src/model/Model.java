package model;

import gameLogic.Manager;

import java.util.ArrayList;

import controller.Controller;

public class Model {

	private Controller myController;
	private ArrayList<Manager> managers;
	
	public void setController(Controller myController) {
		this.myController = myController;
	}
	
	public Model() {
		// TODO Auto-generated constructor stub
	}


	
}
