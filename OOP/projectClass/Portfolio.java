import java.util.ArrayList;

class Portfolio {
    private ArrayList<Project> projects = new ArrayList<>();
    public void portfolio(){

    }
    public void addProject(Project project){
        projects.add(project);
    }
    public ArrayList<Project> getProject(){
        return projects;
    }
    public float getPortfolioCost(){
        float sum = 0;
        for(Project project : projects){
            sum += project.getInitialCost();
        }
        return sum;
    }
    public void showPortfolio(){
        for(Project project : projects){
            project.elevatorPitch();

        }
        System.out.println("\nTotal cost: $"+this.getPortfolioCost());
    }
}
