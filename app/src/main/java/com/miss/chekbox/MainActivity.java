package com.miss.chekbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowEnabled(true);

        final CheckBox nasiGoreng = (CheckBox) findViewById(R.id.nasi_goreng);
        final CheckBox mieGoreng = (CheckBox) findViewById(R.id.mie_goreng);
        final CheckBox buburAyam = (CheckBox) findViewById(R.id.bubur_ayam);
        final CheckBox baksoUrat = (CheckBox) findViewById(R.id.bakso_urat);

        final Button pesan = (Button) findViewById(R.id.button_pesan);

        final TextView hasilPesanan = (TextView) findViewById(R.id.hasil_pesanan);

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pesanan="";
                if (nasiGoreng.isChecked()){
                    pesanan+="Nasi goreng\n";
                }if (mieGoreng.isChecked()){
                    pesanan+="Mie goreng\n";
                }if (buburAyam.isChecked()){
                    pesanan+="Bubur ayam\n";
                }if (baksoUrat.isChecked()){
                    pesanan+="Bakso urat";
                }
                hasilPesanan.setText(pesanan);
            }
        });

    }

}
