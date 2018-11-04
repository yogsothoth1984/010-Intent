package com.example.vloxo.a010_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity_Acerca_De extends AppCompatActivity {
    private Button salir;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        salir=findViewById(R.id.Id_BotonSalir);
        toolbar=findViewById(R.id.Id_toolbar);
        //toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(" Acerca");
        getSupportActionBar().setLogo(R.mipmap.trophy);
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
            case R.id.Id_Agregar:
                Toast.makeText(this,"Falta funcionalidad",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
    public void Salir(View view){
        Toast.makeText(this,"Volviendo al MainActivity",Toast.LENGTH_SHORT).show();
        Intent intent2= new Intent(this,MainActivity.class);
        startActivity(intent2);
    }
}
