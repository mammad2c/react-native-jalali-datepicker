
package com.reactlibrary;

import android.graphics.Color;
import android.widget.Toast;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import ir.hamsaa.persiandatepicker.PersianDatePickerDialog;


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
      picker = new PersianDatePickerDialog(this)
              .setPositiveButtonString("باشه")
              .setNegativeButton("بیخیال")
              .setTodayButton("امروز")
              .setTodayButtonVisible(true)
              .setInitDate(initDate)
              .setMaxYear(PersianDatePickerDialog.THIS_YEAR)
              .setMinYear(1300)
              .setActionTextColor(Color.GRAY)
              .setTypeFace(typeface)
              .setListener(new Listener() {
                @Override
                public void onDateSelected(PersianCalendar persianCalendar) {
                  Toast.makeText(context, persianCalendar.getPersianYear() + "/" + persianCalendar.getPersianMonth() + "/" + persianCalendar.getPersianDay(), Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onDismissed() {

                }
              });

      picker.show();

    }
}