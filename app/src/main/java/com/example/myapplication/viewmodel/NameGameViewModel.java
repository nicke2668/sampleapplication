package com.example.myapplication.viewmodel;

import com.example.myapplication.model.DashboardModel;
import com.example.myapplication.repository.NameGameRepository;

public class NameGameViewModel {

    NameGameRepository repository = NameGameRepository.INSTANCE;
    private long pageLoadStart;
    private long totalTime;
    prii

    //set/list in the repo with all people in memory

    //show staller until list of people are actually download (if not complete by splash screen)

    //inject Dashboard model with first six from list in repo.

    //actualpersonname in Dashboard model.

    //on selection of any person,

    //1. compare name in dashboard model with selected name. if match, use databinding to show green check

    //overlay, and enable continue button reactively.

    //if not match, show red X overlay

    //select 0-5 index for first round, 5-10 second, etc.

    //


    public void onImageSelected() {
        //determine correct selection

        //actualpersonname = selection.getName() show green overlay, else, show red overlay
        totalTime += System.currentTimeMillis() - pageLoadStart;
    }


    public DashboardModel getModel() {
        return repository.getModel();
    }

    public NameGameViewModel() {
        fetchPeople();

    }


    private void fetchPeople() {
        repository.fetchPeople();
    }

    public void onPageLoaded() {
        pageLoadStart = System.currentTimeMillis();
    }
}
