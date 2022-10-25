package uz.crud.atrofmuhitgigiyenasivainsonsalomatligi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import uz.crud.atrofmuhitgigiyenasivainsonsalomatligi.adapters.ListAdapter;
import uz.crud.atrofmuhitgigiyenasivainsonsalomatligi.adapters.ThemeAdapter;
import uz.crud.atrofmuhitgigiyenasivainsonsalomatligi.notes.ListNote;
import uz.crud.atrofmuhitgigiyenasivainsonsalomatligi.notes.ThemeNote;

public class MainFragment extends Fragment implements ThemeAdapter.ItemClickListener {


    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);


        List<ListNote> listNoteList = new ArrayList<>();
        List<ThemeNote> themeNoteList = new ArrayList<>();
        themeNoteList.add(new ThemeNote("KIRISH", new int[]{2, 3}));
        listNoteList.add(new ListNote("KIRISH", themeNoteList));
        themeNoteList = new ArrayList<>();

        themeNoteList.add(new ThemeNote("1.1. Ekotizim va salomatlik", new int[]{4, 5, 6}));
//        themeNoteList.add(new ThemeNote("1.1.2. Atrof-muhit tushunchasi", new int[]{5}));
//        themeNoteList.add(new ThemeNote("1.1.3. Atrof muhit omillari va tizimi", new int[]{5,6}));
        themeNoteList.add(new ThemeNote("1.2. Atrof - muhitga moslashish va uni insonga ta’siri", new int[]{6, 7, 8, 9}));
//        themeNoteList.add(new ThemeNote("1.2.2. Atrof - muhit omillarini tasniflash", new int[]{6,8}));
//        themeNoteList.add(new ThemeNote("1.2.3. Gomeostaz, moslashish, tozalashning ta’rifi va tushunchalari", new int[]{8,9}));
        themeNoteList.add(new ThemeNote("1.3. Atrof – muhit salomatligi tarixi va ifloslanish halokatlari", new int[]{9, 10, 11, 12, 13, 14, 15, 16}));
