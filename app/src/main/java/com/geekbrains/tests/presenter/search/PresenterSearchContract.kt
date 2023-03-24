package com.geekbrains.tests.presenter.search

import com.geekbrains.tests.presenter.PresenterContract

internal interface PresenterSearchContract : PresenterContract {

    fun searchGitHub(searchQuery: String)

    override fun onAttach()

    override fun onDetach()
}
