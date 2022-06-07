
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentexample.databinding.FragmentABinding

class AFragment : Fragment() {
    private lateinit var binding: FragmentABinding

    // layout을 inflate하는 단계로 뷰 바인딩 진행, UI에 대한 작업은 진행하지 않음
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentABinding.inflate(inflater, container, false)
        return binding.root
    }
}