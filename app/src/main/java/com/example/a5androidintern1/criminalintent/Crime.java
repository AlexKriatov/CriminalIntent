package com.example.a5androidintern1.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by A5 Android Intern 1 on 02.12.2016.
 */

public class Crime {
    //объявление переменных пиступления
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;


    //геттеры и сеттеры

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }
    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    //конструктор
    public Crime(){
        //Генерирование уникального идентификатора
        mId = UUID.randomUUID();
        mDate = new Date();
    }
}
