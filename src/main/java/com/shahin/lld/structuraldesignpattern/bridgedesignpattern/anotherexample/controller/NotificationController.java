package com.shahin.lld.structuraldesignpattern.bridgedesignpattern.anotherexample.controller;


import com.shahin.lld.structuraldesignpattern.bridgedesignpattern.anotherexample.abstraction.AlertNotification;
import com.shahin.lld.structuraldesignpattern.bridgedesignpattern.anotherexample.abstraction.Notification;
import com.shahin.lld.structuraldesignpattern.bridgedesignpattern.anotherexample.abstraction.PromoNotification;
import com.shahin.lld.structuraldesignpattern.bridgedesignpattern.anotherexample.implementor.EmailSender;
import com.shahin.lld.structuraldesignpattern.bridgedesignpattern.anotherexample.implementor.SlackSender;
import com.shahin.lld.structuraldesignpattern.bridgedesignpattern.anotherexample.implementor.SmsSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notify")
public class NotificationController {

    private final EmailSender emailSender;
    private final SmsSender smsSender;
    private final SlackSender slackSender;

    public NotificationController(EmailSender emailSender, SmsSender smsSender, SlackSender slackSender) {
        this.emailSender = emailSender;
        this.smsSender = smsSender;
        this.slackSender = slackSender;
    }

    @PostMapping("/alert/email")
    public void sendAlertByEmail() {
        Notification notification = new AlertNotification(emailSender);
        notification.notifyUser("System Down", "Production server is down!");
    }

    @PostMapping("/promo/sms")
    public void sendPromoBySms() {
        Notification notification = new PromoNotification(smsSender);
        notification.notifyUser("Big Sale", "50% off on all items!");
    }

    @PostMapping("/alert/slack")
    public void sendAlertBySlack() {
        Notification notification = new AlertNotification(slackSender);
        notification.notifyUser("Memory Alert", "Server memory usage is over 90%");
    }
}

