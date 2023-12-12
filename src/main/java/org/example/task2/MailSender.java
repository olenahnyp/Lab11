package org.example.task2;

import com.mailjet.client.errors.MailjetException;
import org.json.JSONArray;
import org.json.JSONObject;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.resource.Emailv31;

import lombok.Builder;
import lombok.ToString;

@Builder @ToString
public class MailSender {
    public static void sendMail(MailInfo mailInfo) throws MailjetException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        ClientOptions options = ClientOptions.builder().apiKey("apiKey").apiSecretKey("apiSecretKey").build();
        client = new MailjetClient(options);
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", mailInfo.getClient().getMail())
                                        .put("Name", mailInfo.getClient().getMail())
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                            .put("Email", mailInfo.getClient().getMail())
                                            .put("Name", mailInfo.getClient().getName()))))
                                .put(Emailv31.Message.SUBJECT, mailInfo.makeSubject())
                                .put(Emailv31.Message.TEXTPART, mailInfo.makeText())
                                .put(Emailv31.Message.CUSTOMID, mailInfo.makeID())));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
