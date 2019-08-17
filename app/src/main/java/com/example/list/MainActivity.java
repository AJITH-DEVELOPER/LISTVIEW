package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    ListView listView;
    Button button;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.flowerName);
        listView = (ListView)findViewById(R.id.flowersList);
        button = (Button)findViewById(R.id.addflower);

        arrayList = new ArrayList<String>();
        arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);


    View.OnClickListener addlistener= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            arrayList.add(editText.getText().toString());
            editText.setText("");
            arrayAdapter.notifyDataSetChanged();
        }
    };
   button.setOnClickListener(addlistener);
        listView.setAdapter(arrayAdapter);
    }


}


