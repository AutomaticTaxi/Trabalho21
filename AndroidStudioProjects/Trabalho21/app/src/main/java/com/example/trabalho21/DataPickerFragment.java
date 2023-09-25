package com.example.trabalho21;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;

import java.util.Calendar;
import java.util.Date;

public class DataPickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener{
    int ano,mes,dia;
    public Date getData(){
        final Calendar c = Calendar.getInstance();
        c.set(ano,mes,dia);
        return c.getTime();
    }
    @Override
    public Dialog onCreateDialog(Bundle saveInstanceState){
        final Calendar c = Calendar.getInstance();
        ano = c.get(Calendar.YEAR);
        mes = c.get(Calendar.MONTH);
        dia = c.get(Calendar.DAY_OF_MONTH);
        return new DatePickerDialog(getActivity(),this,ano,mes,dia);
    }
    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
      ano=i;
      mes=i1;
      dia=i2;
    }
    @NonNull
    @Override
    public CreationExtras getDefaultViewModelCreationExtras(){
        return super.getDefaultViewModelCreationExtras();
    }

}
