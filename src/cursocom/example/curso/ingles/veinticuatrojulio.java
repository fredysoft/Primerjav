package cursocom.example.curso.ingles;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.support.v4.app.NavUtils;

public class veinticuatrojulio extends Activity {
	
	public final static String MENSAJE = "labs.kreattiewe.mensaje.MENSAJE";
	private EditText mensaje;
	private String mensajee;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veinticuatrojulio);
    }

public void enviarmensaje(View view) {
	Intent men = new Intent(veinticuatrojulio.this, Mensaje.class);
	mensaje = (EditText) findViewById(R.id.editText1);
	mensajee = mensaje.getText().toString();
	men.putExtra(MENSAJE, mensajee);
	startActivity(men);
    }

    
}
