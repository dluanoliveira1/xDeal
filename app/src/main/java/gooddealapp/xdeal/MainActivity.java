package gooddealapp.xdeal;

import android.content.DialogInterface;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox CheckA, CheckB;
    private EditText QuantidadeUnA, QuantidadeUnB, PrecoA, PrecoB, UnidadeA, UnidadeB, QuantidadePA, QuantidadePB ;
    private Button Limpar;

    @Nullable
    @Override
    public View findViewById(@IdRes int id) {
        return super.findViewById(id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Limpar = (Button) findViewById(R.id.button2);
        CheckA = (CheckBox) findViewById(R.id.check1);
        CheckB = (CheckBox) findViewById(R.id.check2);
        QuantidadeUnA = (EditText) findViewById(R.id.editText);
        QuantidadeUnB = (EditText) findViewById(R.id.editText2);
        PrecoA = (EditText) findViewById(R.id.editText8);
        PrecoB = (EditText) findViewById(R.id.editText9);
        UnidadeA = (EditText) findViewById(R.id.editText5);
        UnidadeB = (EditText) findViewById(R.id.editText3);
        QuantidadePA = (EditText) findViewById(R.id.editText6);
        QuantidadePB = (EditText) findViewById(R.id.editText7);

        BotaoLimpar();
        DesabilitarQntdeUnidade();



}

    public void DesabilitarQntdeUnidade()
    {
         CheckA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                if(((CheckBox) v).isChecked())
                {
                    QuantidadeUnA.setEnabled(true);
                }
                else
                {
                    QuantidadeUnA.setEnabled(false);
                    QuantidadeUnA.setText("");
                }
            }
        });

                CheckB.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(((CheckBox) v).isChecked())
                        {

                            QuantidadeUnB.setEnabled(true);

                        }
                        else
                        {

                            QuantidadeUnB.setEnabled(false);
                            QuantidadeUnB.setText("");

                        }
                    }
                });
    }

    private void BotaoLimpar()
    {

        Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Limpar.setText("");
                CheckA.setText("");
                CheckB.setText("");
                QuantidadeUnA.setText("");
                QuantidadeUnB.setText("");
                PrecoA.setText("");
                PrecoB.setText("");
                UnidadeA.setText("");
                UnidadeB.setText("");
                QuantidadePA.setText("");
                QuantidadePB.setText("");

                CheckA.setChecked(false);
                CheckB.setChecked(false);
                QuantidadeUnA.setEnabled(false);
                QuantidadeUnB.setEnabled(false);

                Limpar.setText("LIMPAR");

            }
        });


    }
}


