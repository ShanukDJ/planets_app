package com.android.testapp.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004J\u0006\u0010\f\u001a\u00020\rR&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/android/testapp/viewmodel/ImagesViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "imageLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/android/testapp/network/ImagesListModel;", "getImageLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setImageLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "getImageObserver", "makeApiCallForImages", "", "app_debug"})
public final class ImagesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.android.testapp.network.ImagesListModel>> imageLiveData;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.android.testapp.network.ImagesListModel>> getImageLiveData() {
        return null;
    }
    
    public final void setImageLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.android.testapp.network.ImagesListModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.android.testapp.network.ImagesListModel>> getImageObserver() {
        return null;
    }
    
    public final void makeApiCallForImages() {
    }
    
    public ImagesViewModel() {
        super();
    }
}