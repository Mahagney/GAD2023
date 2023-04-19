package oo.interfaces;

import java.sql.Time;

public class SamsungWatch implements Clock, SmartWatch {

    @Override
    public String getTime() {
        return new Time(22, 13, 13)
                .toLocalTime().toString();
    }

    @Override
    public void sendEmail(String toEmail) {

        System.out.println("Email sent to" + toEmail);
    }
}
