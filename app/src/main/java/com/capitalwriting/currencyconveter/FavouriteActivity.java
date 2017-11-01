package com.capitalwriting.currencyconveter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class FavouriteActivity extends AppCompatActivity {
    DatabaseHelper myDb;
    private CheckBox BITC,USDL,ZCAS,BTGO,ETHE,KOMD,EURO,DTC,NEO1,LTC1,Monero,FATC,RUBY,RIP,CIVC,BYT,VX,ZCOIN,BLC,KESH;
    private String Name = "" ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);

        myDb= new DatabaseHelper(this);



        BITC = findViewById(R.id.checkBTC);
        BITC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (BITC.isChecked()) {
                    Name = "BTC";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();



                }
                else {
                    Name = null;
                }

            }
        });
        USDL = findViewById(R.id.checkUSD);
        USDL.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (USDL.isChecked()) {

                    Name = "USD";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();
                }
                else {
                    Name = null;

                }

            }
        });
        ZCAS = findViewById(R.id.checkZcash);
        ZCAS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (ZCAS.isChecked()) {
                    Name = "NGN";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();

                }
                else {
                    Name = null;

                }

            }
        });
        ZCOIN = findViewById(R.id.checkZCoin);
        ZCOIN.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (ZCOIN.isChecked()) {
                    Name = "XZC";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();


                }
                else {
                    Name = null;
                }

            }
        });
        BTGO = findViewById(R.id.checkBTG);
        BTGO.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (BTGO.isChecked()) {
                    Name = "BTG";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();


                }
                else {
                    Name = null;

                }

            }
        });
        ETHE =findViewById(R.id.checkEth);
        ETHE.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (ETHE.isChecked()) {

                    Name = "ETH";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();
                }
                else {
                    Name = null;

                }

            }
        });
        KOMD = findViewById(R.id.checkKMD);
        KOMD.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (KOMD.isChecked()) {
                    Name = "KMD";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();

                }
                else {
                    Name = null;

                }

            }
        });
        EURO = findViewById(R.id.checkEUR);
        EURO.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (EURO.isChecked()) {

                    Name = "EUR";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();
                }
                else {
                    Name = null;

                }

            }
        });
        DTC = findViewById(R.id.checkDTC);
        DTC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (DTC.isChecked()) {
                    Name = "DASH";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();

                }
                else {
                    Name = null;

                }

            }
        });
        NEO1 = findViewById(R.id.checkNEO);
        NEO1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (NEO1.isChecked()) {

                    Name = "NEO";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();
                }
                else {
                    Name = null;

                }

            }
        });
        LTC1 = findViewById(R.id.checkLTC);
        LTC1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (LTC1.isChecked()) {

                    Name = "LTC";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();
                }
                else {

                    Name = null;

                }

            }
        });
        Monero = findViewById(R.id.checkMonero);
        Monero.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (Monero.isChecked()) {
                    Name = "MCO";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();

                }
                else {
                    Name = null;

                }

            }
        });
        FATC = findViewById(R.id.checkFTC);
        FATC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (FATC.isChecked()) {
                    Name = "FTC";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();

                }
                else {
                    Name = null;

                }

            }
        });
        RUBY = findViewById(R.id.checkRBY);
        RUBY.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (RUBY.isChecked()) {
                    Name = "RBY";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();

                }
                else {
                    Name = null;

                }

            }
        });
        RIP = findViewById(R.id.checkRIP);
        RIP.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (RIP.isChecked()) {
                    Name = "XRP";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();

                }
                else {
                    Name = null;

                }

            }
        });
        CIVC = findViewById(R.id.checkCVC);
        CIVC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (CIVC.isChecked()) {
                    Name = "CVC";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();

                }
                else {
                    Name = null;

                }

            }
        });
        BYT = findViewById(R.id.checkBYT);
        BYT.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (BYT.isChecked()) {
                    Name = "BCN";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();
                }
                else {
                    Name = null;

                }

            }
        });
        VX = findViewById(R.id.checkVX);
        VX.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (VX.isChecked()) {
                    Name = "VOX";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();

                }
                else {
                    Name = null;

                }

            }
        });

        BLC = findViewById(R.id.checkBLC);
        BLC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (BLC.isChecked()) {
                    Name = "BLK";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();
                }
                else {
                    Name = null;

                }

            }
        });
        KESH = findViewById(R.id.checkOmisego);
        KESH.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (KESH.isChecked()) {
                    Name = "KES";
                    boolean isInserted = myDb.insertData(Name );
                    if(isInserted == true)
                        Toast.makeText(FavouriteActivity.this,"Added to Favourite", Toast.LENGTH_LONG).show();

                }
                else {
                    Name = null;

                }

            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

            getMenuInflater().inflate(R.menu.select, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.check) {

            Intent homeIntent  = new Intent(FavouriteActivity.this,MainActivity.class);
            startActivity(homeIntent);




            return true;
        }



        return super.onOptionsItemSelected(item);
    }


}
