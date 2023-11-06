package com.example.gmail_recycle

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gmail_recycle.ui.theme.Gmail_RecycleTheme
import android.graphics.Color
import android.widget.RelativeLayout
import androidx.core.view.isVisible

val sender = listOf(
    "John Doe",
    "Alice Smith",
    "Robert Johnson",
    "Karen Williams",
    "Michael Brown",
    "Jennifer Jones",
    "William Davis",
    "Elizabeth Miller",
    "David Wilson",
    "Mary Moore",
    "Richard Taylor",
    "Patricia Anderson",
    "Charles Thomas",
    "Linda Jackson",
    "Joseph White",
    "Susan Harris",
    "Thomas Martin",
    "Margaret Thompson",
    "Christopher Garcia",
    "Dorothy Martinez"
)

val content = listOf(
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
    "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
    "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris.",
    "Nisi ut aliquip ex ea commodo consequat.",
    "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore.",
    "Eu fugiat nulla pariatur.",
    "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
    "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
    "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris.",
    "Nisi ut aliquip ex ea commodo consequat.",
    "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore.",
    "Eu fugiat nulla pariatur.",
    "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
    "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
    "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris.",
    "Nisi ut aliquip ex ea commodo consequat.",
    "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore.",
    "Eu fugiat nulla pariatur."
)

val time = listOf(
    "08:00",
    "08:30",
    "09:00",
    "09:30",
    "10:00",
    "10:30",
    "11:00",
    "11:30",
    "12:00",
    "12:30",
    "13:00",
    "13:30",
    "14:00",
    "14:30",
    "15:00",
    "15:30",
    "16:00",
    "16:30",
    "17:00",
    "17:30"
)


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv: RecyclerView = findViewById(R.id.rv)
        rv.layoutManager = LinearLayoutManager(this)

        rv.adapter = MyAdapter(sender, content, time)
    }

    fun onCircleClick(view: View) {
        view.isSelected = !view.isSelected
        val circle = view.findViewById<ImageView>(R.id.circle)
        val parent = view.parent as View
        val senderLetter = (parent as RelativeLayout).findViewById<TextView>(R.id.senderLetter)
        if (view.isSelected) {
            circle.setBackgroundResource(R.drawable.circle_selected_background)
            parent.setBackgroundResource(R.drawable.item_selected_background)
            senderLetter.visibility = View.INVISIBLE
        } else {
            circle.setBackgroundResource(R.drawable.circle_background)
            parent.setBackgroundResource(R.drawable.click_effect)
            senderLetter.visibility = View.VISIBLE
        }
    }
}

