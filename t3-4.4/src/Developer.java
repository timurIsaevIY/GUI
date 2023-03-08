public abstract class Developer {
    private String name;
    private String level;
    private int experience;
    private String set_of_technologies;
    public abstract void doCode();
    public Developer (String name, String level, int experience, String set_of_technologies){
        if (level!="juniour" && level!="middle" && level!="senior"){
            throw new IllegalArgumentException("no such level");
        }
        if (experience>80){
            throw new IllegalArgumentException("no such experience");
        }
        this.name=name;
        this.level=level;
        this.experience=experience;
        this.set_of_technologies=set_of_technologies;
    }
    public String getSet_of_technologies(){
        return this.set_of_technologies;
}
    public String getName(){
        return this.name;
    }
    public String getLevel(){
        return this.level;
    }
    public int getExperience(){
        return this.experience;
    }
}
