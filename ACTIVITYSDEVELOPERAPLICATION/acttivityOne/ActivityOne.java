import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputLayout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout tilNombre, tilFechaNacimiento, tilTelefono, tilEmail, tilDescripcion;
    private Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tilNombre = findViewById(R.id.tilNombre);
        tilFechaNacimiento = findViewById(R.id.tilFechaNacimiento);
        tilTelefono = findViewById(R.id.tilTelefono);
        tilEmail = findViewById(R.id.tilEmail);
        tilDescripcion = findViewById(R.id.tilDescripcion);
        btnSiguiente = findViewById(R.id.btnSiguiente);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ConfirmacionActivity.class);
                intent.putExtra("nombre", tilNombre.getEditText().getText().toString());
                intent.putExtra("fechaNacimiento", tilFechaNacimiento.getEditText().getText().toString());
                intent.putExtra("telefono", tilTelefono.getEditText().getText().toString());
                intent.putExtra("email", tilEmail.getEditText().getText().toString());
                intent.putExtra("descripcion", tilDescripcion.getEditText().getText().toString());
                startActivity(intent);
            }
        });
    }
}
