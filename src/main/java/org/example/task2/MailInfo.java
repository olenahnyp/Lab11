package org.example.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String makeSubject() {
        return null;
    }

    public String makeText() {
        return null;
    }

    public int makeID() {
        return client.getId();
    }
}
