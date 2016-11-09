package ashishrpa.session12assignmet02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //TextView textView;
    EditText editText;
    Button button;
    private String myString;
    private SimpleAdditionFragment firstFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.et_enter_number);
        button = (Button) findViewById(R.id.button_show_in_fragment);
        firstFragment = new SimpleAdditionFragment();

        if (findViewById(R.id.fragment_container) != null) {

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, firstFragment).commit();
        }


        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                changeFragmentTextView(firstFragment, editText.getText().toString());
                Toast.makeText(getApplicationContext(), editText.getText().toString(), Toast.LENGTH_LONG).show();
            }
        };

        button.setOnClickListener(listener);
    }


    public void changeFragmentTextView(SimpleAdditionFragment saf, String s) {
        ((TextView) saf.getView().findViewById(R.id.textViewInFragment)).setText(s);
    }

}
