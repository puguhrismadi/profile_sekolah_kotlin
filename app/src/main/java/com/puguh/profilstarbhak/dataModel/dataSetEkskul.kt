package com.puguh.profilstarbhak.dataModel

data class DataSetEkskulModel(var gambar: String, var judul: String, var deskripsi: String)

object DataSetEkskul {
    val dataSet = listOf<DataSetEkskulModel>(
        DataSetEkskulModel(
            "https://scontent.fdps2-1.fna.fbcdn.net/v/t1.0-9/104332453_2919511128174979_1660291062872253741_o.jpg?_nc_cat=104&_nc_sid=730e14&_nc_eui2=AeFMGUVmukRE7wzKWoCEUJYRgUcVi0eXnmaBRxWLR5eeZkIekdgK9mauNguAiDoUkhs&_nc_ohc=4AASD6OJNXoAX-gCT0X&_nc_ht=scontent.fdps2-1.fna&oh=6fde1a6ee7195c03b9dd6063d3631155&oe=5F647899",
            "Robotik",
            "Kegiatan Lomba Robotik"
        ),
        DataSetEkskulModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/smp-smk-idn-berkuda-1.jpg",
            "Berkuda",
            "Kegiatan Ekstrakurikuler Berkuda"
        ),
        DataSetEkskulModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/smp-smk-idn-panahan-e1506074957761.jpg",
            "Memanah",
            "Kegiatan Ekstrakurikuler Memanah"
        ),
        DataSetEkskulModel(
            "https://lh3.googleusercontent.com/proxy/m6i-PQlfbo3o9KjHWXrqtcmN0_VGejKaZsfiOevImOLHKqCma7D-mj3vXJZuxLfaX0x0t9vypNc7fxJxotgZqOGk34A0sROtaOv5K7A3sWZdhV9xvGtBBFqaO0-shQ",
            "Futsal",
            "Kegiatan Ekstrakurikuler Futsal"
        )
    )
}

