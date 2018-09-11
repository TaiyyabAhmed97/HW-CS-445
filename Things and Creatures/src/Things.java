public class Things {
    private String NAME;
    public Things(String name)
    {
        NAME = name;
    }
    public String toString()
    {
        String midman = " ";
        String classname = this.getClass().getSimpleName();
        if(classname.equals("Things"))
        {
            classname = "";
            midman = "";
        }
        String fstring = this.NAME+ midman + classname;
        return fstring;
    }
}
