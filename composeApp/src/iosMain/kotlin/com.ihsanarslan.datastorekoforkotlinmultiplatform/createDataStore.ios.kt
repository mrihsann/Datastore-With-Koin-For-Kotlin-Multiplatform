package com.ihsanarslan.datastorekoforkotlinmultiplatform

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.ihsanarslan.datastorekoforkotlinmultiplatform.data.local.DATA_STORE_FILE_NAME
import com.ihsanarslan.datastorekoforkotlinmultiplatform.data.local.createDataStore
import kotlinx.cinterop.ExperimentalForeignApi
import platform.Foundation.NSDocumentDirectory
import platform.Foundation.NSFileManager
import platform.Foundation.NSUserDomainMask
import kotlin.plus

@OptIn(ExperimentalForeignApi::class)
fun createDataStore(): DataStore<Preferences> {
    return createDataStore {
        val documentDirectory = NSFileManager.defaultManager.URLForDirectory(
            directory = NSDocumentDirectory,
            inDomain = NSUserDomainMask,
            appropriateForURL = null,
            create = false,
            error = null,
        )
        requireNotNull(documentDirectory).path + "/$DATA_STORE_FILE_NAME"
    }
}