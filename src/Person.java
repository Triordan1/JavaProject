public class Person {
    private String name;
    private String id;
    public Person(String aName, String aId)
    {
        name = aName;
        id = aId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
