package edu.wit.mobileapp.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> myValues = new ArrayList<String>();

        //Populate the ArrayList with your own values
        myValues.add("KitKat");
        myValues.add("Lollipop");
        myValues.add("Marshmallow");

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(myValues);
        RecyclerView myView =  (RecyclerView)findViewById(R.id.recyclerview);
        myView.setHasFixedSize(true);
        myView.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        myView.setLayoutManager(llm);
    }
}
