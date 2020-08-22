package com.puguh.profilstarbhak.dataModel

data class DataSetPrestasiRV(var judulItem: String, var listItem: List<DataSetPrestasiModel>)
object DataSetFragmentPrestasi {
    val dataSet = listOf<DataSetPrestasiRV>(
        DataSetPrestasiRV(
            "Nasional",
            DataSetPrestasi.dataSetInternasional
        ),
        DataSetPrestasiRV(
            "Regional",
            DataSetPrestasi.dataSetNasional
        )
    )
}