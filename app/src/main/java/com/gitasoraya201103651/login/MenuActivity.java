package com.gitasoraya201103651.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button _tampilMahasiswaButton, _tampilForexButton;
    private Intent _tampilMahasiswaIntent, _tampilForexIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initTampilMahasiswaButton();
        initTampilForexButton();
    }

    private void initTampilMahasiswaButton()
    {}

    private void initTampilForexButton()
    {
        _tampilForexButton = (Button) findViewById(R.id.tampilForexButton);

        _tampilForexButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _tampilForexIntent = new Intent(getApplicationContext(), ForexMainActivity.class);
                startActivity(_tampilForexIntent);
            }
        });
    }
}