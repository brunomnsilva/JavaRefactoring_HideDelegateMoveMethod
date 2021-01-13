package pt.pa.refactoring.A_inappropriate_intimacy;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class MyContacts {
    Set<Person> list;
    Date creationDate;

    public MyContacts() {
        list = new HashSet<>();
        creationDate = new Date();
    }

    public String show() {
        StringBuilder sb = new StringBuilder();

        sb.append( String.format("%40s | %20s | %40s", "Name", "Phone", "Email"));
        for(Person p : list) {
            /* Check if person has phone number or email; if not say "None". */
            sb.append(String.format("%40s | %20s | %40s",
                    p.fullName, (p.phoneNumber != null ? p.phoneNumber : "None"),
                    (p.emailAddress != null ? p.emailAddress : "None")));
            sb.append("\n");
        }

        return sb.toString();
    }
}
