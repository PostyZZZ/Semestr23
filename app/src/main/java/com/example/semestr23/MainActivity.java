package com.example.semestr23;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyLogSystem";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = findViewById(R.id.button);
        Button two = findViewById(R.id.button1);
        Button three = findViewById(R.id.button2);
        Button four = findViewById(R.id.button3);
        Button five = findViewById(R.id.button4);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInfo("INFO: Откройте логи!");
                logMessage("Инфомарция!");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInfo("ERROR: Откройте логи!");
                logError("Ошибка!");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInfo("VERBOSE: Откройте логи!");
                logVerbose("Подробности!");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInfo("DEBUG: Откройте логи!");
                logDebug("Отладка!");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInfo("WARNING: Откройте логи!");
                logWarning("Опасно!");
            }
        });

        getWindow().setStatusBarColor(Color.parseColor("#000000"));

    }
    private void showInfo(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
    public void logMessage(String message) {
        Log.i(TAG, message);
    }

    public void logError(String errorMessage) {
        Log.e(TAG, errorMessage);
    }

    public void logVerbose(String verboseMessage) {
        Log.v(TAG, verboseMessage);
    }

    public void logDebug(String debugMessage) {
        Log.d(TAG, debugMessage);
    }

    public void logWarning(String warningMessage) {
        Log.w(TAG, warningMessage);
    }

}