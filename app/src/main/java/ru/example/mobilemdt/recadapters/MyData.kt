package ru.example.mobilemdt.recadapters

import ru.example.mobilemdt.R

data class feel(val image:Int, val name_feel:String)
class MyFeel{val list = arrayListOf(feel(R.drawable.calm_img, "Спокойным"),
    feel(R.drawable.relax_img, "Расслабленным"),
    feel(R.drawable.focus_img, "Сосредоточенным"),
    feel(R.drawable.anxious_img, "Взволнованным")
)
}
data class state (val title:String, val text_state:String, val image_state: Int)
class MyState
{
    val state_list = arrayListOf(state("Заголовок статьи", "Краткое описание блока с двумя строчками", R.drawable.state_image_1),
        state("Загаловок блока", "Краткое описание", R.drawable.state_image_2))
}
data class login(val id:String,val email:String, val nickName:String,val avatar: String, val token:String)
data class feelings(val success: Boolean, val data: ArrayList<data_feelings>)
data class data_feelings(val id:Int, val title: String, val image:String, val position: Int)
data class quotes(val success: Boolean, val data: ArrayList<data_quotes>)
data class data_quotes(val id: Int,val title: String, val image: String, val description: String)
