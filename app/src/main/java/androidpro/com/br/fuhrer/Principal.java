package androidpro.com.br.fuhrer;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.flotar);
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Principal.this, TestandoBotao.class));
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action",null).show();
            }
        });

        TabLayout Tab1 = (TabLayout) findViewById(R.id.tab1);

    }
}

//https://www.journaldev.com/10318/android-floating-action-button-example-tutorial