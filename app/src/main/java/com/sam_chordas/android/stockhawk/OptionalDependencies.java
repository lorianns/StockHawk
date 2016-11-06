package com.sam_chordas.android.stockhawk;

import android.content.Context;

import com.facebook.stetho.Stetho;

/**
 * Created by lorianns on 7/11/16.
 */
public class OptionalDependencies {

        private Context context;

        public OptionalDependencies(Context context) {
            this.context = context;
        }

        public void initialize() {
            Stetho.initializeWithDefaults(context);
        }

}
