import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Project p = new Project(
                "My Project",
                "Testing compile",
                LocalDate.now(),
                LocalDate.now().plusDays(10)
        );

        TeamMember m = new TeamMember("Hari", "hari@example.com");
        m.addRole(new PMRole());

        Task t = new HighPriorityTask(
                "Fix Bug",
                "Fix the login issue",
                LocalDate.now().plusDays(2)
        );

        p.addTask(t);
        p.addTeamMember(m);

        System.out.println("Project: " + p.getName()
                + " has " + p.getTasks().size() + " tasks.");
    }
}
