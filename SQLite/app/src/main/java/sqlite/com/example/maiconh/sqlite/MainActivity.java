package sqlite.com.example.maiconh.sqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {


        SQLiteDatabase bancoDados = openOrCreateDatabase("app",MODE_PRIVATE,null);

        //tabela
        bancoDados.execSQL("CREATE TABLE IF NOT EXISTS pessoas(nome VARCHAR, idade INT(3))");

        //inserir dados na tabela
        bancoDados.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('Marcos',30)");
        bancoDados.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('Ana',20)");


        //recuperar dados
        Cursor cursor = bancoDados.rawQuery("SELECT nome,idade FROM pessoas",null);

        int indiceColunaNome = cursor.getColumnIndex("nome");
        int indiceColunaIdade = cursor.getColumnIndex("idade");

        cursor.moveToFirst();

        while (cursor != null){

            Log.i("Resultado = nome: ", cursor.getString(indiceColunaNome));
            Log.i("Resultado = idade: ", cursor.getString(indiceColunaIdade));
            cursor.moveToNext();

        }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
