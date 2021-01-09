
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ToDoList {
	  public static void main(String arg[]){
	    
		  int test = 0;
		  int id = 0; //Primary Key
		  int selectedId = 0; //선택받을 ID

		  AscendingInteger comp = new AscendingInteger();

		  ArrayList<ToDoObject> ToDoObjects = new ArrayList<ToDoObject>();
		  
		  ToDoObjects.add(new ToDoObject(id,"2020-12-23", "오늘은 자바공부!",0)); id++;
		  ToDoObjects.add(new ToDoObject(id,"2020-12-24", "데이터베이스공부",0)); id++;
		  ToDoObjects.add(new ToDoObject(id,"2020-12-24", "데이터찾기",1)); id++;
		  ToDoObjects.add(new ToDoObject(id,"2020-12-25", "아무것도 안하기",0)); id++;
		  ToDoObjects.add(new ToDoObject(id,"2020-12-24", "자바공부",2)); id++;
		  ToDoObjects.add(new ToDoObject(id,"2020-12-26", "MySQL 공부하기",1)); id++;
		  ToDoObjects.add(new ToDoObject(id,"2020-12-24", "공부 계획 세우기",2)); id++;
		  
		  while(true){
		      System.out.print("1) 추가하기 | 2) 수정하기 | 3) 삭제하기 | 4) 조회하기 |  0) 종료 : \n");
		   
		      System.out.print("=> ");
		      switch(new Scanner(System.in).next()) {
		      
		      	case "1" :
		      		System.out.print("오늘의 날짜를 입력하세요 : ");
		      		String toDoDate = new Scanner(System.in).next();
		      		
		      		System.out.print("TODO를 입력하세요 : ");
		      		String toDoContent = new Scanner(System.in).next();
		    
		      		ToDoObjects.add(new ToDoObject(id, toDoDate, toDoContent, 0)); id++;
		      		
		      		Collections.sort(ToDoObjects, comp); //add 할때마다 status순으로 정렬 (0,1,2)
		      		
		      		break;
		    
		        case "2" :
        			System.out.println("\n수정하고 싶은 ID를 골라주세요 :)\n");

		        	for (int i = 0; i < ToDoObjects.size(); i++) { //보기로 전체 리스트 보여주기
				        System.out.println(ToDoObjects.get(i).getId()+"\t"+ToDoObjects.get(i).getDate()+"\t"+ToDoObjects.get(i).getContent());
			        }
		        	
		        	System.out.print("=> ");
		        	selectedId =  Integer.parseInt(new Scanner(System.in).next()); //Id 입력받기
		        			  
		        	if(selectedId < ToDoObjects.size() ) { //일치하지 않는 id 예외처리
			        	for (int i = 0; i < ToDoObjects.size(); i++) { 
				        	if(ToDoObjects.get(i).getId() == selectedId) { //입력받은 id와 같은 id를 가지고 있는 항목을 찾는다
				        		if(ToDoObjects.get(i).getStatus()==0) { //status가 TODO 이라면
				        			ToDoObjects.get(i).setStatus(1); //TODO -> DOING
					        		System.out.println("수정이 완료되었습니다. (TODO -> DOING)");
				        		}
				        		else if (ToDoObjects.get(i).getStatus()==1) { //status가 DOING 이라면
				        			ToDoObjects.get(i).setStatus(2); //DOING -> DONE
					        		System.out.println("수정이 완료되었습니다. (DOING -> DONE)");
				        		}
				        		else if (ToDoObjects.get(i).getStatus()==2) { //status가 DONE 이라면
					        		System.out.println("이미 완료된 항목입니다.");
					        		break;
				        		}
				        		break;
				        	}
				        }
		        	}
		        	else {
		        		System.out.println("일치하는 id가 없습니다.");
		        		break;		        
		        	}
		        	break;	

		          
		        case "3" :
		        	System.out.println("\n삭제하고 싶은 ID를 골라주세요 :)\n");
		        	
		        	for (int i = 0; i < ToDoObjects.size(); i++) { //보기로 전체 리스트 보여주기
				        System.out.println(ToDoObjects.get(i).getId()+"\t"+ToDoObjects.get(i).getDate()+"\t"+ToDoObjects.get(i).getContent());
			        }
		        	
		        	System.out.print("=> ");
		        	selectedId =  Integer.parseInt(new Scanner(System.in).next()); //Id 입력받기
		        	
		        	if(selectedId < ToDoObjects.size() ) { //일치하지 않는 id 예외처리
			        	for (int i = 0; i < ToDoObjects.size(); i++) { 
				        	if(ToDoObjects.get(i).getId() == selectedId) { //입력받은 id와 같은 id를 가지고 있는 항목을 찾는다
				        		
				        		ToDoObjects.remove(ToDoObjects.indexOf(ToDoObjects.get(i)));
				        		//현 상황의 객체의 인댁스를 파악해서 리스트에서 삭제한다.

				        		System.out.println("삭제가 완료되었습니다.");
				        		break;
				        	}
				        }
		        	}
		        	else {
		        		System.out.println("일치하는 id가 없습니다.");
		        		break;		        
		        	}
		        	break;
			          
			          
		        case "4" : // 전체 출력

        			System.out.println("\n------- TODO -----------");

		        	for (int i = 0; i < ToDoObjects.size(); i++) {

			        	switch(ToDoObjects.get(i).getStatus()) {
			        		case 0: //Status: TODO
				        		System.out.println(ToDoObjects.get(i).getDate()+" "+ToDoObjects.get(i).getContent() );
			        		default :
			  		          break;
			        	}

		        	}
		        	
        			System.out.println("\n------- DOING -----------");

		        	for (int i = 0; i < ToDoObjects.size(); i++) {

			        	switch(ToDoObjects.get(i).getStatus()) {
			        		case 1: //Status: DOING
				        		System.out.println(ToDoObjects.get(i).getDate()+" "+ToDoObjects.get(i).getContent() );
			        		default :
			  		          break;
			        	}

		        	}
		        	
        			System.out.println("\n-------- DONE ------------");

		        	for (int i = 0; i < ToDoObjects.size(); i++) {

			        	switch(ToDoObjects.get(i).getStatus()) {
			        		case 2: //Status: DONE
				        		System.out.println(ToDoObjects.get(i).getDate()+" "+ToDoObjects.get(i).getContent() );
			        		default :
			  		          break;
			        	}

		        	}
		        	break;
		        	
		        case "0" :
		          System.out.println("프로그램을 종료합니다.");
		          return;
		    
		        default :
		          System.out.println("잘못된 입력을 하셨습니다.");
		      }
		      System.out.println();
		  }
	  }
}

class AscendingInteger implements Comparator<ToDoObject> { //오름차순 정렬
	@Override
	public int compare(ToDoObject a, ToDoObject b) { 
		if(a.status>b.status) return 1;
		if(a.status<b.status) return -1;
		return 0;
	}
}
	