package com.example.vloxo.a010_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        toolbar=findViewById(R.id.Id_toolbar);
        //toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Activity2");
        getSupportActionBar().setLogo(R.mipmap.guerraypaz);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.Id_hogar:
                onBackPressed();
                break;
            case R.id.Id_Acerca:
                Toast.makeText(this,"Acercando...",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(this,Activity_Acerca_De.class);
                startActivity(intent);
                break;
            case R.id.Id_Agregar:
                Toast.makeText(this,"Falta funcionalidad",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
