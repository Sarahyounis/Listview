package com.example.sarah.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener,AdapterView.OnItemLongClickListener{
ListView schedual;
    ArrayList<String> arrschedual=new ArrayList<String>();
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        schedual=(ListView) findViewById(R.id.lstvw);
        arrschedual.add("deutsch");
        arrschedual.add("arabich");
        adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,arrschedual);
        schedual.setAdapter(adapter);
        schedual.setOnItemClickListener(this);
        schedual.setOnItemLongClickListener(this);

    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Toast.makeText(this,arrschedual.get(position),Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        arrschedual.remove(arrschedual.get(position));
        adapter.notifyDataSetChanged();
        return false;
    }
}
