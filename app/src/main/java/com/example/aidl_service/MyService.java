package com.example.aidl_service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import SeparatePackage.aidlInterface;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return stubObject;
    }

    aidlInterface.Stub stubObject = new aidlInterface.Stub() {
        @Override
        public int calculateData(int firstValue, int secondValue, int operationToPerform) throws RemoteException {
            return 100;
        }
    };
}