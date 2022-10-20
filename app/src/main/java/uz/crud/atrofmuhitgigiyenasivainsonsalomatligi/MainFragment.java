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

        themeNoteList.add(new ThemeNote("1.1.1. Ekotizim va salomatlik", new int[]{4,5,6}));
//        themeNoteList.add(new ThemeNote("1.1.2. Atrof-muhit tushunchasi", new int[]{5}));
//        themeNoteList.add(new ThemeNote("1.1.3. Atrof muhit omillari va tizimi", new int[]{5,6}));
        themeNoteList.add(new ThemeNote("1.2.1. Atrof - muhitga moslashish va uni insonga ta’siri", new int[]{6,7,8,9}));
//        themeNoteList.add(new ThemeNote("1.2.2. Atrof - muhit omillarini tasniflash", new int[]{6,8}));
//        themeNoteList.add(new ThemeNote("1.2.3. Gomeostaz, moslashish, tozalashning ta’rifi va tushunchalari", new int[]{8,9}));
        themeNoteList.add(new ThemeNote("1.3. Atrof – muhit salomatligi tarixi va ifloslanish halokatlari", new int[]{9,10,11,12,13,14,15,16}));
//        themeNoteList.add(new ThemeNote("", new int[]{1,2,3}));
//        themeNoteList.add(new ThemeNote("", new int[]{1,2,3}));
//        themeNoteList.add(new ThemeNote("", new int[]{1,2,3}));


        listNoteList.add(new ListNote("I BOB. ATROF MUHIT VA INSON SALOMATLIGI", themeNoteList));
        themeNoteList=new ArrayList<>();
        themeNoteList.add(new ThemeNote("1.7. To’xtatgichlar va tormozlar", new int[]{65,66,67,68,69,70,71}));
        themeNoteList.add(new ThemeNote("1.8. Tormozlar", new int[]{68,69,70,71,}));
        themeNoteList.add(new ThemeNote("1.9. Qurilish mashinalari haqida umumiy ma’lumot", new int[]{72,73,74,75}));
        listNoteList.add(new ListNote("II BOB. ATROF MUHIT OMILLARINI ME’YORLASHTIRISH", themeNoteList));
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