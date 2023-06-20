package com.example.starbucks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.starbucks.adapters.MainAdapter;
import com.example.starbucks.databinding.ActivityFoodBinding;
import com.example.starbucks.models.MainModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class food_activity extends AppCompatActivity {
    ActivityFoodBinding binding;
    FloatingActionButton plus,call,rating,cart;
    RelativeLayout screen;
    Boolean isAllFabsVisible;

    //int cid

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar();
        isAllFabsVisible = true;

        binding = ActivityFoodBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int cid = bundle.getInt("Cid");
         Log.d("FOOD","FOOD CID IS "+cid);

         // Briding of raw data to user interface is
        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(R.drawable.vegthali,"Paket Begibung","200","Makanan khas yang berasal dari Lombok, sebuah pulau di Indonesia, meliputi berbagai hidangan yang memiliki citarasa khas dan menggunakan bahan-bahan lokal yang tersedia di daerah tersebut"));
        list.add(new MainModel(R.drawable.pizza,"Cheese Pizza","200","Cheese Pizza adalah varian pizza yang terdiri dari adonan pizza yang ditutupi dengan keju leleh sebagai topping utama. Ini adalah salah satu jenis pizza yang paling sederhana dan populer di seluruh dunia"));
        list.add(new MainModel(R.drawable.burger,"Crunchy Paneer Burger","200","Crunchy Paneer Burger adalah variasi burger yang menggunakan paneer sebagai pengganti daging sebagai bahan utama. Paneer adalah keju tradisional India yang terbuat dari susu, dan dalam Crunchy Paneer Burger, paneer dipotong dan dipanggang atau digoreng hingga menjadi renyah"));
        list.add(new MainModel(R.drawable.pizza,"Chilly Paneer Pizza","200"," Chilly Paneer Pizza, roti pizza biasanya diisi dengan potongan paneer yang dipanggang atau ditumis dengan saus dan bumbu pedas. Paneer biasanya dipotong menjadi dadu atau kotak kecil sebelum dimasak. Bumbu pedas yang digunakan dapat beragam, tetapi biasanya termasuk cabai, bawang putih, jahe, dan saus pedas seperti saus cabai atau saus sambal."));
        list.add(new MainModel(R.drawable.man,"Gravy Manchurian","200","Gravy Manchurian adalah hidangan populer dalam masakan Indo-Cina. Ini adalah variasi dari Manchurian, yang pada umumnya terdiri dari bola-bola sayuran atau daging yang digoreng kering dengan bumbu-bumbu Asia Timur seperti saus soya, saus cabai, bawang putih, dan jahe."));
        list.add(new MainModel(R.drawable.b,"cappuccino","200","Cappuccino adalah minuman kopi yang populer di seluruh dunia, terutama di Italia dan banyak negara barat"));
        list.add(new MainModel(R.drawable.breadpizza,"Garlic Bread","200","Garlic Bread adalah hidangan roti yang diolah dengan bawang putih dan bumbu-bumbu lainnya untuk memberikan rasa yang kaya dan aromatik. Ini adalah hidangan pendamping yang populer di banyak restoran, kafe, dan rumah makan di berbagai belahan dunia "));
        list.add(new MainModel(R.drawable.pizza,"Chicken Delight Pizza","200","Chicken Delight Pizza adalah variasi pizza yang memiliki ayam sebagai bahan utama dan ditambah dengan berbagai topping dan saus untuk memberikan cita rasa yang lezat. Ini adalah salah satu jenis pizza yang populer di banyak restoran dan warung makan"));
        list.add(new MainModel(R.drawable.burger,"Chicken Burger","200","Chicken Burger adalah jenis burger yang menggunakan daging ayam sebagai bahan utama. Ini adalah alternatif populer untuk burger yang biasanya terbuat dari daging sapi"));
        list.add(new MainModel(R.drawable.chiken,"Double Decker Burger ","200","Double Decker Burger adalah jenis burger yang terdiri dari dua lapis roti burger yang diisi dengan beberapa lapisan patty daging, tambahan seperti keju, sayuran, dan saus"));
        list.add(new MainModel(R.drawable.pizza,"Cheese Overloaded Pizza","200","Cheese Overloaded Pizza adalah jenis pizza yang memiliki jumlah keju yang sangat melimpah"));
        list.add(new MainModel(R.drawable.butter_chiken,"gravy Chicken","200","Gravy Chicken adalah hidangan daging ayam yang dimasak dengan saus kental atau berkuah yang disebut gravy. Gravy biasanya memiliki tekstur yang lebih kental dan kaya rasa, dan sering digunakan sebagai pelengkap hidangan daging untuk memberikan cita rasa dan kelembutan tambahan"));

        list.add(new MainModel(R.drawable.pizza,"Veggie Special Pizza","200","Veggie Special Pizza adalah jenis pizza yang dikhususkan untuk vegetarian, artinya tidak mengandung daging atau bahan-bahan hewani. Ini adalah pilihan yang populer bagi mereka yang memilih diet vegetarian atau ingin menikmati hidangan pizza berbasis sayuran"));
        list.add(new MainModel(R.drawable.pasta,"Napolean Pasta","200","Jamur, zukini, brokoli, campuran paprika dengan saus merah Nepoli"));
        list.add(new MainModel(R.drawable.rosted,"Tandoori Chicken","200","Tandoori Chicken adalah hidangan daging ayam yang berasal dari India. Dalam hidangan ini, ayam biasanya dimarinasi dalam campuran bumbu rempah-rempah khas India, seperti yoghurt, garam, merica, kunyit, jintan, paprika, cabai, bawang putih, jahe, dan jus lemon"));
        list.add(new MainModel(R.drawable.pizza,"Non Veg Supreme Pizza","200","Non Veg Supreme Pizza adalah jenis pizza yang mengandung bahan-bahan non-vegetarian atau bahan hewani. Ini adalah pilihan yang populer bagi mereka yang menyukai hidangan pizza dengan tambahan daging dan produk hewani lainnya"));
        list.add(new MainModel(R.drawable.alootikki,"Aloo Tikki Burger","200","Aloo Tikki Burger adalah sebuah burger yang menggunakan aloo tikki sebagai salah satu bahan utamanya. Aloo tikki adalah kentang tumbuk yang dibentuk menjadi patty dan digoreng hingga kecokelatan. Dalam Aloo Tikki Burger, patty aloo tikki tersebut biasanya menjadi pengganti patty daging pada burger tradisional"));

        list.add(new MainModel(R.drawable.fires,"French Fires","200","French Fries adalah hidangan yang terdiri dari potongan kentang yang digoreng hingga renyah dan kecokelatan. French Fries biasanya memiliki bentuk yang panjang dan tipis, dan seringkali dihidangkan sebagai makanan pembuka, camilan, atau sebagai pendamping hidangan utama"));
        list.add(new MainModel(R.drawable.burji,"Burji","200","Burji adalah hidangan yang mengandung telur dan sayuran serta rempah yang dicampur menjadi satu"));
        list.add(new MainModel(R.drawable.dosa,"Dosa","200","Dosa adalah hidangan khas India yang terbuat dari adonan fermentasi yang terdiri dari nasi dan lentil. Ini adalah jenis pancake yang tipis dan renyah, dengan rasa yang sedikit asam dan tekstur yang ringan"));
        list.add(new MainModel(R.drawable.dal,"Dal Makhni","200","Dal Makhani adalah hidangan khas India yang terdiri dari lentil hitam (urad dal) dan kacang merah (rajma) yang dimasak dalam saus krim gurih dan beraroma kaya. Hidangan ini memiliki tekstur kental dan rasa yang lezat"));
        list.add(new MainModel(R.drawable.noodel,"Noodles","200","Noodles adalah hidangan makanan yang terbuat dari tepung terigu, air, dan kadang-kadang juga telur. Noodles telah menjadi makanan pokok dalam berbagai budaya, terutama dalam masakan Asia seperti masakan Tiongkok, Jepang, Korea, dan banyak lagi"));
        list.add(new MainModel(R.drawable.sandwich,"Corn Delight Sandwich","200","Corn Delight Sandwich adalah sandwich yang berisi isian jagung manis yang lezat. Biasanya, jagung manis dipadukan dengan bahan-bahan seperti keju, sayuran, dan bumbu untuk menciptakan rasa yang menyegarkan dan gurih. Sandwich ini dapat disajikan sebagai hidangan pembuka, camilan, atau hidangan utama"));
        list.add(new MainModel(R.drawable.momo,"Momos","200","Momos adalah semacam dumpling atau bola adonan yang diisi dengan campuran daging atau sayuran yang dibumbui dengan rempah-rempah dan disajikan dengan saus penyerta"));
        list.add(new MainModel(R.drawable.wrap,"Wraps","200","Wraps adalah jenis makanan yang terdiri dari berbagai bahan yang dibungkus dengan menggunakan lapisan roti, tortilla, atau daun sayuran. Makanan ini umumnya memiliki isian yang beragam, seperti daging, sayuran, keju, saus, dan bumbu lainnya"));
        list.add(new MainModel(R.drawable.bchicken,"Butter Chicken","200","Butter Chicken adalah hidangan khas India yang terdiri dari potongan daging ayam yang dimasak dalam saus krim berbumbu dan beraroma kaya. Hidangan ini memiliki rasa yang lezat, kaya rempah-rempah, dan sedikit manis"));
        list.add(new MainModel(R.drawable.pulao,"Pulao","200","Pulao merupakan hidangan nasi yang dimasak dengan campuran bumbu, rempah-rempah, dan bahan lainnya, seperti daging, ayam, ikan, sayuran, atau kacang-kacangan"));
        list.add(new MainModel(R.drawable.vegcrs,"Veg crispy","200","Veg Crispy, atau yang juga dikenal sebagai Vegetable Crispy, adalah hidangan yang terdiri dari sayuran yang dipotong dan dilapisi dengan adonan tepung yang kemudian digoreng hingga renyah dan garing"));
        list.add(new MainModel(R.drawable.dhokla,"Dhokla","200","Dhokla adalah hidangan khas India yang berasal dari negara bagian Gujarat. Dhokla terbuat dari adonan yang terdiri dari tepung gram (tepung kacang kuda), tepung beras, dan yogurt yang difermentasi, serta bumbu-bumbu seperti kunyit, cabai hijau, jahe, dan baking soda"));
        list.add(new MainModel(R.drawable.idli,"Idli Sambar","200","Idli adalah sejenis kue beras yang dibuat dari adonan yang terbuat dari lentil hitam (urad dal) dan beras yang dihaluskan dan direndam, kemudian diukus hingga matang. Idli memiliki tekstur lembut dan spongy"));
        list.add(new MainModel(R.drawable.shahi,"Shahi Paneer","200","Shahi Paneer adalah hidangan khas India yang terdiri dari potongan keju paneer (keju cottage) yang dimasak dalam saus krim berbumbu"));
        list.add(new MainModel(R.drawable.pav,"Pav Bhaji","200","Pav Bhaji adalah hidangan populer dari India, terutama di kawasan Mumbai. Ini terdiri dari dua komponen utama: pav (sejenis roti bulat) dan bhaji (semacam saus kentang dan sayuran yang ditumis)"));
        list.add(new MainModel(R.drawable.shahi,"Chhole Bhature","200","Chhole Bhature adalah hidangan khas India yang terdiri dari Chhole (kacang-kacangan) dan Bhature (sejenis roti lembut dan berminyak)"));
        list.add(new MainModel(R.drawable.butterroti,"Butter naan","200","Butter Naan adalah sejenis roti khas India yang sangat populer. Naan adalah roti datar yang terbuat dari adonan tepung terigu, yogurt, ghee (mentega jernih), dan ragi sebagai bahan pengembang. Butter Naan adalah variasi naan yang ditambahi mentega pada permukaannya"));
        list.add(new MainModel(R.drawable.roti,"Plain Roti","200","Plain & lean bread merupakan roti yang dibuat dengan komposisi adonan gula dan margarin dalam resep dengan prosentase di bawah 10 %. Roti jenis ini biasanya dimakan menggunaka selai, aneka topping ataupun dijadikan burger"));
        list.add(new MainModel(R.drawable.firni,"Firni","200","Firni adalah jenis puding nasi yang dibuat dengan menggunakan beras basmati yang dihaluskan atau bubur beras khusus"));
        list.add(new MainModel(R.drawable.jamun,"Gulab Jamun","200","Gulab Jamun terdiri dari bola-bola kecil yang lembut dan manis, terbuat dari adonan susu kental yang dikenal sebagai khoya (mawa) yang kemudian digoreng dalam minyak atau ghee (mentega jernih), dan direndam dalam sirup gula aromatik"));
        list.add(new MainModel(R.drawable.rasgulla,"Rasgulla","200","Rasgulla adalah hidangan penutup tradisional India yang terbuat dari bola-bola kecil yang lembut dan kenyal, terbuat dari adonan susu yang dikenal sebagai chhena (sejenis keju cottage) yang kemudian direbus dalam sirup gula"));
        list.add(new MainModel(R.drawable.matar,"Mushroom Matar","200","Mushroom Matar adalah hidangan yang terdiri dari jamur dan kacang polong (matar) yang dimasak bersama dalam bumbu khusus"));

        MainAdapter adapter = new MainAdapter(list,cid,food_activity.this);
        binding.recycleview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recycleview.setLayoutManager(layoutManager);


        plus = findViewById(R.id.plus_btn);
        call = findViewById(R.id.call_btn);
        rating = findViewById(R.id.rate_btn);
        cart = findViewById(R.id.cart_btn);
        screen = findViewById(R.id.screen_id);



        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9815959064"));
                startActivity(intent);
            }
        });

        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(food_activity.this,rating_act.class);
                startActivity(i);

            }
        });


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isAllFabsVisible)
                {
                    call.hide();
                    rating.hide();
                    cart.hide();
                    isAllFabsVisible = false;

                }
                else
                {
                    call.show();
                    rating.show();
                    cart.show();
                    isAllFabsVisible = true;
//
                }


            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle1 = new Bundle();
                bundle1.putInt("Cid",cid);
                Intent intent3 = new Intent(food_activity.this,order_activity.class);
                intent3.putExtras(bundle1);
                startActivity(intent3);
            }
        });



    }


}