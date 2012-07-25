package cursocom.example.curso.ingles;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Mensaje extends Activity {
	
	private String mensaje;
	private TextView texto;
	
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_veinticuatrojulio2);
	        
	        Intent men = getIntent();
	        mensaje = men.getStringExtra(veinticuatrojulio.MENSAJE);
	        texto = (TextView) findViewById(R.id.textView1);
	        texto.setText(mensaje);
	    }

}
