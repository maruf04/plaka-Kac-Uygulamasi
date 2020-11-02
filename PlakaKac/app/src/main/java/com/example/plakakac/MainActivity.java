package com.example.plakakac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rd=new Random();
    int sayi;
    String plak;
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView il=findViewById(R.id.textView);
        final EditText plaka=findViewById(R.id.editText3);
        final Button kontrolEt=findViewById(R.id.button2);
        final Button baslat=findViewById(R.id.button3);
        final TextView time=findViewById(R.id.time);
        final TextView newScore=findViewById(R.id.enScore);

        final ArrayList<String> SehirIsmi=new ArrayList<>();
        SehirIsmi.add("Adana");
        SehirIsmi.add("Adıyaman");
        SehirIsmi.add("Afyon");
        SehirIsmi.add("Ağrı");
        SehirIsmi.add("Amasya");
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


        plak=String.valueOf(sayi +2);
        kontrolEt.setEnabled(false);//gereksiz tık ve yazıları engelemk için
        plaka.setEnabled(false);//gereksiz tık ve yazıları engelemk için



        //baslat dugmesine tıkladığında
        baslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newScore.setText("score\n" + "0");
                kontrolEt.setEnabled(true);
                sayi =rd.nextInt(82);
                il.setText(SehirIsmi.get(sayi+1));
                plak=String.valueOf(sayi +2);
                plaka.setEnabled(true);
                kontrolEt.setEnabled(true);
                baslat.setEnabled(false);
                il.setEnabled(true);

                new CountDownTimer(35000,500){//sayac
                    @Override
                    public void onTick(long millisUntilFinished) {
                        time.setText("Süre: " + millisUntilFinished / 1000);
                    }

                    @Override
                    public void onFinish() {
                        plaka.setEnabled(false);
                        kontrolEt.setEnabled(false);
                        baslat.setEnabled(true);
                        il.setText("");
                        plaka.setText("");
                        Toast.makeText(MainActivity.this,"Süre bitti",Toast.LENGTH_LONG).show();

                    }
                }.start();


            }
        });
        kontrolEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(plak.equals(plaka.getText().toString())) {
                    Toast.makeText(MainActivity.this,"Doğru Cevap\n" +
                            "+1 puan",Toast.LENGTH_LONG).show();
                    score++;
                    newScore.setText("skor\n"+score);

                }
                else{
                    Toast.makeText(MainActivity.this,"Yanlış Cevap\nplaka:"+plak,Toast.LENGTH_LONG).show();

                }
                plaka.setText("");
                sayi =rd.nextInt(82);
                il.setText(SehirIsmi.get(sayi+1));
                plak=String.valueOf(sayi +2);


            }
        });



    }
}
