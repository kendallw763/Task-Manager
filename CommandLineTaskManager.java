import java.util.ArrayList; 
import java.util.List; 
import java.util.Scanner;

public class CommandLineTaskManager{
    public static List <Task> Tasks = new ArrayList<>();
    public static Scanner Scan = new Scanner (System.in);
    
    String command;
    
    do{
        System.out.print("");
        System.out.print("");
        System.out.print("");
        System.out.print("");
        System.out.print("");
        System.out.print("");
        System.out.print("");
        command = Scan.nextLine().trim().toLowerCase();

    if(command.startsWith("add")){
       addTask(command.substring(4).trim());

    } else if(command.equals("list")){
        listTasks();

    } else if(command.startsWith("complete")){
       
        try{
         int index = Integer.parseInt(command.substring(9).trim())-1;   
         markTaskComplete(index);

        }catch(NumberFormatException | IndexOutOfBoundsException e){
            System.err.println("invalid task index command");
        }

    }else if(command.startsWith("edit")){
        try{
            String[] parts = command.substring(5).trim().split("", 2);
            int index = Integer.parseInt(parts[0].trim())-1;
            String newDescription = parts.length > 1 ? parts[1].trim() : "";
            editTask(index, newDescription);

        } catch(NumberFormatException | IndexOutOfBoundsException e){
            System.err.println("invalid input for edit command");
        }
    }else if(command.startsWith("delete")){
        try{
            int index = Integer.parseInt(command.substring(7).trim())-1;
            deleteTask(index);
        }catch(NumberFormatException | IndexOutOfBoundsException e){
            System.err.println("invalid task index");

        }
    }else if(command.equals("exit")){
        System.out.print("exiting Task Manager. Goodbye! :)");
    }else if (command.isEmpty()){
        System.out.println("Unknown command");
        }
    }while (!command.equals("exit"));

    Scan.close();


public static void  addTask(String description){
    Task newTask = new Task();
    Tasks.add(newTask);
    System.out.print("Task added: " + description);
    }
}

}