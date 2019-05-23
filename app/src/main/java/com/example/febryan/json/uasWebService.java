package com.example.febryan.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class uasWebService extends AppCompatActivity {
    private TextView textHasilJSON;
    private TextView tkota;
    private TextView tsiang;
    private TextView tmalma;
    private TextView tdinihari;
    private EditText tsuhu;
    private EditText tkelembapan;
    private RequestQueue mQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uas_web_service);

        mQueue = Volley.newRequestQueue(this);
        textHasilJSON = findViewById(R.id.testJSON);
        Button tombolJson = findViewById(R.id.btnJSON);
        tkota = findViewById(R.id.tkota);
        tsiang = findViewById(R.id.tsiang);
        tmalma = findViewById(R.id.tmalam);
        tdinihari = findViewById(R.id.tdinihari);
        tsuhu= findViewById(R.id.tsuhu);
        tkelembapan= findViewById(R.id.tkelembapan);

        tombolJson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int isian;
                isian =Integer.parseInt(.getText().toString());
                JSON(isian);
            }
        });

    }
            @Override
            public void onClick(View v) {();
    }
}
