package kr.co.west_gang.nan_do_chak.view.plantime

import android.content.Intent
import android.os.Bundle
import android.widget.NumberPicker
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import kr.co.west_gang.nan_do_chak.R
import kr.co.west_gang.nan_do_chak.architecture.BaseActivity
import kr.co.west_gang.nan_do_chak.databinding.ActivityPlanTimeBinding
import kr.co.west_gang.nan_do_chak.util.AppConfig
import kr.co.west_gang.nan_do_chak.util.logD
import kr.co.west_gang.nan_do_chak.view.main.MainActivity

class PlanTimeActivity : BaseActivity() {
    private val binding by binding<ActivityPlanTimeBinding>(R.layout.activity_plan_time)
    private val viewModel: PlanTimeViewModel by viewModels()

    private val valueOfPlanTimePicker = arrayOf("오전", "오후")

    private fun NumberPicker.formatter() = this.setFormatter { i -> String.format("%02d", i) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        logD(AppConfig.TAG_DEBUG, "PlanTime Activity onCreate")

        observeLiveData()
        initNumberPicker()
    }

    private fun initNumberPicker(){
        binding.planTimeHoursPicker.minValue = 0
        binding.planTimeHoursPicker.maxValue = 12
        binding.planTimeMinutesPicker.minValue = 0
        binding.planTimeMinutesPicker.maxValue = 59
        binding.planTimeMeridiemPicker.minValue = 0
        binding.planTimeMeridiemPicker.maxValue = 1

        binding.planTimeHoursPicker.wrapSelectorWheel = false
        binding.planTimeMinutesPicker.wrapSelectorWheel = false
        binding.planTimeMeridiemPicker.wrapSelectorWheel = false

        binding.planTimeHoursPicker.descendantFocusability = NumberPicker.FOCUS_BLOCK_DESCENDANTS
        binding.planTimeMinutesPicker.descendantFocusability = NumberPicker.FOCUS_BLOCK_DESCENDANTS
        binding.planTimeMeridiemPicker.descendantFocusability = NumberPicker.FOCUS_BLOCK_DESCENDANTS

        binding.planTimeMeridiemPicker.displayedValues = valueOfPlanTimePicker
        binding.planTimeHoursPicker.formatter()
        binding.planTimeMinutesPicker.formatter()
    }

    private fun observeLiveData(){
        viewModel.buttonClickEvent.observe(this, Observer {
            gotoMain()
        })
    }

    private fun gotoMain(){
        startActivity(
            Intent(this, MainActivity::class.java)
        )
    }
}