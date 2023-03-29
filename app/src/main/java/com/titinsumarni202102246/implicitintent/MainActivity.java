package com.titinsumarni202102246.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tampilTelepon(View view) {
        Intent teleponIntent = new Intent(Intent.ACTION_DIAL);
        startActivity(teleponIntent);
    }

    public void tampilSms(View view) {
        Intent smsIntent = new Intent(Intent.ACTION_MAIN);
        smsIntent.addCategory(Intent.CATEGORY_APP_MESSAGING);
        startActivity(smsIntent);
    }

    public void tampilKalender(View view) {
        Intent kalenderIntent = new Intent(Intent.ACTION_MAIN);
        kalenderIntent.addCategory(Intent.CATEGORY_APP_CALENDAR);
        startActivity(kalenderIntent);
    }

    public void tampilBrowser(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_MAIN);
        browserIntent.addCategory(Intent.CATEGORY_APP_BROWSER);
        startActivity(browserIntent);
    }

    public void tampilKalkulator(View view) {
        try {
            Intent kalkulatorIntent = new Intent(Intent.ACTION_MAIN);
            kalkulatorIntent.addCategory(Intent.CATEGORY_LAUNCHER);

            ComponentName cn = new ComponentName ( "com.miui.calculator", "com.miui.calculator.cal.CalculatorActivity" );
            kalkulatorIntent.setComponent(cn);
            kalkulatorIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(kalkulatorIntent);
        }
        catch (ActivityNotFoundException anfe)
        {
            Toast.makeText(getApplicationContext(),  "Aplikasi Kalkulator tidak ditemukan", Toast.LENGTH_LONG).show();
        }
    }

    public void tampilDrive(View view) {
        try {
            Intent driveIntent = new Intent(Intent.ACTION_MAIN);
            driveIntent.addCategory(Intent.CATEGORY_LAUNCHER);

            ComponentName dr = new ComponentName ( "com.google.android.apps.docs", "com.google.android.apps.docs.app.NewMainProxyActivity" );
            driveIntent.setComponent(dr);
            driveIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(driveIntent);
        }
        catch (ActivityNotFoundException anfe)
        {
            Toast.makeText(getApplicationContext(),  "Aplikasi GoogleDrive tidak ditemukan", Toast.LENGTH_LONG).show();
        }
    }

    public void tampilKontak(View view) {
        Intent kontakIntent = new Intent(Intent.ACTION_MAIN);
        kontakIntent.addCategory(Intent.CATEGORY_APP_CONTACTS);
        startActivity(kontakIntent);
    }

    public void tampilGaleri(View view) {
        Intent galeriIntent = new Intent(Intent.ACTION_MAIN);
        galeriIntent.addCategory(Intent.CATEGORY_APP_GALLERY);
        startActivity(galeriIntent);
    }

    public void tampilWifi(View view) {
        Intent wifiIntent = new Intent(Settings.ACTION_WIFI_SETTINGS);
        startActivity(wifiIntent);
    }

    public void tampilSound(View view) {
        Intent soundIntent = new Intent(Settings.ACTION_SOUND_SETTINGS);
        startActivity(soundIntent);
    }

    public void tampilAirplane(View view) {
        Intent airplaneIntent = new Intent(Settings.ACTION_AIRPLANE_MODE_SETTINGS);
        startActivity(airplaneIntent);
    }

    public void tampilAplikasi(View view) {
        Intent aplikasiIntent = new Intent(Settings.ACTION_APPLICATION_SETTINGS);
        startActivity(aplikasiIntent);
    }

    public void tampilBluetooth(View view) {
        Intent bluetoothIntent = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
        startActivity(bluetoothIntent);
    }
}