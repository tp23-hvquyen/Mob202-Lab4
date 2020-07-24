package com.app.mob202lab4lesson134;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupMenu;

import com.app.mob202lab4lesson134.lesson5.PopupMenuActivity;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ListView listView;
    String[] arr = {"Đao","Kiếm","Búa","Liềm"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Lab4 lesson 1
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//thiết lập
        getSupportActionBar().setDisplayShowHomeEnabled(true);//hiển thị
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        toolbar.setLogo(R.drawable.ic_baseline_apartment_24);
        //Lab4 lesson 4
        listView = findViewById(R.id.lv_context_menu);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arr);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);//dang ky context menu cho list view

    }
    //Lab4 lesson 3
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    //Vì chưa có chức năng nên em không làm ánh xạ
    //Lab4 lesson 4

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }
    public void lesson5(View view){
        //Lab4 lesson 5
        Intent i = new Intent(this, PopupMenuActivity.class);
        startActivity(i);
    }
}