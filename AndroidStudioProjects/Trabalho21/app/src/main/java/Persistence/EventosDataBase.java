package Persistence;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import Model.Eventos;
@Database(entities = Eventos.class,version = 1)
public abstract class EventosDataBase extends RoomDatabase {
    public abstract EventosDAO eventosDAO();
    private static volatile EventosDataBase INSTANCE;
    static EventosDataBase getInstance(Context context){
        if(INSTANCE == null){
            synchronized (EventosDataBase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            EventosDataBase.class,"DbEventos").build();
                }
            }
        }
        return INSTANCE;
    }

}
