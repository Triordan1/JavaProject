import java.util.ArrayList;

public class Professor extends Person {

    private String email;
    private String phoneNumber;
    private ArrayList<String> classes;
    public Professor(String name, String id,String aEmail,String aPhoneNumber)
    {
        super(name,id);
        email = aEmail;
        phoneNumber = aPhoneNumber;
        classes = new ArrayList<>();
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void addClass(String id){
        classes.add(id);
    }
    public boolean checkList(String id){
        for(String s:classes){
            if(id.equals(s)){
                return true;
            }
        }
        return false;
    }

}
