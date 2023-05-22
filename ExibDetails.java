import java.util.ArrayList;
import java.util.List;

public class ExibDetails {
    private String name;
    private List<String> emails = new ArrayList<>();
    private List<String> phoneNos = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public List<String> getPhoneNos() {
        return phoneNos;
    }

    public void setPhoneNos(List<String> phoneNos) {
        this.phoneNos = phoneNos;
    }

    @Override
    public String toString() {
        if (emails.isEmpty() && phoneNos.isEmpty()) {
            return name;
        } else {
            StringBuilder sb = new StringBuilder(name);
            for (String email : emails) {
                sb.append(",").append(email).append(phoneNos.isEmpty() ? "" : "," + phoneNos.get(0)).append("/n");
            }
            return sb.toString();
        }
    }
}
