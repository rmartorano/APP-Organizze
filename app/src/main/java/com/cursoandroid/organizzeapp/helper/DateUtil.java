package com.cursoandroid.organizzeapp.helper;

import java.text.SimpleDateFormat;

public class DateUtil {

    public static String dataAtual(){

        long date = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataString = simpleDateFormat.format(date);
        return dataString;

    }

    public static String mesAnoDataEscolhia(String data){
        String retornoData[] = data.split("/");
        String mes = retornoData[1]; //mes
        String ano = retornoData[2]; //ano

        return mes+ano;
    }

}
