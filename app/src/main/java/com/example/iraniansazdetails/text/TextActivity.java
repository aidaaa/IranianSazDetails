package com.example.iraniansazdetails.text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.iraniansazdetails.R;

import java.lang.ref.WeakReference;

import static android.content.Context.MODE_PRIVATE;

public class TextActivity extends Fragment {

    TextView txt,txt_city;
    SharedPreferences preferences;
    RelativeLayout layout_txt;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.test,container,false);
        getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        txt=view.findViewById(R.id.txt1);
        layout_txt=view.findViewById(R.id.layout_txt);
        txt_city=view.findViewById(R.id.textView);
        String text=getText();
        txt.setText(text);
        Typeface typface=Typeface.createFromAsset(getActivity().getAssets(),"fonts/iransans.ttf");
        txt.setTypeface(typface);
        txt_city.setTypeface(typface);
        return view;
    }

    public static TextActivity newInstance() {
        
        Bundle args = new Bundle();
        
        TextActivity fragment = new TextActivity();
        fragment.setArguments(args);
        return fragment;
    }

    public String getText()
    {
        preferences=this.getActivity().getSharedPreferences("shared", MODE_PRIVATE);
        int index=preferences.getInt("id",0);
        String text="";

        switch (index)
        {
            case 0:
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.teh_txt_back, null));
                txt_city.setText("موسیقی" +
                        " \n"+
                        " تهران و حومه");

                text="موسيقي تهران به دليل مسائل مختلف تاريخي ديني بيشتر از گونه آوازي سود مي برد و در اثر تحولات اين ناحيه پس از حكومت افشاريان دچار تغييرات فراوان شده است به گونه اي كه موسيقي درباري توسط گروههاي خاص در آن شكل يافته و پيش رفته\u200C، تا جايي\u200Cكه وضع اولين تئوريهاي هفت دستگاهي كردن موسيقي ايران را به يك يهودي به نام «بابا مردوخ » نسبت مي دهند و گفته مي شود كه دست نوشته هاي او كه در عهد قاجاريه نوشته بوده در عهد پهلوي دوم تعريف و تفسير علمي تري يافته و متحول مي شود، در عين حالي كه ابهاماتي نيز در اين مسئله وجود دارد.";
                break;


            case 1:
                txt_city.setText("موسیقی " +
                                " \n"+
                        "ترک های ایران");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.turk_txt_back, null));
                text="محدودة جغرافيايي امروز ايران ، نمي تواند هويت تاريخي و فرهنگي و سوابقِ كهن موسيقي، موسيقيِ تركهاي ايران را به طور كامل بيان نمايد، چرا كه موسيقي ، مرزشناس نيست بلكه دلجو و مردم شناس است و به همين سبب، هنري فرهنگ ساز محسوب ميگردد."+
                "\n"+
                "موسيقي تركهاي ايران گسترة پيوسته\u200Cاي از منطقة آذربايجان شرقي\u200C، اردبيل\u200C، هشتپر و توالش\u200C، قزوين\u200C، زنجان\u200C، همدان\u200C، استان مركزي\u200C، فارس\u200C، گلستان\u200C، خراسان\u200C، آذربايجان غربي و جبهه\u200Cاي از خاك مازندران را در بردارد."+
                        " \n"+
                "\u200Cدر تمامي اين مناطق موسيقي عاشيقها و نغمات تركي در قالب موقام ـ هاواـ هاراي (هراي) و بسته جريان دارد كه بيشتر آنها تاريخشان به اوزانهاي اوغوز مي\u200Cرسد.";
                break;


            case 2:
                txt_city.setText("موسیقی " +
                        " \n"+
                        "کردهای ایران");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.kurd_txt_back, null));
                text="وقتي به رشته كوههاي غرورآفرين زاگرس مي\u200Cانديشي و بلنديهاي افسانه\u200Cاي\u200Cاش را در نظر مي\u200Cآوري بي\u200Cاختيار از اعماق قرون گذشته توكايي محزون و پ\u200Dُرشتاب به سويت پ\u200Dَر مي\u200Cكشد كه با نغمه\u200Cهايش هوش از سر هر متفكر و گذرنده\u200Cاي مي\u200Cربايد.\n" +
                        "\u200Cنغمه\u200Cهايي كه حماسي\u200Cاند، پ\u200Dُرتلاش و كارساز و هيجان\u200Cآور؛ دلدادگي را مي\u200Cگويند، شوخ و طنزآورند. هر نغمه حماسه\u200Cاي دارد، حماسة جدال با سنگ و صخره و خارستان و دره و رودهاي پ\u200Dُرخروش\u200C. جدال با ظالم و متجاوز و تنازع بر سر بقا. توكاي غرب ايران\u200C، موسيقي زيباي كردي است\u200C، چون با وجود آنكه قرنها باران تير تهاجم فرهنگي از سوي اقوام مختلف را بر خود تحمل كرده اما هنوز بالهايش با وسعت و قدرت عظيمي گسترده است\u200C.\n";
                break;


            case 3:
                txt_city.setText("موسیقی" +
                        " \n"+
                        " لرهای ایران");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.lorestan_txt_back, null));
                text="\u200Cلرستان كهن\u200Cترين مأمن ايلي در كشور ماست\u200C. بر اساس گفته\u200Cها و مستندات مورخان و شرق\u200Cشناسان به طور يقين نژادِ بخش عمدة لرهاي ساكن كنوني از بقاياي آرياييهاي مهاجرند و درصد بسيار كمي از آنان ساكنان قبلي اين منطقه\u200Cاند.\n" +
                        "موسيقي لرستان به سبب قدمتي كه دارد و هم\u200Cجواري منطقه با تنوع قومي لرها متشكل از لك\u200C، لر، بختياري\u200C، پاپي و عرب\u200Cكوهي داراي آميختگي و تنوع خاصي به لحاظ نغمگي است كه ضمن ايجاد رنگارنگي از اعجاب\u200Cانگيزترين نقشهاي نغمگي در موسيقي كشورمان به حساب مي\u200Cآيد.\n";
                break;


            case 4:
                txt_city.setText("موسیقی " +
                        " \n"+
                        "خراسان");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.khorasan_txt_back, null));
                text="به سبب تنوع نژادي و طايفه\u200Cاي در دو ناحية مورد بررسي از خاك خراسان موسيقي نيز داراي گوناگوني خاص به صورت زير است\u200C:\n" +
                        "\u200Cموسيقي سرحد جنوب خراسان\u200C\n" +
                        "\u200Cموسيقي جنوب خراسان\u200C\n" +
                        "\u200Cموسيقي حاشيه كويري خراسان\u200C\n" +
                        "\u200Cموسيقي خراسان ميانه\u200C\n" +
                        "\u200Cپرداخت هر مجموعه از اين موسيقيها خود تاريخ بسيار پرحادثه\u200Cاي را در برمي\u200Cگيرد. اما به طور كلّي در موسيقي نواحي مورد بحث هشت دستة كلي موسيقي وجود دارد كه به صورت زير مي\u200Cتوان آن را بيان نمود:\n" +
                        "\u200C1. مقامهايي كه پايه\u200Cهاي اصلي\u200Cشان داستانهاي تاريخي مذهبي است\u200C.\n" +
                        "\u200C2. مقامهايي داراي داستان كه بر اساس\u200Cحماسه\u200Cهاي قومي\u200C، طايفه\u200Cاي شكل يافته\u200Cاند.\n" +
                        "\u200C3. مقامهايي كه ريشه در نحله\u200Cهاي فلسفي دارند.\n" +
                        "\u200C4. مقامهاي بدون كلام توصيفي.\n" +
                        "\u200C5. ترانه\u200Cها.\n" +
                        "\u200C6. آوازها.\n" +
                        "\u200C7. موسيقي خرده\u200Cنمايشها و نمايشهاي آئيني\u200C.\n" +
                        "\u200C8. موسيقي آئينهاي باورمدارانه\u200C.\n";
                break;


            case 5:
                txt_city.setText("موسیقی " +
                        " \n"+
                        "بختیاری");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.bakh_txt_back, null));
                text="\u200Cيكي از مؤلفه\u200Cهاي مهم موسيقي درون ايل بختياري اين است كه كلام اشعار تابع اوزان هجايي\u200Cاند و به قواعد عروضي اعتناي چنداني ندارد و بيشتر سيلابي است\u200C.\n" +
                        "\u200Cاز مشخصات بارز موسيقي بختياري كه هنوز هيچ پژوهشي دربارة آن به صورت جامع صورت نپذيرفته جمع\u200Cخواني به\u200Cويژه در ميان زنان است كه به صورت هتروفونيك و هموفونيك انجام مي\u200Cشود و تاريخ خاصي از نواها و نغمه\u200Cهاي باستاني را در خود دارد كه مي\u200Cتواند بسياري از ادعاهاي مدعيان غرب\u200Cباور را پاسخ گويد. با آنكه خودرويي (خودجوشي\u200C) از اختصاصات ترانه\u200Cهاي بختياري است اما در عين فرديت از درون\u200Cمايه\u200Cهاي فراگير جمع برخوردار است. گردش مقامي (مدولاسيون\u200C) به گونه\u200Cاي حيرت\u200Cانگيز و ظريف در اين موسيقي صورت مي\u200Cپذيرد كه اگر ساعتها به موسيقي بختياري گوش فرا دهيد، احساس خستگي نمي\u200Cكنيد.\n";
                break;


            case 6:
                txt_city.setText("موسیقی " +
                        " \n"+
                        "کولیان ایران");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.koli_txt_back, null));
                text="موسيقي كوليان ايران در حقيقت نيمي از موسيقي سازي و ترانه\u200Cاي ايران را در مناطق گوناگون كشور تشكيل مي\u200Cدهد. تأثيرات موسيقي اين قوم بر موسيقي ايران كنوني هنوز پوشيده مانده است اما آنچه كه در پژوهشهايم به\u200Cدست آمد اينكه در هر كجا كه اينان هنوز به عنوان موسيقي\u200Cورزِ بومي فعاليت دارند نام اين مقام يا آهنگها را مي\u200Cشنويد: كابلي\u200C، هندي\u200C، دوراني\u200C، كولي\u200Cمقام (كوليانه\u200C).\n" +
                        "\u200Cكوليان در هيچ كجاي ايران چندان خوش\u200Cنام نيستند اما موسيقي قابل بررسي و عميقي را اجرا مي\u200Cنمايند كه تا كنون روي آن پژوهش دقيقي صورت نيافته است و تا جايي كه مي\u200Cدانم مرحوم يحيي ذكاء در موسيقي كوليان پژوهش نموده\u200Cاند.\n";
                break;


            case 7:
                txt_city.setText("موسیقی" +
                        " \n"+
                        " مازندران");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.maz_txt_back, null));
                text="\u200Cموسيقي در مفهوم كلّي همانند ساير نقاط ايران از تولّد تا مرگ در زندگي انسانهايي كه در مازندران زيست مي\u200Cكنند حضور دارد. اين موسيقي از نظر عمل\u200Cكننده به دو جنسيت تقسيم مي\u200Cشود:\n" +
                        "الف) زنان\u200C\n" +
                        "ب) مردان\u200C\n" +
                        "و سه شكل اجرايي (نوع\u200C) دارد:\n" +
                        "آوازي / سازي\u200C/ تركيبي (ساز و آوازي\u200C)\n" +
                        "و از نظر موسيقي\u200Cورزي به چهار دسته تقسيم مي\u200Cشود:\n" +
                        "الف\u200C) نغمه\u200Cخوانان مذهبي\u200C\n" +
                        "ب\u200C) نغمه\u200Cخوانان قومي\u200C\n" +
                        "ج\u200C) موسيقي\u200Cورزان قومي در دو شاخة اجتماعي و جامعة صنفي (گالشها و شبانان\u200C)\n" +
                        "د) موسيقي\u200Cورزان مهاجر (گودارها)\n";
                break;


            case 8:
                txt_city.setText("موسیقی " +
                        " \n"+
                        "گیلان و تالش");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.gilan_txt_back, null));
                text="موسيقي گيلان در يك نگاه كلّي\u200C، طبيعت\u200Cگرايانه است و از اشتراكات خاصي بهره مي\u200Cبرد كه به جهت وفاق فكري و هسته\u200Cهاي پيوند قومي داراي اهميت است و آن بهره\u200Cگيري از سلسله جبال البرز و درياچة خزر است\u200C. بخش ديگر موسيقي گيلان از تنوعاتِ قوميِ كوچيده و ساكن\u200Cشده در آن ناحيه بهره مي\u200Cگيرد. اقوامي چون صوفيان، خلعتبريها، عامارلوهاي كرد (عمارلو) و تركهاي آذربايجان كهن كه به مرور زمان در اين سرزمين رشد يافته\u200Cاند و زبانهاي گيلي\u200C، تاتي\u200C، تركي\u200C، كرمانج شمالي، راجي و پارسي جديد در آن جاري است.";
                break;


            case 9:
                txt_city.setText("موسیقی" +
                        " \n"+
                        " سیستان و بلوچستان");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.sis_txt_back, null));
                text="براي ورود به بحث دربارة آهنگها، ترانه\u200Cها و ماهيت اصلي موسيقي اين سرزمين به اندازة تنوع طوايف در اين دو ناحيه از ميهن عزيزمان كه به عنوان يك استان آن را مي\u200Cشناسيم تعريف دارد.\n" +
                        "زبان نيز در اين سرزمين به سبب تنوع طوايف داراي لونهاي گوناگون است، زبان بلوچي\u200C، براهويي\u200C، پارسي دري\u200C، سواحلي\u200C، كه در اين ميان زبان براهويي به دو لهجة شرقي و لهجة غربي تقسيم مي\u200Cشود. علاوه بر آنكه طوايف كوچ و تاجيكها نيز داراي گويش خاص خود هستند كه گويش كاشانيهاي پنجگور، مينگلهاي نوشكي، مينگلهاي جهلاواني و زبان كرمانجي شمالي و همين طور زبان طوايف كولي منطقه از اين دست هستند.\n";
                break;


            case 10:
                txt_city.setText("موسیقی " +
                        " \n"+
                        "ترکمن های ایران");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.turkaman_txt_back, null));
                text="\u200Cموسيقي تركمن به سبب پيوند با زندگي مردم تركمن داراي نوعي صلابت و صراحت است و پايبندي آن به قواعد دستور زباني تركمن بي\u200Cنظير است و بيشتر به\u200Cجاي استفاده از عروض و اوزان هجايي مرسوم در ادبيات ايران از جملات سيلابي بهره مي\u200Cگيرد و تغييرات هجايي آن از چهار تا هفده الي هجده هجا مي\u200Cباشد. در عين حالي كه شاعراني چون مختوم\u200Cقلي فراغي\u200C، مسكين\u200Cقليچ و كمينه سعي داشته\u200Cاند تا ادب تركمن را در بخش نظم به بحور تعريف\u200Cشده نزديك نمايند، ضمن آنكه تأثيرات شعر حافظ بر مختوم\u200Cقلي را نبايد ناديده گرفت\u200C.";

                break;


            case 11:
                txt_city.setText("موسیقی " +
                        " \n"+
                        "گلستان");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.gol_txt_back, null));
                text="اين سرزمين پس از هخامنشيان همواره در طول تاريخ تا پايان انقراض قاجاريه مورد تهاجم و قتل و غارت اقوام مهاجم بوده است\u200C، اما آنچه كه از نظر پژوهش موسيقي در اين منطقه مهم است حضور و وجود چهار نوع از موسيقي قومي در آن است كه به ترتيب عبارت\u200Cاند از:\n" +
                        "1. موسيقي تركهاي گرايلي منطقه\u200C\n" +
                        "2. موسيقي كتولي\u200C\n" +
                        "3. موسيقي گالشي\u200C\n" +
                        "4. موسيقي طوايف كوچ (كوليها (گودار)، سيستاني\u200C، بلوچ\u200C، عرب\u200C، كرمانج\u200C)\n";
                break;
        }
        return text;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.gc();
    }
}
