package com.example.codelandtask.di

import android.content.Context
import com.example.codelandtask.utils.SharedPreferencesUtil
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideSharedPreferenceUtil(@ApplicationContext context: Context):SharedPreferencesUtil{
        return SharedPreferencesUtil(context)
    }
}