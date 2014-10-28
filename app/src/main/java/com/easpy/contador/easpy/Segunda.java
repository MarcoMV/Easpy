package com.easpy.contador.easpy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by CONTADOR on 28/10/2014.
 */
public class Segunda extends MyActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundaactividad);
        botonRegresar();


    }

    private void botonRegresar() {
        Button accionRegresar = (Button)findViewById(R.id.seg_regresar);
        accionRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Segunda.this,MyActivity.class));
            }
        });
    }
}
