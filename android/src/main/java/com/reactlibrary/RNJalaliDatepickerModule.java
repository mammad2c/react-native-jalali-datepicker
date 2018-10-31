
package com.reactlibrary;

import android.graphics.Color;
import android.widget.Toast;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Date;

import ir.hamsaa.persiandatepicker.Listener;
import ir.hamsaa.persiandatepicker.PersianDatePickerDialog;
import ir.hamsaa.persiandatepicker.util.PersianCalendar;


public class RNJalaliDatepickerModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNJalaliDatepickerModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNJalaliDatepicker";
  }


    @ReactMethod
    public void show(String message, int duration) {
        PersianCalendar initDate = new PersianCalendar();
        initDate.setPersianDate(1370, 3, 13);
        PersianDatePickerDialog  picker = new PersianDatePickerDialog(getReactApplicationContext())
              .setPositiveButtonString("باشه")
              .setNegativeButton("بیخیال")
              .setTodayButton("امروز")
              .setTodayButtonVisible(true)
              .setInitDate(initDate)
              .setMaxYear(PersianDatePickerDialog.THIS_YEAR)
              .setMinYear(1300)
              .setActionTextColor(Color.GRAY)
              .setListener(new Listener() {
                @Override
                public void onDateSelected(PersianCalendar persianCalendar) {
                  Toast.makeText(getReactApplicationContext(), persianCalendar.getPersianYear() + "/" + persianCalendar.getPersianMonth() + "/" + persianCalendar.getPersianDay(), Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onDismissed() {

                }
              });

      picker.show();

    }
}