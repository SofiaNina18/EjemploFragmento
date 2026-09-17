package com.example.ejemplofragmento.fragmentos;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ejemplofragmento.R;

public class FragmentoAbajo extends Fragment {

    public FragmentoAbajo() {
        super();
    }

    //GENERAMOS UNA NUEVA INSTANCIA PORQUE ESTE FRAGMENTO RECIVE PARAMETROS
    public static FragmentoAbajo newInstance(Bundle bundle){
        FragmentoAbajo fragmentoAbajo = new FragmentoAbajo();
        if (bundle != null) {

            fragmentoAbajo.setArguments(bundle);

        }
        return fragmentoAbajo;

    }

    //CUANDO CARGAMOS LA VISTA O EL LAYOUT EN PANTALLA
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragmento_abajo, container, false );


    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tvAbajo = view.findViewById(R.id.tvAbajo);
        Bundle bundle = getArguments();

        if (bundle != null) {
            if (bundle.containsKey("saludo")){
                tvAbajo.setText(bundle.getString("saludo"));
            }
            if (bundle.containsKey("color")) {
                tvAbajo.setTextColor(bundle.getInt("color"));
            }
        }

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }




}