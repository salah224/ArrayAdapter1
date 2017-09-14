package com.example.salah.arrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String name[] = {"  zaynah", "  salah", "  chloe", "  james", "  eric", "  hannah",
    "  matthew", "  olivia", "  sophia", "  marisa", "  alyson", "  kaylee", "  carlos", "  kelly", "  brooklyn"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= (ListView)findViewById(R.id.listview);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.activity_list_view,R.id.textView,name);
        listView.setAdapter(arrayAdapter);
    }



}
