package com.example.trabalho21;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.Date;
import java.util.List;

import Model.Eventos;
import Persistence.EventosRepository;

public class MainActivity extends AppCompatActivity {
    private EditText NomedoEvento;
    private ListView ListadeEventos;
    private Button BtAdicionar;
    private Button BtData;
    private Spinner Tipo_Evento;
    private List<Eventos> dados;
    private Date dataselect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapeamentoXML();
        atualizadados();
        acoes();
    }
    void mapeamentoXML(){
        NomedoEvento = findViewById(R.id.editTextNome);
        ListadeEventos = findViewById(R.id.ListaEventos);
        BtAdicionar = findViewById(R.id.buttonAdicionar);
        Tipo_Evento = findViewById(R.id.Spinner_tipo_evento);
        BtData = findViewById(R.id.BtData);
    }
    public void atualizadados(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                dados = new EventosRepository(getApplicationContext()).GetAll();
                ListadeEventos.setAdapter(
                        new ArrayAdapter(getApplicationContext(),
                                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                                dados)// cria o adapter
                );
            }
        });
        thread.start();
    }
    void acoes(){
        BtData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment newFragment = new DataPickerFragment();
                newFragment.show(getSupportFragmentManager(), "datePicker");
                dataselect = ((DataPickerFragment)newFragment).getData();
            }
        });
        BtAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Eventos eventos = new Eventos();
               eventos.setNome(NomedoEvento.getText().toString());
               eventos.setDataEvento(Converters.dataToLong(dataselect));
               eventos.setTipo_Evento(Tipo_Evento.getSelectedItem().toString());
               InsertAsyncTask insertAsyncTask = new InsertAsyncTask();
               insertAsyncTask.execute(eventos);

            }
        });

    }
    class InsertAsyncTask extends AsyncTask<Eventos,Void,Void> {

        @Override
        protected Void doInBackground(Eventos... eventos) {
            new EventosRepository(getApplicationContext()).insert(eventos[0]);

            return null;
        }
    }

}