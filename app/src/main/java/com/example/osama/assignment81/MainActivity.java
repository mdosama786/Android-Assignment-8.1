package com.example.osama.assignment81;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

//Main Activity...
public class MainActivity extends AppCompatActivity implements OnClickListener {

    //Declaration...
    ListView listview;
    ArrayAdapter<String> array;
    Button asce, desc;
    String data[] = { "Jan","Fab","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};

    //onCreate Method...
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiation of UI Components
        listview = (ListView) findViewById(R.id.list_View);
        asce = (Button) findViewById(R.id.asce_btn);
        desc = (Button) findViewById(R.id.dese_btn);

        array = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, data);
        listview.setAdapter(array);

        asce.setOnClickListener(this);
        desc.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        //if Condition...

        if (v == asce) {
            Arrays.sort(data);
            array.notifyDataSetChanged();

        }

        //if Condition...

        if (v == desc) {
            Arrays.sort(data);
            List<String> list = Arrays.asList(data);
            Collections.reverse(list);
            array.notifyDataSetChanged();

        }
    }
}