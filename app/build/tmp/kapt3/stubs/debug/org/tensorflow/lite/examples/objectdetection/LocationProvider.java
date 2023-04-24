package org.tensorflow.lite.examples.objectdetection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000e\u001a\u00020\u0007H\u0007J\u0006\u0010\u000f\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/LocationProvider;", "", "context", "Landroid/content/Context;", "locationUpdateListener", "Lkotlin/Function1;", "Landroid/location/Location;", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "locationListener", "Landroid/location/LocationListener;", "locationManager", "Landroid/location/LocationManager;", "getLastKnownLocation", "startLocationUpdates", "stopLocationUpdates", "app_debug"})
public final class LocationProvider {
    private final android.content.Context context = null;
    private final kotlin.jvm.functions.Function1<android.location.Location, kotlin.Unit> locationUpdateListener = null;
    private final android.location.LocationManager locationManager = null;
    private final android.location.LocationListener locationListener = null;
    
    public LocationProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.location.Location, kotlin.Unit> locationUpdateListener) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void startLocationUpdates() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location getLastKnownLocation() {
        return null;
    }
    
    public final void stopLocationUpdates() {
    }
}