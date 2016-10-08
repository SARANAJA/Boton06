package es.vcarmen.boton06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.TextView;

import static es.vcarmen.boton06.R.id.fab;

public class Boton06 extends AppCompatActivity {
    private FloatingActionButton fab;
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton06);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        texto= (TextView) findViewById(R.id.texto);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto.setText("BOTÓN TOCADO");
            }
        });
    }
}
