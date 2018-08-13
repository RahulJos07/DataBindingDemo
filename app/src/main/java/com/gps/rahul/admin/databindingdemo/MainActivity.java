package com.gps.rahul.admin.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gps.rahul.admin.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainBinding;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set Content View
        mainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        //Create Object Of User
        user=new User();
        mainBinding.setUser(user);
        mainBinding.setHandler(this);
        /*mainBinding.btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainBinding.txtName.setText(user.getName());
                mainBinding.txtEmailId.setText(user.getEmail());
                //Toast.makeText(MainActivity.this, ""+user.getName(), Toast.LENGTH_SHORT).show();
            }
        });*/
    }
    public void onButtonClick(String name,String email){

        if(mainBinding.edtName.getText().toString().isEmpty()) {
            Toast.makeText(this, "Enter the Name", Toast.LENGTH_SHORT).show();
        }
        else if(mainBinding.edtEmailId.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Enter the Email Id", Toast.LENGTH_SHORT).show();
        }
        else {
            mainBinding.edtName.setText("");
            mainBinding.edtEmailId.setText("");

            mainBinding.txtName.setText(name);
            mainBinding.txtEmailId.setText(email);
        }
    }
}
