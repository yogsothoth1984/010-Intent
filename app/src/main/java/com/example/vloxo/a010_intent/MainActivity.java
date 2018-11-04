package com.example.vloxo.a010_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button acercaDe,verificar;
    private EditText editVerificando;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //<<<<<VINcuLO>>>>>
        acercaDe=findViewById(R.id.Id_boton_AcercaDe);
        verificar=findViewById(R.id.Id_verificar);
        editVerificando=findViewById(R.id.Id_editVerificando);
        toolbar=findViewById(R.id.Id_toolbar);

        //toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setLogo(R.mipmap.cthulhu);
        getSupportActionBar().setTitle("MainActivity");
    }
    //Este metodo habilita el menu de los 3 puntos
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    //Da la funcionalidad a los menus de los 3 puntos
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
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