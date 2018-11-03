package com.example.vloxo.a010_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity_Acerca_De extends AppCompatActivity {
    private Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        salir=findViewById(R.id.Id_BotonSalir);
    }
    public void Salir(View view){
        Toast.makeText(this,"Volviendo al MainActivity",Toast.LENGTH_SHORT).show();
        Intent intent2= new Intent(this,MainActivity.class);
        startActivity(intent2);
    }
}
