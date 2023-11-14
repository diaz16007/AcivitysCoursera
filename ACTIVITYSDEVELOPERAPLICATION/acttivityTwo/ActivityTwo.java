import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmacionActivity extends AppCompatActivity {

    private TextView tvNombre, tvFechaNacimiento, tvTelefono, tvEmail, tvDescripcion;
    private Button btnEditarDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        tvNombre = findViewById(R.id.tvNombre);
        tvFechaNacimiento = findViewById(R.id.tvFechaNacimiento);
        tvTelefono = findViewById(R.id.tvTelefono);
        tvEmail = findViewById(R.id.tvEmail);
        tvDescripcion = findViewById(R.id.tvDescripcion);
        btnEditarDatos = findViewById(R.id.btnEditarDatos);

        Intent intent = getIntent();
        final String nombre = intent.getStringExtra("nombre");
        final String fechaNacimiento = intent.getStringExtra("fechaNacimiento");
        final String telefono = intent.getStringExtra("telefono");
        final String email = intent.getStringExtra("email");
        final String descripcion = intent.getStringExtra("descripcion");

        tvNombre.setText(nombre);
        tvFechaNacimiento.setText(fechaNacimiento);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);

        btnEditarDatos.setOnClickListener(view -> {
            Intent editIntent = new Intent(ConfirmacionActivity.this, MainActivity.class);
            editIntent.putExtra("nombre", nombre);
            editIntent.putExtra("fechaNacimiento", fechaNacimiento);
            editIntent.putExtra("telefono", telefono);
            editIntent.putExtra("email", email);
            editIntent.putExtra("descripcion", descripcion);
            startActivity(editIntent);
        });
    }
}
