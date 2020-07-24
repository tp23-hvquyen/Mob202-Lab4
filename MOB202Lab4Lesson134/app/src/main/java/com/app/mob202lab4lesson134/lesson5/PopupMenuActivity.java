package com.app.mob202lab4lesson134.lesson5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.app.mob202lab4lesson134.R;

public class PopupMenuActivity extends AppCompatActivity
implements View.OnClickListener{
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);
        button = findViewById(R.id.bottom);
    }
    @Override
    public void onClick(View v) {
        PopupMenu popupMenu = new PopupMenu(this, button);
        getMenuInflater().inflate(R.menu.option_menu, popupMenu.getMenu());
    }
}