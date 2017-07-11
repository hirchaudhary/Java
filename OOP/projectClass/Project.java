class Project {
    private String name;
    private String description;
    private float intialCost;

    public Project() {
        this.name = "";
        this.description = "";
    }

    public Project(String name) {
        this.name = name;
        this.description = "";
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setInitialCost(float intialCost){
        this.intialCost = intialCost;
    }

    public float getInitialCost(){
        return this.intialCost;
    }

    public String elevatorPitch(){
        System.out.println(name+" ("+intialCost+") : " +description);
        return name+"("+intialCost+") :" +description;
    }
}
