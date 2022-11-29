package com.jordanc.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private TextView mycontext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mycontext = (TextView) findViewById(R.id.TxV);
        registerForContextMenu(mycontext);
    }

    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo){
        getMenuInflater().inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.item1:
                Toast toast = Toast.makeText(this, "Item copied",
                        Toast.LENGTH_LONG);
                toast.show();
                return true;

            case R.id.item2:
                Toast toast2 = Toast.makeText(this, "Downloading item...",
                        Toast.LENGTH_LONG);
                toast2.show();
                return true;

            default:
//                return super.onContextItemSelected(item);
                return false;
        }
    }
}