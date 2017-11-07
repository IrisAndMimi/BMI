package com.irisandmimi.bmi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class bmi extends AppCompatActivity {
    String s = new String("abc");
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        Button bHelp = (Button)findViewById(R.id.b_help);
        bHelp.setOnClickListener(listener);
    }
    public void bmi(View view){
//        System.out.println("What???");
        Log.d("MainActivity","testing bmi method");
        EditText edWeight = (EditText) findViewById(R.id.ed_weight);
        EditText edHeight = (EditText) findViewById(R.id.ed_height);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight / (height * height);
        new AlertDialog.Builder(this)
                .setMessage(getString(R.string.UrBmi_is)+ bmi+getString(R.string.Dot))
                .setTitle(R.string.Result_Title)
                .setPositiveButton(R.string.OK,null)
                .show();

      /*  Log.d("MainActivity",getString(R.string.UrBmi_is)+ bmi);
        Toast.makeText(this,"Your bmi is "+ bmi, Toast.LENGTH_LONG).show();*/
    }
}
