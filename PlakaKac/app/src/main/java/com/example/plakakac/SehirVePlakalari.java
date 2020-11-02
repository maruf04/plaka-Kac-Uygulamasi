package com.example.plakakac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SehirVePlakalari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sehir_ve_plakalari);
        ListView listView=findViewById(R.id.listView);


        final ArrayList<String> SehirIsmi=new ArrayList<>();
        SehirIsmi.add("Adana");
        SehirIsmi.add("Adıyaman");
        SehirIsmi.add("Afyon");
        SehirIsmi.add("Ağrı");
        SehirIsmi.add("Amasa");
        SehirIsmi.add("Ankara");
        SehirIsmi.add("Antalya");
        SehirIsmi.add("Artvin");
        SehirIsmi.add("Aydın");
        SehirIsmi.add("Balıkesir");
        SehirIsmi.add("Bilecik");
        SehirIsmi.add("Bingöl");
        SehirIsmi.add("Bitlis");
        SehirIsmi.add("Bolu");
        SehirIsmi.add("Burdur");
        SehirIsmi.add("Bursa");
        SehirIsmi.add("Çanakkale");
        SehirIsmi.add("Çankırı");
        SehirIsmi.add("Çorum");
        SehirIsmi.add("Denizli");
        SehirIsmi.add("Diyarbakır");
        SehirIsmi.add("Edirne");
        SehirIsmi.add("Elazığ");
        SehirIsmi.add("Erzincan");
        SehirIsmi.add("Erzurum");
        SehirIsmi.add("Eskişehir");
        SehirIsmi.add("Gaziantep");
        SehirIsmi.add("Giresun");
        SehirIsmi.add("Gümüşhane");
        SehirIsmi.add("Hakkari");
        SehirIsmi.add("Hatay");
        SehirIsmi.add("Isparta");
        SehirIsmi.add("İçel");
        SehirIsmi.add("İstanbul");
        SehirIsmi.add("İzmir");
        SehirIsmi.add("Kars");
        SehirIsmi.add("Kastamonu");
        SehirIsmi.add("Kayseri");
        SehirIsmi.add("Kırklareli");
        SehirIsmi.add("Kırşehir");
        SehirIsmi.add("Kocaeli");
        SehirIsmi.add("Konya");
        SehirIsmi.add("Kütahya");
        SehirIsmi.add("Malatya");
        SehirIsmi.add("Manisa");
        SehirIsmi.add("Kahramanmaraş");
        SehirIsmi.add("Mardin");
        SehirIsmi.add("Muğla");
        SehirIsmi.add("Muş");
        SehirIsmi.add("Nevşehir");
        SehirIsmi.add("Niğde");
        SehirIsmi.add("Ordu");
        SehirIsmi.add("Rize");
        SehirIsmi.add("Sakarya");
        SehirIsmi.add("Samsun");
        SehirIsmi.add("Siirt");
        SehirIsmi.add("Sinop");
        SehirIsmi.add("Sivas");
        SehirIsmi.add("Tekirdağ");
        SehirIsmi.add("Tokat");
        SehirIsmi.add("Trabzon");
        SehirIsmi.add("Tunceli");
        SehirIsmi.add("Şanlıurfa");
        SehirIsmi.add("Uşak");
        SehirIsmi.add("Van");
        SehirIsmi.add("Yozgat");
        SehirIsmi.add("Zonguldak");
        SehirIsmi.add("Aksaray");
        SehirIsmi.add("Bayburt");
        SehirIsmi.add("Karaman");
        SehirIsmi.add("Kırıkkale");
        SehirIsmi.add("Batman");
        SehirIsmi.add("Şırnak");
        SehirIsmi.add("Bartın");
        SehirIsmi.add("Ardahan");
        SehirIsmi.add("Iğdır");
        SehirIsmi.add("Yalova");
        SehirIsmi.add("Karabük");
        SehirIsmi.add("Kilis");
        SehirIsmi.add("Osmaniye");
        SehirIsmi.add("Düzce");

//listView
        ArrayAdapter arrayAdapter=new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,SehirIsmi);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Long a=id+1;//plaka numarasını dondursun

                Toast.makeText(getApplicationContext(),SehirIsmi.get(position)+" \nilinin plakası:\n "+a,Toast.LENGTH_LONG).show();

            }
        });

    }
}

