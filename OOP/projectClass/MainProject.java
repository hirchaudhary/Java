class MainProject {
    public static void main(String[] args) {
        Project object = new Project();
        object.setName("Test");
        object.setDescription("Here's a description");
        object.setInitialCost(2.50f);
        Project obj = new Project("test2");
        obj.setInitialCost(2.50f);
        Project p = new Project("test3", "description");
        p.setInitialCost(2.50f);

        Portfolio port = new Portfolio();
        port.addProject(object);
        port.addProject(obj);
        port.addProject(p);
        port.showPortfolio();
    }
}
