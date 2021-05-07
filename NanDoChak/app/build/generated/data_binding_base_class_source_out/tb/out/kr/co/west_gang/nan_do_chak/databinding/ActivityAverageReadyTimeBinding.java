// Generated by data binding compiler. Do not edit!
package kr.co.west_gang.nan_do_chak.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import kr.co.west_gang.nan_do_chak.R;
import kr.co.west_gang.nan_do_chak.view.averagereadytime.AverageReadyTimeViewModel;

public abstract class ActivityAverageReadyTimeBinding extends ViewDataBinding {
  @NonNull
  public final Button averageReadyTimeButton;

  @NonNull
  public final NumberPicker averageReadyTimeHoursPicker;

  @NonNull
  public final TextView averageReadyTimeHoursText;

  @NonNull
  public final NumberPicker averageReadyTimeMinutesPicker;

  @NonNull
  public final TextView averageReadyTimeMinutesText;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView textView;

  @Bindable
  protected AverageReadyTimeViewModel mViewModel;

  protected ActivityAverageReadyTimeBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button averageReadyTimeButton, NumberPicker averageReadyTimeHoursPicker,
      TextView averageReadyTimeHoursText, NumberPicker averageReadyTimeMinutesPicker,
      TextView averageReadyTimeMinutesText, ImageView imageView, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.averageReadyTimeButton = averageReadyTimeButton;
    this.averageReadyTimeHoursPicker = averageReadyTimeHoursPicker;
    this.averageReadyTimeHoursText = averageReadyTimeHoursText;
    this.averageReadyTimeMinutesPicker = averageReadyTimeMinutesPicker;
    this.averageReadyTimeMinutesText = averageReadyTimeMinutesText;
    this.imageView = imageView;
    this.textView = textView;
  }

  public abstract void setViewModel(@Nullable AverageReadyTimeViewModel viewModel);

  @Nullable
  public AverageReadyTimeViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityAverageReadyTimeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_average_ready_time, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAverageReadyTimeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityAverageReadyTimeBinding>inflateInternal(inflater, R.layout.activity_average_ready_time, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAverageReadyTimeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_average_ready_time, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAverageReadyTimeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityAverageReadyTimeBinding>inflateInternal(inflater, R.layout.activity_average_ready_time, null, false, component);
  }

  public static ActivityAverageReadyTimeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityAverageReadyTimeBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityAverageReadyTimeBinding)bind(component, view, R.layout.activity_average_ready_time);
  }
}
