package com.schneewittchen.rosandroid.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.schneewittchen.rosandroid.domain.RosDomain;
import com.schneewittchen.rosandroid.widgets.base.BaseEntity;
import com.schneewittchen.rosandroid.widgets.base.BaseData;
import com.schneewittchen.rosandroid.widgets.test.BaseWidget;

import java.util.List;


/**
 * TODO: Description
 *
 * @author Nico Studt
 * @version 1.0.2
 * @created on 10.01.20
 * @updated on 21.04.20
 * @modified by Nils Rottmann
 */
public class VizViewModel extends AndroidViewModel {

    private static final String TAG = VizViewModel.class.getSimpleName();

    private RosDomain rosDomain;


    public VizViewModel(@NonNull Application application) {
        super(application);

        rosDomain = RosDomain.getInstance(application);
    }


    public LiveData<List<BaseWidget>> getCurrentWidgets() {
        return rosDomain.getCurrentWidgets();
    }

    public LiveData<BaseData> getData() {return this.rosDomain.getData();}


    public void informWidgetDataChange(BaseData data) {
        rosDomain.informWidgetDataChange(data);
    }
}
