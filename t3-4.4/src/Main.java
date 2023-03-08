public class Main {
    public static void main(String[] args) {
        class Creator{
            public void create(String[] typeOfDeveloper) throws WrongTypeOfDeveloperExceptionImpl  {
                switch (typeOfDeveloper[0]) {
                    case "JavaDeveloper" :
                            JavaDeveloper javaDeveloper = new JavaDeveloper(typeOfDeveloper[1], typeOfDeveloper[2], Integer.parseInt(typeOfDeveloper[3]), typeOfDeveloper[4]);
                            javaDeveloper.doCode();
                            break;
                    case "PythonDeveloper" :
                            PythonDeveloper pythonDeveloper= new PythonDeveloper(typeOfDeveloper[1], typeOfDeveloper[2], Integer.parseInt(typeOfDeveloper[3]), typeOfDeveloper[4]);
                            pythonDeveloper.doCode();
                            break;
                    default :
                            throw new WrongTypeOfDeveloperException("error: no such type of developer");
                }
            }
        }
        String[] developer1 = {"JavaDeveloper","Tom","juniour","56","Pattern, SQL, class"};
        String[] developer1Bad = {"JavDeveloper","Tom","juniour","56","Pattern, SQL, class"};
        String[] developer2 = {"PythonDeveloper","Tom","middle","56","numpy pandas matlab"};
        String[] developer2Bad = {"PythonDeveloper","Tom","beginner","56","numpy pandas matlab"};
        Creator creator = new Creator();
        creator.create(developer1);
        creator.create(developer1Bad);
        creator.create(developer2);
        creator.create(developer2Bad);
    }
}