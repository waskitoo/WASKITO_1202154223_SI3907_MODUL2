package com.razerblade.waskito_1202154223_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {
    private RecyclerView recycle;
    private adapter adaptermenu;

    public static ArrayList<model>menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        menuList = menuisi();
        recycle = (RecyclerView)findViewById(R.id.recyclerView);
        adaptermenu = new adapter(menuList);
        recycle.setAdapter(adaptermenu);
        recycle.setLayoutManager(new LinearLayoutManager(this));

    }

    private ArrayList<model> menuisi() {
        ArrayList<model> isi = new ArrayList<>();
        isi.add(new model("Sego Kucing",1500,R.drawable.hik_go_kucing,"Nasi dengan ikan Bandeng dan sabel Gerr"));
        isi.add(new model("Sego Langgi",2500,R.drawable.hik_go_langgi,"Nasi dengan Telur,Tempe Bacem,Serundeng dan sambal"));
        isi.add(new model("Sate Usus",1000,R.drawable.hik_sate_usus,"Sate Dari daging usus"));
        isi.add(new model("Tahu Bacem",1000,R.drawable.hik_tahu_bacem,"Tahu Yang dimasak dengan cara bacem"));
        isi.add(new model("Tempe Bace,",1000,R.drawable.hik_tempe_bacem,"Tempe Yang Dimasak dengan KEcap"));
        return  isi;
    }
}
