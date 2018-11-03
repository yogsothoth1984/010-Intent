package com.example.vloxo.a010_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button acercaDe,verificar;
    private EditText editVerificando;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acercaDe=findViewById(R.id.Id_boton_AcercaDe);
        verificar=findViewById(R.id.Id_verificar);
        editVerificando=findViewById(R.id.Id_editVerificando);
    }
    public void Verificar(View view){
        Toast.makeText(this,"Verificando...",Toast.LENGTH_SHORT).show();
        String clave=editVerificando.getText().toString();
        String claveVerdadera= "Max";
        if (clave.equals(claveVerdadera)){
            Toast.makeText(this,"Clave Aprovada...Bienvenido "+clave+" Señor de los Baldios Helados",Toast.LENGTH_LONG).show();
            Intent intentVerificar=new Intent(this,Activity2.class);
            startActivity(intentVerificar);
        } else {
            Toast.makeText(this,"Clave Incorrecta",Toast.LENGTH_SHORT).show();
        }
    }
    public void AcercaDe(View view){
        Toast.makeText(this,"Acercando...",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,Activity_Acerca_De.class);
        startActivity(intent);
    }
}