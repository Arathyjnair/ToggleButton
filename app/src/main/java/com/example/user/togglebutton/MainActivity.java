package com.example.user.togglebutton;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import static android.webkit.WebSettings.PluginState.ON;
import static java.util.logging.Level.OFF;

public class MainActivity extends AppCompatActivity {
    Switch switp;
    LinearLayout linp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switp=findViewById(R.id.myswitch);
        linp=findViewById(R.id.lin);

        switp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    linp.setBackgroundResource(R.color.green);
                }
                else
                {
                    linp.setBackgroundResource(R.color.blue);
                }
            }
        });


    }
}
