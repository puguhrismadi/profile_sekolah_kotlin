package com.puguh.profilstarbhak.dataModel


data class DataSetPrestasiModel(var urlGambar: String, var judulGambar: String)
object DataSetPrestasi {
    val dataSetNasional = listOf<DataSetPrestasiModel>(
        DataSetPrestasiModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/IMG_0975-1024x768.jpg",
            "Juara 2 Lomba Islamic Apps Tingkat Nasional – Universities Darussalam Gontor"
        ),
        DataSetPrestasiModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/IMG_1015-1024x768.jpg",
            "Juara 2 Lomba Islamic Apps Tingkat Nasional – Universities Darussalam Gontor"
        ),
        DataSetPrestasiModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/IMG_0235-1024x768.jpg",
            "Training Inhouse Android di Badan Tenaga Nuklir Nasional (BATAN) – Serpong"
        )
    )

    val dataSetInternasional = listOf<DataSetPrestasiModel>(
        DataSetPrestasiModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/Snapseed1-1024x768.jpg",
            "Study Banding Singapore – Malaysia"
        ),
        DataSetPrestasiModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/mikrotik-mum-2019-kamboja-smk-idn-1-1.jpg",
            "Menjadi salah satu Pembicara Internasional MikroTik User Meeting / MUM 2019 di Kamboja"
        ),
        DataSetPrestasiModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/IMG_20160228_151248-1024x759.jpg",
            "Juara 2 Lomba di Universitas Dian Nuswantoro – Semarang"
        ),
        DataSetPrestasiModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/IMG_20160221_122344-1024x759.jpg",
            "Finalis Lomba Remaja Berkarya Tingkat Nasional – Telkom University Bandung"
        )
    )
}



