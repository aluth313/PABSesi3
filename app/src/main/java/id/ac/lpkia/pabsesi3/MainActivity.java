package id.ac.lpkia.pabsesi3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //variable global untuk setiap component
    Spinner sProvince;
    Button btnOk;
    TextView tvProvince;


//    RadioGroup rgGender;
//    CheckBox cbReading, cbWriting, cbOther;
//    TextView tvGender, tvHobbies;
//    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component_spinner);

        // inisiasi setiap component berdasarkan id pada layout
//        rgGender = findViewById(R.id.rdGender);
//        cbReading = findViewById(R.id.cbReading);
//        cbWriting = findViewById(R.id.cbWriting);
//        cbOther = findViewById(R.id.cbOther);
//        tvGender = findViewById(R.id.tvGender);
//        tvHobbies = findViewById(R.id.tvHobbies);
        sProvince = findViewById(R.id.sProvince);
        btnOk = findViewById(R.id.btnOK);
        tvProvince = findViewById(R.id.tvProvince);

        //masukkan data provinsi kedalam spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.prov_array, android.R.layout.simple_spinner_item);
        //specify the layout to use when the list of choises appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //apply the adapter to the spinner
        sProvince.setAdapter(adapter);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get value from spinner
                String value = sProvince.getSelectedItem().toString();
                tvProvince.setText(value);




                // get value from radio button
//                int rbSelected = rgGender.getCheckedRadioButtonId();
//                RadioButton radioButton = (RadioButton) findViewById(rbSelected);
//                String valueGender = radioButton.getText().toString();

                //get value from checkboc
//                String writing = cbWriting.isChecked() ? "Menulis" : "";
//                String reading = cbReading.isChecked() ? "Membaca" : "";
//                String other = cbOther.isChecked() ? "Lainnya" : "";
//
//                StringBuilder stringBuilder = new StringBuilder();
//                if(!writing.isEmpty()){
//                    stringBuilder.append(writing);
//                }
//                if(!reading.isEmpty()){
//                    stringBuilder.append(", " + reading);
//                }
//                if(!other.isEmpty()){
//                    stringBuilder.append(", " + other);
//                }
//
//                tvGender.setText(valueGender);
//                tvHobbies.setText(stringBuilder.toString());
            }
        });
    }
}
