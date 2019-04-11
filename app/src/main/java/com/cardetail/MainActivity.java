package com.cardetail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvoutput;
    private Button btncreatecar, btncreatediesel;
    private EditText txtname, txtyear, txtcolor, txtprice, txtenginesize;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtname = findViewById(R.id.txtname);
        txtcolor = findViewById(R.id.txtcolor);
        txtenginesize = findViewById(R.id.txtenginesize);
        txtprice = findViewById(R.id.txtprice);
        txtyear = findViewById(R.id.txtyear);
        tvoutput = findViewById(R.id.tvoutput);

        btncreatecar = findViewById(R.id.btncreatecar);
        btncreatediesel = findViewById(R.id.btncreatediesel);

        btncreatecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                String name = txtname.getText().toString();
                int year = Integer.parseInt(txtyear.getText().toString());
                float price = Float.parseFloat(txtprice.getText().toString());
                float size = Float.parseFloat(txtenginesize.getText().toString());
                tvoutput.append("This is vehicle No." + i + "\n" + "Manufacturer: " + name + " Current value: " + price + " Effective Engine Size: " + size + "\n");
            }
        });
    }
}
