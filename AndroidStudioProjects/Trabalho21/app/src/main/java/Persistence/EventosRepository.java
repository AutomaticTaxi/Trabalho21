package Persistence;

import android.content.Context;

import java.util.List;

import Model.Eventos;

public class EventosRepository {
    private EventosDAO eventosDAO;
    public EventosRepository(Context context){
        EventosDataBase db = EventosDataBase.getInstance(context);
        this.eventosDAO = db.eventosDAO();
    }
    public boolean insert(Eventos eventos){
        return this.eventosDAO.InserirEvento(eventos)>0;
    }
    public  boolean update(Eventos eventos){
        return this.eventosDAO.Atualizar(eventos)>0;
    }
    public List<Eventos> GetAll(){
        return this.eventosDAO.BuscarEventos();
    }
    public boolean Delete(Eventos eventos){
        return this.eventosDAO.Deletar(eventos)>0;

    }
 }
