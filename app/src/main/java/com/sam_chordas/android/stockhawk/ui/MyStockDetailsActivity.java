package com.sam_chordas.android.stockhawk.ui;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.sam_chordas.android.stockhawk.R;
import com.sam_chordas.android.stockhawk.data.QuoteColumns;
import com.sam_chordas.android.stockhawk.data.QuoteProvider;

public class MyStockDetailsActivity extends AppCompatActivity {

//    LastTradePriceOnly  //price
//LastTradeDate //date

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_stock_details);


        Cursor data = getContentResolver().query(QuoteProvider.Quotes.CONTENT_URI,
                new String[]{ QuoteColumns._ID, QuoteColumns.SYMBOL, QuoteColumns.BIDPRICE,
                        QuoteColumns.PERCENT_CHANGE, QuoteColumns.CHANGE, QuoteColumns.ISUP,
                        QuoteColumns.TIME, QuoteColumns.VALUE}, null,
                null , null);

        int count = data.getCount();
        int dateColumn = data.getColumnIndex(QuoteColumns.VALUE);
        int dateColumn2 = data.getColumnIndex(QuoteColumns.TIME);
        for ( int i = 0; i < count; i++ ) {
            data.moveToPosition(i);
            String str1 = data.getString(dateColumn);
            String str2 = data.getString(dateColumn2);
            Log.e("STR_STOCKS_VALUE", str1);
            Log.e("STR_STOCKS_VALUE_DATE", str2);
        }
    }
}
