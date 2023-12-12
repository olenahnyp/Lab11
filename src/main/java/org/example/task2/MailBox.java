package org.example.task2;

import com.mailjet.client.errors.MailjetException;

import java.util.List;

public class MailBox {
    private List<MailInfo> infos;
    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }
    public void sendAll() throws MailjetException {
        for (MailInfo info : infos) {
            MailSender.sendMail(info);
        }
    }

}
