package com.techcareer.vatandesign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.techcareer.vatandesign.adapter.ViewPagerAdapter
import com.techcareer.vatandesign.databinding.ActivityMainBinding
import com.techcareer.vatandesign.model.Product

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)


        val productList = ArrayList<Product>()

        val i1 = Product(1, "SM-A325FZKHTUR", "item1", "Samsung Galaxy A32 128 Gb Akıllı Telefon Siyah", 4.999)
        val i2 = Product(
            2,
            "MBD15/I511/8/256",
            "item2",
            "Huawei Matebook D15 11.Nesil Core i5 1135G7-8Gb-256Gb Ssd-15.6inc-W11",
            9.999
        )
        val i3 = Product(
            3,
            "50PUS7906",
            "item3",
            "PHILIPS 50PUS7906 50inc 126 cm 4K UHD Android TV,3 Taraflı Ambilight,Uydu Alıcı",
            8.999
        )
        val i4 = Product(
            4, "X900-G", "item4", "Samsung Galaxy Tab S8 Ultra 12Gb 256Gb 14.6''Android Tablet SM-X900NZAETUR", 17.999
        )
        val i5 = Product(5, "C25Y_METAL GRİSİ", "item5", "Realme C25Y (4GB+128GB) Metal Grisi", 3.799)
        val i6 = Product(
            6, "5301ABDS", "item6", "Honor MagicBook X14 10.Nesil Core i5 10210U-8Gb-512Gb Ssd-14inc-W10", 8.299
        )
        val i7 = Product(
            7, "QE50QN90AATXTK", "item7", "SAMSUNG QE 50QN90A 50inc 125 cm 4K UHD Smart QLED TV,Uydu Alıcılı", 17.999
        )
        val i8 = Product(
            8, "LTC10Z480GG8", "item8", "Kioxia 480GB Exceria Serisi Sata 3.0 SSD (555MB Okuma / 540MB Yazma)", 812.0
        )

        productList.addAll(listOf(i1, i2, i3, i4, i5, i6, i7, i8))

        val adapter = ViewPagerAdapter(this, productList)
        binding.rv.adapter = adapter

    }

}