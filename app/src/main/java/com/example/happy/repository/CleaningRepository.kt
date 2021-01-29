package com.example.happy.repository

import android.app.Application
import com.example.happy.database.AppDatabase
import com.example.happy.model.BillItem
import com.example.happy.model.Cleaning

class CleaningRepository(application: Application) {

    private val cleaningDao = AppDatabase.getDatabase(application).cleaningDao()

    fun loadShoppingsByRepId(repId: String) = cleaningDao.loadCleaningByRep(repId)

    fun updateLastCleaning(cleaning: Cleaning) = cleaningDao.updateLastCleaned(cleaning)

    fun insert(cleaning: Cleaning) = cleaningDao.insert(cleaning)

    fun update(cleaning: Cleaning) = cleaningDao.update(cleaning)

    fun delete(cleaning: Cleaning) = cleaningDao.delete(cleaning)
}