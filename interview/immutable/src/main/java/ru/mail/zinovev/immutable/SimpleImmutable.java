package ru.mail.zinovev.immutable;

import java.util.Date;

public class SimpleImmutable {
    private final int id;
    private final Date date;

    public SimpleImmutable(int id, Date date) {
        this.id = id;
        this.date = new Date(date.getTime());
    }

    public int getId(){
        return id;
    }

    public Date getDate(){
        return new Date(this.date.getTime());
    }
}
