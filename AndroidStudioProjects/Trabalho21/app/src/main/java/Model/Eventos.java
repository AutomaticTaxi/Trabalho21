package Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverter;

import com.example.trabalho21.Converters;

import java.sql.Date;

@Entity

public class Eventos {
    public Eventos(){

    }
    @PrimaryKey(autoGenerate = true)
    private Integer Id;
    @ColumnInfo(name = "nome")
    private String Nome;
    @ColumnInfo(name = "dataEvento")
    private Long DataEvento;
    @ColumnInfo(name = "Tipo_Evento")
    private String Tipo_Evento;

    public String getTipo_Evento() {
        return Tipo_Evento;
    }

    public void setTipo_Evento(String tipo_Evento) {
        Tipo_Evento = tipo_Evento;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Long getDataEvento() {
        return DataEvento;
    }

    public void setDataEvento(Long dataEvento) {
        DataEvento = dataEvento;
    }

    @Override
    public String toString() {
        return Nome+" | "+Tipo_Evento+" | "+ Converters.LongToData(DataEvento) ;
    }
}


