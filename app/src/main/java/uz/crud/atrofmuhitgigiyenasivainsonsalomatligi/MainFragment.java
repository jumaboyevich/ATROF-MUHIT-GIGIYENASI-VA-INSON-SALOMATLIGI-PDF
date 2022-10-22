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


        List<ListNote> listNoteList=new ArrayList<>();
        List<ThemeNote> themeNoteList=new ArrayList<>();
        themeNoteList.add(new ThemeNote("KIRISH", new int[]{2,3}));
        listNoteList.add(new ListNote("KIRISH", themeNoteList));
        themeNoteList=new ArrayList<>();

        themeNoteList.add(new ThemeNote("1.1. Ekotizim va salomatlik", new int[]{4,5,6}));
//        themeNoteList.add(new ThemeNote("1.1.2. Atrof-muhit tushunchasi", new int[]{5}));
//        themeNoteList.add(new ThemeNote("1.1.3. Atrof muhit omillari va tizimi", new int[]{5,6}));
        themeNoteList.add(new ThemeNote("1.2. Atrof - muhitga moslashish va uni insonga ta’siri", new int[]{6,7,8,9}));
//        themeNoteList.add(new ThemeNote("1.2.2. Atrof - muhit omillarini tasniflash", new int[]{6,8}));
//        themeNoteList.add(new ThemeNote("1.2.3. Gomeostaz, moslashish, tozalashning ta’rifi va tushunchalari", new int[]{8,9}));
        themeNoteList.add(new ThemeNote("1.3. Atrof – muhit salomatligi tarixi va ifloslanish halokatlari", new int[]{9,10,11,12,13,14,15,16}));
//        themeNoteList.add(new ThemeNote("", new int[]{1,2,3}));
//        themeNoteList.add(new ThemeNote("", new int[]{1,2,3}));
//        themeNoteList.add(new ThemeNote("", new int[]{1,2,3}));


        listNoteList.add(new ListNote("I BOB. ATROF MUHIT VA INSON SALOMATLIGI", themeNoteList));
        themeNoteList=new ArrayList<>();
        themeNoteList.add(new ThemeNote("2.2. Xavfli kimyoviy moddalarni nazorat qilish tizimi", new int[]{17,18,19,20,21,22,23,24,25,26,27}));

        listNoteList.add(new ListNote("II BOB. ATROF MUHIT OMILLARINI ME’YORLASHTIRISH", themeNoteList));
        themeNoteList=new ArrayList<>();
        themeNoteList.add(new ThemeNote("3.1. Atmosfera havosining sifatini tekshirish va baholash", new int[]{29,30,31,32,33,34,35,36,37,38,39}));
        themeNoteList.add(new ThemeNote("3.2. Transchegaraviy va global atrof-muhit ifloslanishi.", new int[]{39,40,41,42,43,44,45,46}));
        listNoteList.add(new ListNote("III BOB. ATMOSFERA HAVOSINING SIFATINI EKSPERIMENTAL TEKSHIRISHLAR", themeNoteList));
        themeNoteList=new ArrayList<>();
        themeNoteList.add(new ThemeNote("4.1. Atmosferaning ifloslanishi", new int[]{46,47,48,49,50,51,52,53,54}));
        themeNoteList.add(new ThemeNote("4.2. Xorijda ifloslanish bilan bog‘liq halokatlar", new int[]{54,55,56,57,58,59,60,61}));
        themeNoteList.add(new ThemeNote("4.3. Koreyadagi ifloslanish bilan bog‘liq halokatlar", new int[]{61,62,63,64,65,66,67,68,69}));
        listNoteList.add(new ListNote("IV BOB. CHIQINDILAR", themeNoteList));
        themeNoteList=new ArrayList<>();
        themeNoteList.add(new ThemeNote("5.1. Suvning sirkulyatsiyasi", new int[]{69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90}));

        listNoteList.add(new ListNote("V BOB. GIDROSFERA MENEJMENTI", themeNoteList));


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