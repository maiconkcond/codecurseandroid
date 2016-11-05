package firebaseapp.com.example.maiconh.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference usuarioReferencia = databaseReference.child("usuarios");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Usuarios usuario = new Usuarios();

        usuario.setNome("Ana Helena");
        usuario.setSobrenome("Silva");
        usuario.setIdade(25);
        usuario.setSexo("Feminino");

        usuarioReferencia.child("003").setValue(usuario);*/

        Produtos produto = new Produtos();

        produto.setDescricao("Iphone");
        produto.setCor("Branco");
        produto.setFabricante("Apple");

        databaseReference.child("produtos").child("001").setValue(produto);

    }
}
