class Information {

    private String password = "Harsh@123";
    
    public void setPassword(String pass) {
        this.password = pass;

    }
    public String getPassword() {
        return this.password;
    }
}

public class GettersAndSetters {

    public static void main(String[] args) {

        Information in = new Information();
        System.out.println(in.getPassword());
        in.setPassword("New password");
        

    }

}