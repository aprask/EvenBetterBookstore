package User.Admin;
import java.util.*;
public class Admin {
    private final String adminPassword = "cs1213project1";
    private final Scanner scan = new Scanner(System.in);
    private boolean passedTest = false;
    public Admin() {
        int i = 5;
        while (i > 0)
        {
            System.out.println("Enter password:");
            System.out.println("You have " + i + " Attempts Left:\n");
            String passwordAttempt = scan.next();
            if (passwordAttempt.equals(adminPassword)) {
                System.out.println("You have successfully opened the admin room! ");
                this.passedTest = true;
                break;
            }
            else
            {
                System.out.println("Incorrect Password");
                i--;
            }

        }
    }

    public boolean didPass() {
        return passedTest;
    }
}
