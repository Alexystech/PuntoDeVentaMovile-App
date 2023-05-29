package mx.edu.itsx.puntodeventamovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import mx.edu.itsx.puntodeventamovil.dashboard.DashboardActivity;
import mx.edu.itsx.puntodeventamovil.view.RegisterActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signIn(View view) {
        Toast.makeText(getApplicationContext(),"Sesión Iniciada",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, DashboardActivity.class);
        startActivity(intent);
    }

    public void register(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}