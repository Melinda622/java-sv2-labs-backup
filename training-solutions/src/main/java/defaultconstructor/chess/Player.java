package defaultconstructor.chess;

public class Player {

    private String name;
    private  String emailAddress;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return emailAddress;
    }

    public void setEmail(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
