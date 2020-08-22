package com.puguh.profilstarbhak.dataModel

data class DataSetGaleriModel(var gambar: String, var judul: String, var deskripsi: String)

object DataSetGaleri {
    val dataSet = listOf<DataSetGaleriModel>(
        DataSetGaleriModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/sekolah-idn-bogor.jpg",
            "SMK IDN",
            "Foto bersama keluarga idn"
        ),
        DataSetGaleriModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/galeri-sosial.jpg",
            "Bakti Sosial",
            "Santri melakukan bakti sosial dirumah warga"
        ),
        DataSetGaleriModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/al-quran-camp-idn-bogor-2.jpg",
            "Menghafal Quran",
            "Kegiatan Menghafal al-quran santri"
        ),
        DataSetGaleriModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/smp-smk-idn-berenang-1.jpg",
            "Berenang",
            "Kegiatan Extrakulikuler Berenang"
        ),
        DataSetGaleriModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/galeri-rikhlah3-1024x576.jpg",
            "Rihlah",
            "Kegiatan Rihlah(wisata) warga idn"
        ),
        DataSetGaleriModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/galeri-sosial2-1024x768.jpg",
            "Bansos",
            "Kegiatan Bansos di rumah warga sekitar"
        ),
        DataSetGaleriModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/IMG-20170721-WA0306-1024x768.jpg",
            "LDK",
            "Latihan Dasar Kepemimpinan"
        )
    )
}

