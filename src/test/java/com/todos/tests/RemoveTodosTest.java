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

	        // Étape 1 : ajouter une tâche à supprimer
	        todosPage.submitTodos(prop.getProperty("todos1"));

	        String elementTodo = todosPage.checkElementContain(TodosPage.todoText);
	        assertTrue(elementTodo.contains(prop.getProperty("todos1")));

	        // Étape 2 : supprimer la tâche
	        todosPage.removeTodo();

	        // Étape 3 : vérifier que la liste est vide
	        boolean isEmpty = todosPage.isTodoListEmpty();
	        assertTrue(isEmpty);
	    }
	}


