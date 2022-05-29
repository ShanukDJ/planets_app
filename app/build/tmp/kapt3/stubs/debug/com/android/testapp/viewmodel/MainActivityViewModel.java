package com.android.testapp.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0006\u0010\u000b\u001a\u00020\fR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/android/testapp/viewmodel/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "planetsLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/android/testapp/network/PlanetsListModel;", "getPlanetsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setPlanetsLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "getPlanetsListObserver", "makeApiCall", "", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.android.testapp.network.PlanetsListModel> planetsLiveData;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.android.testapp.network.PlanetsListModel> getPlanetsLiveData() {
        return null;
    }
    
    public final void setPlanetsLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.android.testapp.network.PlanetsListModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.android.testapp.network.PlanetsListModel> getPlanetsListObserver() {
        return null;
    }
    
    public final void makeApiCall() {
    }
    
    public MainActivityViewModel() {
        super();
    }
}