//        themeNoteList.add(new ThemeNote("", new int[]{1,2,3}));
//        themeNoteList.add(new ThemeNote("", new int[]{1,2,3}));
//        themeNoteList.add(new ThemeNote("", new int[]{1,2,3}));


        listNoteList.add(new ListNote("I BOB. ATROF MUHIT VA INSON SALOMATLIGI", themeNoteList));
        themeNoteList = new ArrayList<>();
        themeNoteList.add(new ThemeNote("2.2. Xavfli kimyoviy moddalarni nazorat qilish tizimi", new int[]{17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27}));

        listNoteList.add(new ListNote("II BOB. ATROF MUHIT OMILLARINI ME’YORLASHTIRISH", themeNoteList));
        themeNoteList = new ArrayList<>();
        themeNoteList.add(new ThemeNote("3.1. Atmosfera havosining sifatini tekshirish va baholash", new int[]{29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39}));
        themeNoteList.add(new ThemeNote("3.2. Transchegaraviy va global atrof-muhit ifloslanishi.", new int[]{39, 40, 41, 42, 43, 44, 45, 46}));
        listNoteList.add(new ListNote("III BOB. ATMOSFERA HAVOSINING SIFATINI EKSPERIMENTAL TEKSHIRISHLAR", themeNoteList));
        themeNoteList = new ArrayList<>();
        themeNoteList.add(new ThemeNote("4.1. Atmosferaning ifloslanishi", new int[]{46, 47, 48, 49, 50, 51, 52, 53, 54}));
        themeNoteList.add(new ThemeNote("4.2. Xorijda ifloslanish bilan bog‘liq halokatlar", new int[]{54, 55, 56, 57, 58, 59, 60, 61}));
        themeNoteList.add(new ThemeNote("4.3. Koreyadagi ifloslanish bilan bog‘liq halokatlar", new int[]{61, 62, 63, 64, 65, 66, 67, 68, 69}));
        listNoteList.add(new ListNote("IV BOB. CHIQINDILAR", themeNoteList));
        themeNoteList = new ArrayList<>();
        themeNoteList.add(new ThemeNote("5.1. Suvning sirkulyatsiyasi", new int[]{69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90}));

        listNoteList.add(new ListNote("V BOB. GIDROSFERA MENEJMENTI", themeNoteList));

        themeNoteList = new ArrayList<>();
        themeNoteList.add(new ThemeNote("6.1. Tuproqning sanitar-gigiyenik ahamiyati", new int[]{90, 91, 92, 93, 94, 95, 96, 97, 98}));

        listNoteList.add(new ListNote("VI BOB. TUPROQNING SANITAR-GIGIYENIK AHAMIYATI", themeNoteList));

        themeNoteList = new ArrayList<>();
        themeNoteList.add(new ThemeNote("7.1. Miqdoriy analizga kirish", new int[]{98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111}));

        listNoteList.add(new ListNote("VII BOB. ANALITIK KIMYO VA EKSPERIMENT", themeNoteList));

        themeNoteList = new ArrayList<>();
        themeNoteList.add(new ThemeNote("8.1. Talidomid (thalidomide) fojeasi", new int[]{111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159}));

        listNoteList.add(new ListNote("VIII BOB. SALOMATLIK VA EKOLOGIK TOKSIKOLOGIYA", themeNoteList));

        themeNoteList = new ArrayList<>();
        themeNoteList.add(new ThemeNote("9.1. Atrof-muhit epidemiologiyasining ta’rifi va o‘rni", new int[]{159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178}));
        themeNoteList.add(new ThemeNote("9.2. Sog‘liq uchun xavfni baholash", new int[]{178, 179, 180, 181, 182, 183, 184, 185}));
        themeNoteList.add(new ThemeNote("9.3. Atrof-muhit salomatligini boshqarish", new int[]{185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237}));
        themeNoteList.add(new ThemeNote("9.4. Oziq-ovqat xavfsizligi", new int[]{237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261}));
        themeNoteList.add(new ThemeNote("9.5. Homila va yosh bolalarning ekologik salomatligi", new int[]{261, 262, 263, 264, 265, 266, 267, 268}));

        listNoteList.add(new ListNote("IX BOB. JAMOAT SOG‘LIG‘INI SAQLASH", themeNoteList));

        themeNoteList = new ArrayList<>();
        themeNoteList.add(new ThemeNote("10.1. Yopiq muhit ifloslanish ta’rifi va sog‘liqqa ta’siri", new int[]{268, 269, 270, 271, 272, 273, 274, 275, 276, 277}));

        listNoteList.add(new ListNote("X BOB. YOPIQ XONALARDA HAVO KO‘RSATKICHLARINI BAHOLASH", themeNoteList));

        themeNoteList = new ArrayList<>();
        themeNoteList.add(new ThemeNote("11.1. Ekologik omillar va aholi salomatligi", new int[]{277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291}));

        listNoteList.add(new ListNote("XI БОБ. EKOLOGIK XAVFNI BAHOLASH KONSEPSIYASI", themeNoteList));

        themeNoteList = new ArrayList<>();
        themeNoteList.add(new ThemeNote("12.1. Radiatsion gigiyena fani haqida tushuncha. Radiologik bo‘limning tekshiruv obyektlari haqida tushuncha", new int[]{ 291,292,293,294,295,296,297,298,299,300,301,302,303,304,305,306,307,308,309,310,311,312,313}));

        listNoteList.add(new ListNote("XII BOB. ATROF MUHIT VA RADIATSION XAVFSIZLIK", themeNoteList));

        themeNoteList = new ArrayList<>();
        themeNoteList.add(new ThemeNote("GLOSSARIY", new int[]{ 313,314}));

        listNoteList.add(new ListNote("GLOSSARIY", themeNoteList));


        //        themeNoteList.add(new ThemeNote("", new int[]{1,2,3}));


        RecyclerView recyclerView = view.findViewById(R.id.list_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        ListAdapter adapter = new ListAdapter(requireActivity(), listNoteList, this);

        recyclerView.setAdapter(adapter);

//        view.findViewById(R.id.btn_floating).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                List<SearchListItem> searchListItems = new ArrayList<>();
//
//                searchListItems.add(new SearchListItem(1,"Title 1"));
//                searchListItems.add(new SearchListItem(2,"Title 2"));
//                searchListItems.add(new SearchListItem(3,"Title 3"));
//                searchListItems.add(new SearchListItem(4,"Title 4"));
//                SearchableDialog searchableDialog = new SearchableDialog(requireActivity(), searchListItems, "Title");
//                searchableDialog.show();
//            }
//        });

    }

    @Override
    public void onItemClick(ThemeNote themeNote) {
        Bundle bundle = new Bundle();
        bundle.putString("title", themeNote.getTitle());
        bundle.putString("data", Arrays.toString(themeNote.getPages()));


        navController.navigate(R.id.action_mainFragment_to_pdfFragment, bundle);
    }

}