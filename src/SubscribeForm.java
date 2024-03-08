import java.util.HashMap;

public class SubscribeForm {

    private String pseudo;
    private String email;
    private String password;
    HashMap subscribe = new HashMap();

    public SubscribeForm(String pseudo, String email, String password) {
        this.pseudo = pseudo;
        subscribe.put("pseudo", getPseudo());
        this.email = email;
        subscribe.put("email", getEmail());
        this.password = password;
        subscribe.put("password", getPassword());

        System.out.println(formatSubscribeToCsv(subscribe));
        System.out.println(formatSubscribeToHtml(subscribe));
        System.out.println(formatSubscribeToJson(subscribe));
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String formatSubscribeToCsv(HashMap subscribe){
        return subscribe.get("pseudo").toString() +
                ";" +
                subscribe.get("email").toString() +
                ";" +
                subscribe.get("password").toString() ;
    }

    public static String formatSubscribeToHtml(HashMap subscribe){
        return "<html><body>"
                + "<b>Pseudo:</b> " +
                subscribe.get("pseudo")
                + "<br><b>Email:</b> " +
                subscribe.get("email")
                + "<br><b>Password:</b> " +
                subscribe.get("password")
                + "</body></html>" ;

    }

    public static String formatSubscribeToJson(HashMap subscribe) {
        return "{ "
                + "pseudo: " +
                subscribe.get("pseudo")
                + ", "
                + "email: " +
                subscribe.get("email")
                + ", "
                + "password: " +
                subscribe.get("password")
                + " }" ;
    }
}
