package kr.co.west_gang.nan_do_chak.view.averagereadytime

import android.content.Intent
import android.os.Bundle
import android.widget.NumberPicker
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import kr.co.west_gang.nan_do_chak.R
import kr.co.west_gang.nan_do_chak.architecture.BaseActivity
import kr.co.west_gang.nan_do_chak.databinding.ActivityAverageReadyTimeBinding
import kr.co.west_gang.nan_do_chak.util.AppConfig
import kr.co.west_gang.nan_do_chak.util.logD
import kr.co.west_gang.nan_do_chak.view.earlyarrivedtime.EarlyArrivedTimeActivity

class AverageReadyTimeActivity: BaseActivity() {

    private val binding by binding<ActivityAverageReadyTimeBinding>(R.layout.activity_average_ready_time)
    private val viewModel: AverageReadyTimeViewModel by viewModels()

    private var averageReadyTimeHours = 0
    private var averageReadyTimeMinutes = 0

    private fun NumberPicker.formatter() = this.setFormatter { i -> String.format("%02d", i) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        logD(AppConfig.TAG_DEBUG, "AverageReadyTime Activity onCreate")

        initNumberPicker()
        observeLiveData()
    }

    private fun initNumberPicker(){
        binding.averageReadyTimeHoursPicker.minValue = 0
        binding.averageReadyTimeHoursPicker.maxValue = 12
        binding.averageReadyTimeMinutesPicker.minValue = 0
        binding.averageReadyTimeMinutesPicker.maxValue = 59

        binding.averageReadyTimeHoursPicker.wrapSelectorWheel = false
        binding.averageReadyTimeMinutesPicker.wrapSelectorWheel = false

        binding.averageReadyTimeHoursPicker.descendantFocusability = NumberPicker.FOCUS_BLOCK_DESCENDANTS
        binding.averageReadyTimeMinutesPicker.descendantFocusability = NumberPicker.FOCUS_BLOCK_DESCENDANTS

        binding.averageReadyTimeMinutesPicker.formatter()
        binding.averageReadyTimeHoursPicker.formatter()
    }

    private fun getTimeFromPicker(){
        averageReadyTimeHours = binding.averageReadyTimeHoursPicker.value
        averageReadyTimeMinutes = binding.averageReadyTimeMinutesPicker.value

        logD(AppConfig.TAG_DEBUG, "hours: $averageReadyTimeHours / minutes: $averageReadyTimeMinutes")
    }

    private fun observeLiveData(){
        viewModel.buttonClickEvent.observe(this, Observer {
            getTimeFromPicker()
            gotoEarlyArrivedTime()
        })
    }

    private fun gotoEarlyArrivedTime(){
        startActivity(
            Intent(this, EarlyArrivedTimeActivity::class.java)
        )
    }
}