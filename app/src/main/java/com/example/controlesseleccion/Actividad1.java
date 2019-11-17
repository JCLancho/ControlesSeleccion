package com.example.controlesseleccion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.nio.channels.Pipe;

public class Actividad1 extends AppCompatActivity {

    private ListView lvLista;
    private TextView valorSuperficie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);

        lvLista = findViewById(R.id.lvLista);
        valorSuperficie = findViewById(R.id.valorSuperficie);

        final Pais[] paises = {new Pais("España", 500),
                                new Pais("Portugal", 100),
                                new Pais("Francia", 400)};
        ArrayAdapter<Pais> adaptadorListView = new ArrayAdapter<Pais>(this,
                android.R.layout.simple_list_item_1, paises);
        lvLista.setAdapter(adaptadorListView);

        lvLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Pais selecionado = (Pais) adapterView.getItemAtPosition(i);

                valorSuperficie.setText(selecionado.getSuperficie()+"");

            }
        });

    }


}
