package github.sachin2dehury.nitrmail.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.AndroidEntryPoint
import github.sachin2dehury.nitrmail.R
import github.sachin2dehury.nitrmail.databinding.FragmentMailItemBinding
import github.sachin2dehury.nitrmail.ui.viewmodels.MailItemViewModel

@AndroidEntryPoint
class MailItemFragment : Fragment(R.layout.fragment_mail_item) {

    lateinit var mailItemViewModel: MailItemViewModel

    private var _binding: FragmentMailItemBinding? = null
    private val binding: FragmentMailItemBinding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentMailItemBinding.bind(view)

        mailItemViewModel = ViewModelProvider(requireActivity()).get(MailItemViewModel::class.java)

        subscribeToObservers()
    }

    private fun subscribeToObservers() {
//        mailItemViewModel.item.observe(viewLifecycleOwner) { result ->
//            result?.let {
//                binding.apply {
//                    progressBarMail.isVisible = false
//                    mailItemViewModel.item.value?.let { mail ->
//                        textViewDate.text = mail.date.toString()
//                        textViewSender.text = mail.from?.email
//                        textViewMailSubject.text = mail.subject
//                        webView.apply {
//                            settings.loadsImagesAutomatically = true
//                            loadData("${mail.bodyHtml} ${mail.bodyHtml}", "text/html", "UTF-8")
//                        }
////                        textViewMailBody.text = mail.bodyText
//                    }
//                }
//            }
//        }
    }
}