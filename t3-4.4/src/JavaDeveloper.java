public class JavaDeveloper extends Developer {
    public JavaDeveloper(String name, String level, int experience, String set_of_technologies) {
        super(name, level, experience, set_of_technologies);
    }

    @Override
    public void doCode(){
        System.out.println("Java developer starting write code");
        System.out.println(getSet_of_technologies());
    }
}
