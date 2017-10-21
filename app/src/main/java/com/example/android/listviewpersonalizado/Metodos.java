package com.example.android.listviewpersonalizado;

import android.content.res.Resources;
import android.support.design.widget.TextInputLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by android on 21/10/2017.
 */

public class Metodos {
    private Resources res;

    public static int fotoAleatoria(ArrayList<Integer> fotos){
        int fotoSeleccionada;
        Random r = new Random();
        fotoSeleccionada = r.nextInt(fotos.size());
        return fotos.get(fotoSeleccionada);
    }

}
