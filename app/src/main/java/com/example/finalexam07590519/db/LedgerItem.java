package com.example.finalexam07590519.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "ledger")
public class LedgerItem {

    @PrimaryKey(autoGenerate = true)

    public int id;

    @ColumnInfo(name = "fullname")
    public String fullname;

    @ColumnInfo(name = "username")
    public String usermname;

    @ColumnInfo(name = "password")
    public String password;

    public LedgerItem(int id, String fullname, String usermname , String password) {
        this.id = id;
        this.fullname = fullname;
        this.usermname = usermname;
        this.password = password;
    }
}
