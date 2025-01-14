package ru.mail.polis.homework.collections.mail;

public class MailWorker {
    private final String talker;
    private final String listener;

    public MailWorker(String talker, String listener) {
        this.talker = talker;
        this.listener = listener;
    }

    public String getTalker() {
        return talker;
    }

    public String getListener() {
        return listener;
    }
}
