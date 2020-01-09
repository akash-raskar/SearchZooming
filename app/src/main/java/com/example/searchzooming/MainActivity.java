package com.example.searchzooming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView l1;
    SearchView s1;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1 = (ListView) findViewById(R.id.list);
        s1 = (SearchView) findViewById(R.id.search);

        list = new ArrayList<String>();

        list.add("Sunday");
        list.add("Monday");
        list.add("Thuesday");
        list.add("Wensdenday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        l1.setAdapter(adapter);

        s1.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);
                return false;
            }
        });

        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), "You Select : " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();

                switch (position)
                {
                    case 0:
                        startActivity(new Intent(MainActivity.this, Zoom.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, Mon.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, Tue.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, Wed.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this, Thu.class));
                        break;
                    case 5:
                        startActivity(new Intent(MainActivity.this, Fri.class));
                        break;
                    case 6:
                        startActivity(new Intent(MainActivity.this, Sat.class));
                        break;

                }
            }

        });
    }
}
