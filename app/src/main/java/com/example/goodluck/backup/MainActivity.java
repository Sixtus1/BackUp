package com.example.goodluck.backup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {
    ListView backup_list=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      backup_list=(ListView) findViewById(R.id.backup_list);
        //creating list Adapter
        List<String> listAdapter=new ArrayList<String>();
        //list components
        String components[]=new String[3];
        //mentioning those components
        components[0]="---TESTS---";
        components[1]="---RESULTS---";
        components[2]="---TEACHERS---";
        //creating for loop
        for(String component:components){
            // Adapter
            listAdapter.add(component);
        }
       ListAdapter adapter= new ArrayAdapter<>(this,
               android.R.layout.simple_list_item_1,listAdapter);
        backup_list.setAdapter(adapter);

        //creating on click listener.
        backup_list.setOnItemClickListener(this);

    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        int x=position+1;
        //Toast.makeText(getApplicationContext(),"under trial "+x,Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);

    }
}


