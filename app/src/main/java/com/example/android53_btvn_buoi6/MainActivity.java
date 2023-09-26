package com.example.android53_btvn_buoi6;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private  DBHelper mDbHelper;
    private RecyclerView rvProducts;
    private ImageButton ibSearch;
    private EditText edtSearch;
    private ProductAdapter mProductAdapter;
    ArrayList<ProductModel> mListProduct ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();

    }

    private void initView() {
        rvProducts = findViewById(R.id.rvProducts);
        ibSearch = findViewById(R.id.ibSearch);
        edtSearch = findViewById(R.id.edtSearch);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        rvProducts.setLayoutManager(gridLayoutManager);
        rvProducts.setAdapter(mProductAdapter);


    }

    private void initData() {
        mDbHelper = new DBHelper(this);
        mListProduct = new ArrayList<>();
        mProductAdapter = new ProductAdapter(mListProduct, this);
        ProductModel productModel = new ProductModel();
        List<String> images = new ArrayList<>();
        productModel.setTitle("iPhone 9");
        productModel.setDescription("An apple mobile which is nothing like apple");
        productModel.setPrice(549);
        productModel.setDiscountPercentage(12.96);
        productModel.setRating(4.69);
        productModel.setStock(94);
        productModel.setBrand("Apple");
        productModel.setCategory("smartphones");
        productModel.setThumbnail("https://i.dummyjson.com/data/products/1/thumbnail.jpg");
        images.add("https://i.dummyjson.com/data/products/1/1.jpg");
        images.add("https://i.dummyjson.com/data/products/1/2.jpg");
        images.add("https://i.dummyjson.com/data/products/1/3.jpg");
        images.add("https://i.dummyjson.com/data/products/1/4.jpg");
        productModel.setImages(images);
        mDbHelper.addProduct(productModel);

        productModel.setTitle("iPhone x");
        productModel.setDescription("SIM-Free, Model A19211 6.5-inch Super Retina HD display with OLED technology A12 Bionic chip with ...");
        productModel.setPrice(899);
        productModel.setDiscountPercentage(17.94);
        productModel.setRating(4.44);
        productModel.setStock(34);
        productModel.setBrand("Apple");
        productModel.setCategory("smartphones");
        productModel.setThumbnail("https://i.dummyjson.com/data/products/2/thumbnail.jpg");
        images.add("https://i.dummyjson.com/data/products/2/1.jpg");
        images.add("https://i.dummyjson.com/data/products/2/2.jpg");
        images.add("https://i.dummyjson.com/data/products/2/3.jpg");
        productModel.setImages(images);
        mDbHelper.addProduct(productModel);

        productModel.setTitle(" Samsung Universe 9");
        productModel.setDescription("Samsung's new variant which goes beyond Galaxy to the Universe");
        productModel.setPrice(1249);
        productModel.setDiscountPercentage(15.46);
        productModel.setRating(4.09);
        productModel.setStock(36);
        productModel.setBrand("Samsung");
        productModel.setCategory("smartphones");
        productModel.setThumbnail("https://i.dummyjson.com/data/products/3/thumbnail.png");
        images.add("https://i.dummyjson.com/data/products/3/1.jpg");
        productModel.setImages(images);
        mDbHelper.addProduct(productModel);

        productModel.setTitle("OPPOF19");
        productModel.setDescription("OPPO F19 is officially announced on April 2021.");
        productModel.setPrice(280);
        productModel.setDiscountPercentage(17.91);
        productModel.setRating(4.3);
        productModel.setStock(123);
        productModel.setBrand("OPPO");
        productModel.setCategory("smartphones");
        productModel.setThumbnail("https://i.dummyjson.com/data/products/4/thumbnail.jpg");
        images.add("https://i.dummyjson.com/data/products/4/1.jpg");
        images.add("https://i.dummyjson.com/data/products/4/2.jpg");
        images.add("https://i.dummyjson.com/data/products/4/3.jpg");
        productModel.setImages(images);
        mDbHelper.addProduct(productModel);

        productModel.setTitle("Huawei P30");
        productModel.setDescription("Huawei’s re-badged P30 Pro New Edition was officially unveiled yesterday in Germany and now the device has made its way to the UK.");
        productModel.setPrice(499);
        productModel.setDiscountPercentage(10.58);
        productModel.setRating(4.09);
        productModel.setStock(32);
        productModel.setBrand("Huawei");
        productModel.setCategory("smartphones");
        productModel.setThumbnail("https://i.dummyjson.com/data/products/5/thumbnail.jpg");
        images.add("https://i.dummyjson.com/data/products/5/1.jpg");
        images.add("https://i.dummyjson.com/data/products/5/2.jpg");
        images.add("https://i.dummyjson.com/data/products/5/3.jpg");
        productModel.setImages(images);
        mDbHelper.addProduct(productModel);

        productModel.setTitle(" MacBook Pro");
        productModel.setDescription("An apple mobile which is nothing like apple");
        productModel.setPrice(1749);
        productModel.setDiscountPercentage(12.96);
        productModel.setRating(4.69);
        productModel.setStock(94);
        productModel.setBrand("Apple");
        productModel.setCategory("smartphones");
        productModel.setThumbnail("https://i.dummyjson.com/data/products/6/thumbnail.jpg");
        images.add("https://i.dummyjson.com/data/products/6/1.png");
        images.add("https://i.dummyjson.com/data/products/6/2.jpg");
        images.add("https://i.dummyjson.com/data/products/6/3.png");
        images.add("https://i.dummyjson.com/data/products/6/4.jpg");
        productModel.setImages(images);
        mDbHelper.addProduct(productModel);

        productModel.setTitle("Samsung Galaxy Book");
        productModel.setDescription("Samsung Galaxy Book S (2020) Laptop With Intel Lakefield Chip, 8GB of RAM Launched");
        productModel.setPrice(1499);
        productModel.setDiscountPercentage(4.15);
        productModel.setRating(4.25);
        productModel.setStock(50);
        productModel.setBrand("Samsung");
        productModel.setCategory("laptops");
        productModel.setThumbnail("https://i.dummyjson.com/data/products/7/thumbnail.jpg");
        images.add("https://i.dummyjson.com/data/products/7/1.jpg");
        images.add("https://i.dummyjson.com/data/products/7/2.jpg");
        images.add("https://i.dummyjson.com/data/products/7/3.jpg");
        productModel.setImages(images);
        mDbHelper.addProduct(productModel);

        productModel.setTitle(" Microsoft Surface Laptop 4");
        productModel.setDescription("Style and speed. Stand out on HD video calls backed by Studio Mics. Capture ideas on the vibrant touchscreen.");
        productModel.setPrice(1499);
        productModel.setDiscountPercentage(10.23);
        productModel.setRating(4.43);
        productModel.setStock(68);
        productModel.setBrand("Microsoft Surface");
        productModel.setCategory("laptops");
        productModel.setThumbnail("https://i.dummyjson.com/data/products/8/thumbnail.jpg");
        images.add("https://i.dummyjson.com/data/products/8/1.jpg");
        images.add("https://i.dummyjson.com/data/products/8/2.jpg");
        images.add("https://i.dummyjson.com/data/products/8/3.jpg");
        images.add("https://i.dummyjson.com/data/products/8.4.jpg");
        productModel.setImages(images);
        mDbHelper.addProduct(productModel);

        productModel.setTitle("Infinix INBOOK");
        productModel.setDescription("Infinix Inbook X1 Ci3 10th 8GB 256GB 14 Win10 Grey – 1 Year Warranty");
        productModel.setPrice(1099);
        productModel.setDiscountPercentage(11.83);
        productModel.setRating(4.54);
        productModel.setStock(96);
        productModel.setBrand("Infinix");
        productModel.setCategory("laptops");
        productModel.setThumbnail("https://i.dummyjson.com/data/products/9/thumbnail.jpg");
        images.add("https://i.dummyjson.com/data/products/9/1.jpg");
        images.add("https://i.dummyjson.com/data/products/9/2.png");
        images.add("https://i.dummyjson.com/data/products/9/3.png");
        images.add("https://i.dummyjson.com/data/products/9/4.jpg");
        productModel.setImages(images);
        mDbHelper.addProduct(productModel);

        productModel.setTitle("HP Pavilion 15-DK1056WM");
        productModel.setDescription("HP Pavilion 15-DK1056WM Gaming Laptop 10th Gen Core i5, 8GB, 256GB SSD, GTX 1650 4GB, Windows 10");
        productModel.setPrice(1099);
        productModel.setDiscountPercentage(6.18);
        productModel.setRating(4.43);
        productModel.setStock(89);
        productModel.setBrand("HP Pavilion");
        productModel.setCategory("laptops");
        productModel.setThumbnail("https://i.dummyjson.com/data/products/10/thumbnail.jpeg");
        images.add("https://i.dummyjson.com/data/products/10/1.jpg");
        images.add("https://i.dummyjson.com/data/products/10/2.jpg");
        images.add("https://i.dummyjson.com/data/products/10/3.jpg");
        productModel.setImages(images);
        mDbHelper.addProduct(productModel);
        Log.d(TAG, "initData: " + mDbHelper.getProducts().size());

        ibSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = edtSearch.getText().toString().trim();
                List<ProductModel> results = mDbHelper.getProductsByTitle(title);
                mProductAdapter.updateList(results);
            }
        });
    }
}