package com.android.testapp.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/android/testapp/network/RetroService;", "", "getImagesListFromApi", "Ljava/util/ArrayList;", "Lcom/android/testapp/network/ImagesListModel;", "Lkotlin/collections/ArrayList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlanetsListFromApi", "Lcom/android/testapp/network/PlanetsListModel;", "app_debug"})
public abstract interface RetroService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "planets")
    public abstract java.lang.Object getPlanetsListFromApi(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.android.testapp.network.PlanetsListModel> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v2/list?page=1&limit=10")
    public abstract java.lang.Object getImagesListFromApi(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.android.testapp.network.ImagesListModel>> p0);
}