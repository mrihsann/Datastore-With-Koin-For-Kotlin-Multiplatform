package com.ihsanarslan.datastorekoforkotlinmultiplatform

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.ihsanarslan.datastorekoforkotlinmultiplatform.data.local.DATA_STORE_FILE_NAME
import com.ihsanarslan.datastorekoforkotlinmultiplatform.data.local.createDataStore

fun createDataStore(context: Context): DataStore<Preferences> {
    return createDataStore {
        context.filesDir.resolve(DATA_STORE_FILE_NAME).absolutePath
    }
}