import java.util.HashMap;

public class ContactForm {

    private String object;
    private String email;
    private String message;
    HashMap contact = new HashMap();

    public ContactForm(String object, String email, String message) {
        this.object = object;
        contact.put("object", getObject());
        this.email = email;
        contact.put("email", getEmail());
        this.message = message;
        contact.put("message", getMessage());

        System.out.println(formatContactToCsv(contact));
        System.out.println(formatContactToHtml(contact));
        System.out.println(formatContactToJson(contact));
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static String formatContactToCsv(HashMap contact){
        return contact.get("object").toString() +
                ";" +
                contact.get("email").toString() +
                ";" +
                contact.get("message").toString() ;
    }

    public static String formatContactToHtml(HashMap contact){
        return "<html><body>"
                + "<b>Object:</b> " +
                contact.get("object")
                + "<br><b>Email:</b> " +
                contact.get("email")
                + "<br><b>Message:</b> " +
                contact.get("message")
                + "</body></html>" ;

    }

    public static String formatContactToJson(HashMap contact) {
        return "{ "
                + "object: " +
                contact.get("object")
                + ", "
                + "email: " +
                contact.get("email")
                + ", "
                + "message: " +
                contact.get("message")
                + " }" ;
    }
}
