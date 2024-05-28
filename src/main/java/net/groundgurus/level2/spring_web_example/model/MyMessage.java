package net.groundgurus.level2.spring_web_example.model;

public class MyMessage {
    private String message;

    public MyMessage() {
    }

    public MyMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
