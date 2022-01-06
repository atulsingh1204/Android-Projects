package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mylistView = findViewById(R.id.listView);


        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Bhindi");
        arrayList.add("Potato");
        arrayList.add("Pen");
        arrayList.add("Book");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        mylistView.setAdapter(arrayAdapter);


        mylistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               // String text = "Item" + i +" " + l +"view= " +view.toString();

                Log.e("Abc", "View" +view.toString());
                Log.e("Abc", "I" +i);
                Log.e("Abc", "l" +l);

                if(i==0){
                    Toast.makeText(MainActivity.this, "This is Bhindi", Toast.LENGTH_SHORT).show();
                }else if(i==1){
                    Toast.makeText(MainActivity.this, "This is Potato", Toast.LENGTH_SHORT).show();
                }else if(i==2){
                    Toast.makeText(MainActivity.this, "This is Pen", Toast.LENGTH_SHORT).show();
                }else if(i==3){
                    Toast.makeText(MainActivity.this, "This is Book", Toast.LENGTH_SHORT).show();
                }

              // Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });


    }
}