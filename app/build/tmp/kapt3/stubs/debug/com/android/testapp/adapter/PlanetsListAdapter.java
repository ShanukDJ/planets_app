package com.android.testapp.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016J\"\u0010\u001d\u001a\u00020\u00162\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u001fJ\"\u0010 \u001a\u00020\u00162\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u001fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e\u00a8\u0006\""}, d2 = {"Lcom/android/testapp/adapter/PlanetsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/android/testapp/adapter/PlanetsListAdapter$MyViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "imagesListData", "Ljava/util/ArrayList;", "Lcom/android/testapp/network/ImagesListModel;", "getImagesListData", "()Ljava/util/ArrayList;", "setImagesListData", "(Ljava/util/ArrayList;)V", "planetsListData", "Lcom/android/testapp/network/PlanetInfo;", "getPlanetsListData", "setPlanetsListData", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setupUpdatedData", "items", "Lkotlin/collections/ArrayList;", "setupUpdatedDataForImages", "MyViewHolder", "app_debug"})
public final class PlanetsListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.android.testapp.adapter.PlanetsListAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.android.testapp.network.PlanetInfo> planetsListData;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.android.testapp.network.ImagesListModel> imagesListData;
    @org.jetbrains.annotations.Nullable()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.android.testapp.network.PlanetInfo> getPlanetsListData() {
        return null;
    }
    
    public final void setPlanetsListData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.android.testapp.network.PlanetInfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.android.testapp.network.ImagesListModel> getImagesListData() {
        return null;
    }
    
    public final void setImagesListData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.android.testapp.network.ImagesListModel> p0) {
    }
    
    public final void setupUpdatedData(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.android.testapp.network.PlanetInfo> items) {
    }
    
    public final void setupUpdatedDataForImages(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.android.testapp.network.ImagesListModel> items) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.android.testapp.adapter.PlanetsListAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.android.testapp.adapter.PlanetsListAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getContext() {
        return null;
    }
    
    public PlanetsListAdapter(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u0019\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n \t*\u0004\u0018\u00010\b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lcom/android/testapp/adapter/PlanetsListAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/view/View;Landroid/content/Context;)V", "climate", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getClimate", "()Landroid/widget/TextView;", "getContext", "()Landroid/content/Context;", "imageThumb", "Landroid/widget/ImageView;", "getImageThumb", "()Landroid/widget/ImageView;", "planetName", "getPlanetName", "bind", "", "data", "Lcom/android/testapp/network/PlanetInfo;", "imageData", "Lcom/android/testapp/network/ImagesListModel;", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView imageThumb = null;
        private final android.widget.TextView planetName = null;
        private final android.widget.TextView climate = null;
        @org.jetbrains.annotations.Nullable()
        private final android.content.Context context = null;
        
        public final android.widget.ImageView getImageThumb() {
            return null;
        }
        
        public final android.widget.TextView getPlanetName() {
            return null;
        }
        
        public final android.widget.TextView getClimate() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.android.testapp.network.PlanetInfo data, @org.jetbrains.annotations.NotNull()
        com.android.testapp.network.ImagesListModel imageData) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.content.Context getContext() {
            return null;
        }
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.Nullable()
        android.content.Context context) {
            super(null);
        }
    }
}