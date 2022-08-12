/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kantinbusri;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author andrien
 */
public class Utils {
    public static String formatHarga(int value) {
        Locale idLocale = new Locale("id", "ID");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(idLocale);
        
        return formatter.format(value);
    }
    
}
