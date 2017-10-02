package androidpro.com.br.fuhrer;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;

public class TestandoBotao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testando_botao);
        setContentView(R.layout.criando_notas_layout);  //Layout de criação de notas ou inspirações

        final EditText notas = (EditText) findViewById(R.id.editText);  //Recebe a nota digitada pelo usuário   //Obs a nota será criada e ordenada no banco de dados de acordo com a (Data Hora e prioridade respectivamente) para ser exibida na tela principal do usuário
        final EditText data = (EditText) findViewById(R.id.editData);   //Recebe a data que o usuário setou para concluir a nota    No mínimo uma semana antes da nota ser deletada
        final EditText horario = (EditText) findViewById(R.id.edithorario); //Recebe o horário que o usuário deseja realizar a atividade
        final RatingBar prioridade = (RatingBar) findViewById(R.id.ratingBar);  //Recebe a prioridade da nota que o usuário fizer


        /*  Tratamento de prioridades
        final String obaoba;
        if(prioridade.getNumStars()<=3)
            obaoba = "Minima";
        else if(prioridade.getNumStars()>3 && prioridade.getNumStars()<=5)
            obaoba = "Media";
        else
            obaoba = "Máxima";
        */

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.adicionar_nota); //Botão para salvar as notas ou inspirações adicionadas
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Snackbar.make(view, horario.getText(), Snackbar.LENGTH_LONG)
                        .setAction("Action",null).show();
            }
        });
    }
}
