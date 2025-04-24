public class Task {
    String description;
    boolean isComplete;
    
    public void task (String description){
        this.description = description;
        this.isComplete = false;
    }

    public void markComplete(){
        this.isComplete = true;
    }
    
    public void setDescription(String description){
        this.description  = description;
    }

    public String getDescription(){
        return description;
    }

    public boolean isComplete(){
        return isComplete;
    }

    @Override
    public String toString(){
        return (isComplete ? "[X]"  : "[]") + description;
    }

    
}
