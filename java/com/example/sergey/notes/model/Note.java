/**
 * Created by Sergey on 07.11.2016.
 */

package com.example.sergey.notes.model;

import android.database.Cursor;

import com.example.sergey.notes.db.NotesContract;
import com.tjeannin.provigen.ProviGenBaseContract;

import java.io.Serializable;

public class Note implements Serializable {

    private long mId;

    private String mTitle = null;

    private String mText = null;

    private String mTime = null;

    public Note() {}

    public Note(Cursor data) {
        mId = data.getLong(data.getColumnIndex(ProviGenBaseContract._ID));
        mTitle = data.getString(data.getColumnIndex(NotesContract.TITLE_COLUMN));
        mText = data.getString(data.getColumnIndex(NotesContract.TEXT_COLUMN));
        mTime = data.getString(data.getColumnIndex(NotesContract.TIME_COLUMN));
    }

    public long getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String time) {
        this.mTime = time;
    }
}