package com.example.prueba;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final EditText num1=findViewById(R.id.num1);
        final EditText num2=findViewById(R.id.num2);
        final TextView num3=findViewById(R.id.num3);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = (int) Integer.parseInt(num1.getText().toString());
                int n2= (int) Integer.parseInt(num2.getText().toString());
                String nu3=String.valueOf(n1+n2);
                num3.setText(nu3);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        ProgressDialog dialog = new ProgressDialog(MainActivity.this);
        dialog.setMessage("Entro a Mensajes Destacados..");
        dialog.hide();
        //switch
        switch (id) {
            case R.id.NuevoGrupo:
                dialog.show();
                return true;


        }

        return super.onOptionsItemSelected(item);
    }
    
}
