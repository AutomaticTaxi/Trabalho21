package com.example.trabalho21;

import androidx.room.TypeConverter;

import java.util.Date;

public class Converters {
    @TypeConverter
    public static Long dataToLong(Date date) {

        return date == null ? null : date.getTime();
    }
    @TypeConverter
    public static Date LongToData(Long value) {

        return value == null ? null : new Date(value);
    }


}
