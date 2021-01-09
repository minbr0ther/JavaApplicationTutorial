package se.hs.ac.controller;

import java.util.Scanner;

import se.hs.ac.module.WorkModule;
import se.hs.ac.view.WorkView;

import static se.hs.ac.util.WorkConstants.Menu.*;

public class WorkController { //입력만 받는곳 
	
	private final WorkModule workService;
	private final WorkView view;
	private static Scanner scan = new Scanner(System.in);

	public WorkController() {
		this.workService = new WorkModule();
		this.view = new WorkView();
		this.workService.init();
	}
	
	public void run() {

		while (true) {
			view.showMenu();
			switch (scan.next()) {
				case ADD:
					addWork();
					break;
				case UPDATE:
					updateWork();
					break;
				case REMOVE:
					removeWork();
					break;
				case SHOW:
					workService.printWorkList();
					break;
				case EXIT:
					return;
			}
			System.out.println();
		}
	}

	private void removeWork() {
		view.showWorkList("삭제");
		int selectedId = Integer.parseInt(scan.next()); // Id 입력받기
		workService.removeWork(selectedId);
	}

	private void updateWork() {
		view.showWorkList("수정");
		int selectedId = Integer.parseInt(scan.next()); // Id 입력받기
		workService.updateWork(selectedId);
	}

	private void addWork() {
		view.showInputTodo();
		String toDoContent = scan.next();
		workService.addWork(toDoContent);		
	}
}