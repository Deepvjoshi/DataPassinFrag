package com.deepjoshi.fragdata;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Deep Joshi on 02-02-2017.
 */

public class Fragtwo extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        container= (ViewGroup) inflater.inflate(R.layout.fragtwo, container, false);
        Button bt=(Button)container.findViewById(R.id.Button1_frgtwo);
        Button bt1=(Button)container.findViewById(R.id.Button2_frgtwo);
        final TextView tx=(TextView)container.findViewById(R.id.tx12);
final EditText editText=(EditText)container.findViewById(R.id.edit_fragTwo);
        final String as=getArguments().getString("key1");
        //tx.setText(as);
        //String dj=getString().toString(as);

        bt1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Fragthree fr= new Fragthree();
                FragmentManager fm= getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                Bundle bundle=new Bundle();
                 String ds=editText.getText().toString();

                bundle.putString("key2",as);
                bundle.putString("key3",ds);
                fr.setArguments(bundle);
                ft.replace(R.id.fragloc,fr);
                // ft.add(headlines_fragment,sp);
                // ft.add(R.id.headlines_fragment,sp);
                editText.setText("");
                ft.addToBackStack(null);
                ft.commit();

            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Fragthree fr= new Fragthree();
                FragmentManager fm= getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
               // ft.replace(R.id.fragloc,fr);
                // ft.add(headlines_fragment,sp);
                // ft.add(R.id.headlines_fragment,sp);
                fm.popBackStack();
                ft.commit();

            }
        });
        return container;
    }
}
