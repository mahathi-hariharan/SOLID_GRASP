import java.util.ArrayList;
import java.util.List;

public class TeamMember {
    private String name;
    private String email;
    private List<Role> roles;

    public TeamMember(String name, String email) {
        this.name = name;
        this.email = email;
        this.roles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void addRole(Role role) {
        roles.add(role);
    }

    public void removeRole(Role role) {
        roles.remove(role);
    }
}
