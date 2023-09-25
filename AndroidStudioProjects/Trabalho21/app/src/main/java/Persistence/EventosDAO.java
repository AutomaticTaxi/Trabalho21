package Persistence;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import Model.Eventos;

@Dao
public interface EventosDAO {
    @Insert
    long InserirEvento(Eventos eventos);
    @Update
    int Atualizar(Eventos eventos);
    @Delete
    int Deletar (Eventos eventos);
    @Query("SELECT * FROM Eventos")
    List<Eventos> BuscarEventos();
}
