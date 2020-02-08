package com.example.iraniansazdetails.album;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.iraniansazdetails.R;
import com.example.iraniansazdetails.album.adapter.AlbumAdapter;
import com.example.iraniansazdetails.datamodel.PicasooDataModel;
import com.example.iraniansazdetails.generator.PicassoDataGenerator;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import static android.content.Context.MODE_PRIVATE;

public class AlbumActivity extends Fragment implements AlbumAdapter.onClickitem {

    RecyclerView recyclerView;
    Context context;
    SharedPreferences prefs;
    AlbumAdapter adapter;
    TextView txt_album;
    int id;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        android.view.View view=inflater.inflate(R.layout.activity_album,container,false);
        //full screen
        getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        recyclerView=view.findViewById(R.id.album_recycler);
        txt_album=view.findViewById(R.id.txt_album);
        Typeface typface=Typeface.createFromAsset(getActivity().getAssets(),"fonts/iranblack.ttf");
        txt_album.setTypeface(typface);

        prefs = this.getActivity().getSharedPreferences("shared", MODE_PRIVATE);
        int id1=prefs.getInt("id",0);

        switch (id1)
        {
            case 0:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelTeh(),this);
                txt_album.setText("گالری تصاویر تهران");
                id=0;
                break;
            case 1:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelTurk(),this);
                txt_album.setText("گالری تصاویر ترک های ایران");
                id=1;
                break;
            case 2:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelKurd(),this);
                txt_album.setText("گالری تصاویر کردهای ایران");
                id=2;
                break;
            case 3:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelLor(),this);
                txt_album.setText("گالری تصاویر لرهای ایران");
                id=3;
                break;
            case 4:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelKhorasan(),this);
                txt_album.setText("گالری تصاویر خراسان");
                id=4;
                break;
            case 5:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelBakh(),this);
                txt_album.setText("گالری تصاویر بختیاری");
                id=5;
                break;
            case 6:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelKoli(),this);
                txt_album.setText("گالری تصاویر کولیان ایران");
                id=6;
                break;
            case 7:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelMazandaran(),this);
                txt_album.setText("گالری تصاویر مازندران");
                id=7;
                break;
            case 8:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelGilan(),this);
                txt_album.setText("گالری تصاویر گیلان");
                id=8;
                break;
            case 9:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelSis(),this);
                txt_album.setText("گالری تصاویر سیستان و بلوچستان");
                id=9;
                break;
            case 10:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelTurkaman(),this);
                txt_album.setText("گالری تصاویر ترکمن های ایران");
                id=10;
                break;
            case 11:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelGolestan(),this);
                txt_album.setText("گالری تصاویر گلستان");
                id=11;
                break;
        }

        adapter.notifyDataSetChanged();
       // final LinearLayoutManager layoutManager = new  LinearLayoutManager(getActivity());
        //layoutManager.setOrientation(RecyclerView.VERTICAL);

        //recyclerView.setLayoutManager(layoutManager);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity().getApplicationContext(), 2, RecyclerView.VERTICAL,false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        System.gc();
      // Animation animation= AnimationUtils.loadAnimation(view.getContext(),R.anim.clockwise);
      // animation.setRepeatCount(Animation.INFINITE);
      // animation.setRepeatMode(Animation.REVERSE);
      // animation.setDuration(5000);
       // recyclerView.startAnimation(animation);
        return view;
    }

    public static AlbumActivity newInstance() {
        
        Bundle args = new Bundle();
        
        AlbumActivity fragment = new AlbumActivity();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.gc();
    }

    @Override
    public void onClick(PicasooDataModel model) {
        String path=model.getImage();
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        final AlertDialog dialog = builder.create();
        LayoutInflater inflater = getLayoutInflater();
        View dialogLayout = inflater.inflate(R.layout.dialog, null);
        dialog.setView(dialogLayout);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);


        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface d) {
                ImageView image =dialog.findViewById(R.id.goProDialogImage);
                Picasso.with(context).load(path).into(image);
                TextView dialogText=dialog.findViewById(R.id.dialogTxt);

                Typeface typface=Typeface.createFromAsset(getActivity().getAssets(),"fonts/iranblack.ttf");
                dialogText.setTypeface(typface);

                int mId;

                switch (id)
                {
                    //teh
                    case 0:
                        mId=model.getId();
                        if (mId==0)
                        {
                            dialogText.setText("شیرازی سرنانَواز قشقایی ِ های تِهران شهریار");
                        }
                        else if (mId==1)
                        {
                            dialogText.setText("دونَوازی سرنا و دهل لرهای قرچک");
                        }
                        break;

                        //turk
                    case 1:
                        mId=model.getId();
                        switch (mId)
                        {
                            case 0:
                                dialogText.setText("استاد عاشیق حسن اِسکندری تبریز");
                                break;
                            case 1:
                                dialogText.setText("اُستاد یزدان قوالنَواز اُرومیهِ");
                                break;
                            case 2:
                                dialogText.setText("اُستاد یزدان قوالنَواز اُرومیهِ");
                                break;
                            case 3:
                                dialogText.setText("");
                                break;
                            case 4:
                                dialogText.setText("عاشیق یوسف اُهانِس اُرومیِه");
                                break;
                            case 5:
                                dialogText.setText("");
                                break;
                            case 6:
                                dialogText.setText("");
                                break;
                            case 7:
                                dialogText.setText("قنبرعلی ( شکرعلی ) براتی آیینخوان درگز");
                                break;
                            case 8:
                                dialogText.setText("نوازنده ترک اِیلسوون منطقه فردگان اُستان مرکزی");
                                break;
                        }
                        break;

                        //kurd
                    case 2:
                        mId=model.getId();
                        switch (mId) {
                            case 0:
                                dialogText.setText("استاد درویش رحیم امینی مهاباد");
                                break;
                            case 1:
                                dialogText.setText("اُستاد شفیع خالِدی خواننده آوازهای اورامی کردی");
                                break;
                            case 2:
                                dialogText.setText("اُستاد عین الدین اَلماسی کانی دینار خواننده و نوازنده مریوان");
                                break;
                            case 3:
                                dialogText.setText("حیران خالِدی خواننده آوازهای آیینی کردی منطقه کارآباد مریوان");
                                break;
                            case 4:
                                dialogText.setText("دوزله نَواز مشهور مهابادی اُستاد حسن مصطفی َ پور (حَسن دوزله)");
                                break;
                            case 5:
                                dialogText.setText("دونَوازی سرنا و دهل کردستان");
                                break;
                            case 6:
                                dialogText.setText("زنان تنبور نَواز کرمانشاهی");
                                break;
                            case 7:
                                dialogText.setText("موسیقی آیینی کردستان");
                                break;
                            case 8:
                                dialogText.setText("استاد درویش رحیم امینی مهاباد");
                                break;
                        }
                        break;

                       //lor
                    case 3:
                        mId=model.getId();
                        switch (mId) {
                            case 0:
                                dialogText.setText("عباس نقوی");
                                break;
                            case 1:
                                dialogText.setText("غلامرضا سبز علي منقبت خوان خرم آباداستان لرستان");
                                break;
                            case 2:
                                dialogText.setText("ُگروه موسیقی لرهای ساکن قرچک تِهران");
                                break;
                        }
                        break;

                        //khorasan
                    case 4:
                        mId=model.getId();
                        switch (mId) {
                            case 0:
                                dialogText.setText("");
                                break;
                            case 1:
                                dialogText.setText("اُستاد غلامعلی پورعطای تربت جام");
                                break;
                            case 2:
                                dialogText.setText("ُ ُ ستادان حِسین سمندری و اِبراهیم شریف زاده باخرز تایباد");
                                break;
                            case 3:
                                dialogText.setText("ُ استادان حِسین سمندری و اِبراهیم شریف ِ زاده باخرز تایباد");
                                break;
                            case 4:
                                dialogText.setText("ُ استادان کریم کریمی و نورمحمد درپور تربت جام");
                                break;
                            case 5:
                                dialogText.setText("حَسن عابدینی خواننده کاشمر خراسان رَضوی");
                                break;
                            case 6:
                                dialogText.setText("حَسن عابدینی خواننده کاشمر خراسان رَضوی");
                                break;
                            case 7:
                                dialogText.setText("شیخ محمد جوریان اُستاد رباعیخوانی نِیشابور");
                                break;
                            case 8:
                                dialogText.setText("عثمان محمدپرست (خوافی)");
                                break;
                            case 9:
                                dialogText.setText("عثمان محمدپرست (خوافی)");
                                break;
                            case 10:
                                dialogText.setText("قاسمی سرنانَواز جوان قائن");
                                break;
                            case 11:
                                dialogText.setText("گروه موسیقی منطقه کاشمر خراسان رَضوی");
                                break;
                            case 12:
                                dialogText.setText("موسیقی زنان کاشمر");
                                break;
                            case 13:
                                dialogText.setText("نورمحمد درپور");
                                break;
                            case 14:
                                dialogText.setText("نورمحمد درپور");
                                break;
                            case 15:
                                dialogText.setText("استاد ابراهیم شریف زاده");
                                break;
                        }
                        break;

                        //bakh
                    case 5:
                        mId=model.getId();
                        switch (mId) {
                            case 0:
                                dialogText.setText("دونَوازی کرنا و دهل بختیاری");
                                break;
                            case 1:
                                dialogText.setText("دونَوازی سرنا و دهل بختیاری");
                                break;
                            case 2:
                                dialogText.setText("دونَوازی کرنا و دهل بختیاری");
                                break;
                            case 3:
                                dialogText.setText("موسیقی زنان بختیاری");
                                break;

                        }
                        break;

                        //koli
                    case 6:
                        mId=model.getId();
                        switch (mId) {
                            case 0:
                                dialogText.setText("آتشگر قیچکنَواز کولی");
                                break;
                            case 1:
                                dialogText.setText("آتشگر قیچکنَواز کولی");
                                break;
                            case 2:
                                dialogText.setText("آخرین فرد بازمانده نَسل کولیها در آبِین کرمناجها آشخانِه بجنورد");
                                break;
                        }
                        break;

                        //mazandaran
                    case 7:
                        mId=model.getId();
                        switch (mId) {
                            case 0:
                                dialogText.setText("رمضان شکارچی(ارزمون)");
                                break;
                            case 1:
                                dialogText.setText("رمضان شکارچی(ارزمون)");
                                break;
                            case 2:
                                dialogText.setText("رمضان شکارچی(ارزمون)");
                                break;
                            case 3:
                                dialogText.setText("");
                                break;
                            case 4:
                                dialogText.setText("محمدرضا اسحاقی");
                                break;
                            case 5:
                                dialogText.setText("دونَوازی سرنا و دهل لـله ِ وا و نقاره مازندرانیها");
                                break;
                        }
                        break;

                        //gilan
                    case 8:
                        mId=model.getId();
                        switch (mId) {
                            case 0:
                                dialogText.setText("آیینهای موسیقیی زنان تالش");
                                break;
                            case 1:
                                dialogText.setText("دونَوازی سرنا و دهل تالشی");
                                break;
                            case 2:
                                dialogText.setText("رمضانی موسیقیورز لاهیجان");
                                break;
                            case 3:
                                dialogText.setText("روانشاد عاشق قسمت خوانی خواننده تالِش");
                                break;
                            case 4:
                                dialogText.setText("علی کلرمی موذن و منقبت خوان منطقه تالش گیلان");
                                break;
                            case 5:
                                dialogText.setText("کرنانَوازی آیینی لاهیجان");
                                break;
                            case 6:
                                dialogText.setText("کرنای شاخی کرمانج منطقه رستم آباد گیلان");
                                break;
                            case 7:
                                dialogText.setText("گلآقا شفیعی نقاره نواز منطقة تالش گیلان");
                                break;
                            case 8:
                                dialogText.setText("روانشاد استاد بیتالله هیزمشکن، لبک و تشتنَوازی تالِشی");
                                break;
                            case 9:
                                dialogText.setText("مهرپویا نوازنده تنبوره تالِشی");
                                break;
                            case 10:
                                dialogText.setText("استاد ناصر وحدتی در کنار نقاره گیلان، منطقة آستانة اشرفیه");
                            case 11:
                                dialogText.setText("آرمین فریدی موسیقیدان تالِش");
                                break;
                        }
                        break;

                        //sis
                    case 9:
                        mId=model.getId();
                        switch (mId) {
                            case 0:
                                dialogText.setText("اُستاد علیمحمد بلوچ قیچک نَواز");
                                break;
                            case 1:
                                dialogText.setText("استاد محمداسحاق بلوچ و ُگروه همراهش");
                                break;
                            case 2:
                                dialogText.setText("استاد محمداسحاق بلوچ");
                                break;
                            case 3:
                                dialogText.setText("");
                                break;
                            case 4:
                                dialogText.setText("استاد محمداسحاق بلوچ و ُگروه همراهش");
                                break;
                            case 5:
                                dialogText.setText("همنَوازی سرنا و دوهلکها درموسیقی بلوچها");
                                break;
                            case 6:
                                dialogText.setText("اُستاد شیرمحمد اِسپندار دونلینَواز بلوچ");
                                break;
                        }
                        break;

                        //Turkaman
                    case 10:
                        mId=model.getId();
                        switch (mId) {
                            case 0:
                                dialogText.setText("اُستاد آی ُمَحّمد یوسفی بَخشی ترکمن درگز");
                                break;
                            case 1:
                                dialogText.setText("استادان دردی اسماعیل زاده و رحمان قلیچ یمودی");
                                break;
                            case 2:
                                dialogText.setText("آشور گلدی برزین (گارکازی)");
                                break;
                            case 3:
                                dialogText.setText("آشور گلدی برزین (گارکازی)");
                                break;
                            case 4:
                                dialogText.setText("آشور گلدی برزین (گارکازی)");
                                break;
                            case 5:
                                dialogText.setText("اوغلان بخشی گنبد کاووس");
                                break;
                            case 6:
                                dialogText.setText("بخشی آنا مراد یوسفی بجنورد");
                                break;
                            case 7:
                                dialogText.setText("تاغان قلیچ کوچکنژاد");
                                break;
                            case 8:
                                dialogText.setText("حاج محمد ایری تویدوک نواز ترکمن");
                                break;
                            case 9:
                                dialogText.setText("شوقعلي رئیسي منقبت خوان قشقائي");
                                break;
                            case 10:
                                dialogText.setText("موسیقی زنان قشقایی");
                                break;
                        }
                        break;

                        //Golestan
                    case 11:
                        mId=model.getId();
                        switch (mId) {
                            case 0:
                                dialogText.setText("");
                                break;
                            case 1:
                                dialogText.setText("روانشاد عیسی فیوج اُستاد موسیقی گوداری کتول");
                                break;
                            case 2:
                                dialogText.setText("روانشاد عیسی فیوج اُستاد موسیقی گوداری کتول");
                                break;
                            case 3:
                                dialogText.setText("عباس گالش که برایش منظومه ساختند");
                                break;
                            case 4:
                                dialogText.setText("موسیقی زنان علیآباد کتول");
                                break;
                            case 5:
                                dialogText.setText("");
                                break;
                            case 6:
                                dialogText.setText("ُ َ ستاد علی صادقلو بَ ِ خشی ر ِ ویتگر گریِ ُ لی رامیان گلِستان");
                                break;
                        }
                        break;
                }
                float imageWidthInPX = (float)image.getWidth();

              //  LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Math.round(imageWidthInPX),
              //          Math.round(imageWidthInPX * (float)image.getHeight() / (float)image.getWidth()));
              //  image.setLayoutParams(layoutParams);


            }
        });
        dialog.show();
    }
}
