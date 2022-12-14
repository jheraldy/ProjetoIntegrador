package br.com.local.projetointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class
MenuPratoActivity extends AppCompatActivity {
    EditText edtQuantidadeMenuPrato;
    Button btnMenos, btnMais, btnAdicionarItens, btnItem;
    TextView testeSoma, valorProduto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_prato_layout);
        btnMais = findViewById(R.id.btnMais);
        btnMenos = findViewById(R.id.btnMenos);
        btnAdicionarItens = findViewById(R.id.btnAdicionarItens);
        btnItem = findViewById(R.id.btnItem);


        btnAdicionarItens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MenuPrincipalActivity.class));
            }
        });

        btnItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PagamentosActivity.class));
            }
        });


        btnMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtQuantidadeMenuPrato = findViewById(R.id.edtQuantidadeMenuPrato);
                Integer quantid = Integer.parseInt(String.valueOf(edtQuantidadeMenuPrato.getText()));
                edtQuantidadeMenuPrato.setText(String.valueOf(quantid + 1));
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtQuantidadeMenuPrato = findViewById(R.id.edtQuantidadeMenuPrato);
                Integer quantid = Integer.parseInt(String.valueOf(edtQuantidadeMenuPrato.getText()));
                if (quantid > 0) {
                    edtQuantidadeMenuPrato.setText(String.valueOf(quantid - 1));
                }
            }
        });

    }
}
