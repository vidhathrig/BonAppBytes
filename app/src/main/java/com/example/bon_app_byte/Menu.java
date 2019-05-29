package com.example.bon_app_byte;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;





    public class Menu extends AppCompatActivity {

        private FirebaseDatabase menuDatabase;
        private DatabaseReference myRef;

        public class Dish {

            public String Name;
            public String Price;


            public Dish(String name, String price) {
                Name = name;
                Price = price;
            }
            public Dish()
            {

            }


        }


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        menuDatabase = FirebaseDatabase.getInstance();
        myRef = menuDatabase.getReference("Dish");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Dish d = dataSnapshot.getValue(Dish.class);
                System.out.println(d.Name);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
}
