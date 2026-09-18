package com.todos.tests;

	import java.io.IOException;
	import static org.testng.Assert.assertTrue;
	import org.testng.annotations.Test;

	import com.todos.pages.TodosPage;
	import com.todos.utils.Setup;

	public class RemoveTodosTest extends Setup {

	    public RemoveTodosTest() throws IOException {
	        super();
	    }

	    TodosPage todosPage;

	    @Test(priority = 2)
	    public void iCanRemoveTodos() throws IOException {
	        todosPage = new TodosPage();

	        
	        todosPage.submitTodos(prop.getProperty("todos1"));

	        String elementTodo = todosPage.checkElementContain(TodosPage.todoText);
	        assertTrue(elementTodo.contains(prop.getProperty("todos1")));

	        todosPage.removeTodo();

	    
	        boolean isEmpty = todosPage.isTodoListEmpty();
	        assertTrue(isEmpty);
	    }
	}


