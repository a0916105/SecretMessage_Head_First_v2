package tw.idv.jew.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // 將這個fragment的layout充氣
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)

        val startButton = view.findViewById<Button>(R.id.start)

        startButton.setOnClickListener {
            view.findNavController()    //取得導覽控制器
                .navigate(R.id.action_welcomeFragment_to_messageFragment)   //巡覽至MessageFragment（使用action ID）
        }
        return view
    }
}