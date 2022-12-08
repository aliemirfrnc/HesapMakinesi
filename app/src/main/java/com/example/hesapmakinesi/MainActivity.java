package com.example.hesapmakinesi;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int sayi1,sayi2,toplam,cikarma,carpma,bolme,ortalama,kareAlma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTopla = findViewById(R.id.btnToplama);
        Button btnCıkarma = findViewById(R.id.btnCıkarma);
        Button btnCarpma = findViewById(R.id.btnCarpma);
        Button btnBolme = findViewById(R.id.btnBolme);
        Button btnOrtalama = findViewById(R.id.btnOrtalama);
        Button btnKareAlma = findViewById(R.id.btnKareAlma);
        EditText editSayi1 = findViewById(R.id.editTextSayi1);
        EditText editSayi2 = findViewById(R.id.editTextSayi2);
        TextView txtSonuc = findViewById(R.id.textSonuc);



        btnTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi1, sayi2, toplam;

                if(editSayi1.getText().toString().trim().length() == 0 ){
                    editSayi1.setError("Alanı Doldurun");

                }
                else if (editSayi2.getText().toString().trim().length() == 0){
                    editSayi2.setError("Alanı Doldurun");
                }
                else{
                    sayi1 = Integer.parseInt(editSayi1.getText().toString());
                    sayi2 = Integer.parseInt(editSayi2.getText().toString());
                    toplam = sayi1 + sayi2;
                    txtSonuc.setText("Sonuç: " + toplam);
                }


            }
        });
        btnCıkarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editSayi1.getText().toString().trim().length() == 0 ){
                    editSayi1.setError("Alanı Doldurun");

                }
                else if (editSayi2.getText().toString().trim().length() == 0){
                    editSayi2.setError("Alanı Doldurun");
                }
                else{
                    sayi1 = Integer.parseInt(editSayi1.getText().toString());
                    sayi2 = Integer.parseInt(editSayi2.getText().toString());
                    cikarma = sayi1 - sayi2;
                    txtSonuc.setText("Sonuç:" + cikarma);
                }

            }
        });
        btnCarpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editSayi1.getText().toString().trim().length() == 0 ){
                    editSayi1.setError("Alanı Doldurun");

                }
                else if (editSayi2.getText().toString().trim().length() == 0){
                    editSayi2.setError("Alanı Doldurun");
                } else{
                    sayi1 = Integer.parseInt(editSayi1.getText().toString());
                    sayi2 = Integer.parseInt(editSayi2.getText().toString());
                    carpma = sayi1 * sayi2;
                    txtSonuc.setText("Sonuç:" + carpma);
                }

            }
        });
        btnBolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editSayi1.getText().toString().trim().length() == 0 ){
                    editSayi1.setError("Alanı Doldurun");

                }
                else if (editSayi2.getText().toString().trim().length() == 0){
                    editSayi2.setError("Alanı Doldurun");
                }else{
                    sayi1 = Integer.parseInt(editSayi1.getText().toString());
                    sayi2 = Integer.parseInt(editSayi2.getText().toString());
                    bolme = sayi1 / sayi2;
                    txtSonuc.setText("Sonuç:" + bolme);
                }

            }
        });
        btnOrtalama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editSayi1.getText().toString().trim().length() == 0 ){
                    editSayi1.setError("Alanı Doldurun");

                }
                else if (editSayi2.getText().toString().trim().length() == 0){
                    editSayi2.setError("Alanı Doldurun");
                }else{
                    sayi1 = Integer.parseInt(editSayi1.getText().toString());
                    sayi2 = Integer.parseInt(editSayi2.getText().toString());
                    ortalama = (sayi1 + sayi2) / 2;
                    txtSonuc.setText("Sonuç:" + ortalama);
                }

            }
        });
        btnKareAlma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Uyarı");
                builder.setMessage("Sadece 1.Kutucuğa girilen sayının kare'si alınacaktır.");
                builder.setNegativeButton("Tamam", null);
                builder.show();
                if(editSayi1.getText().toString().trim().length() == 0 ){
                    editSayi1.setError("Alanı Doldurun");
                }else{
                    sayi1 = Integer.parseInt(editSayi1.getText().toString());
                    kareAlma = sayi1 * sayi1;
                    txtSonuc.setText("Sonuç:" + kareAlma);
                }

            }
        });

    }
}