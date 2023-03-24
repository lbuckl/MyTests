package com.geekbrains.tests.details

import com.geekbrains.tests.presenter.details.DetailsPresenter
import com.geekbrains.tests.view.details.ViewDetailsContract
import com.nhaarman.mockito_kotlin.verify
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.times

class DetailsPresenterTest {

    private val viewContract = mock(ViewDetailsContract::class.java)

    private val count = 0

    private val presenter = DetailsPresenter(viewContract, count)

    @Test
    fun setCounterAndOnAttach(){
        presenter.setCounter(5)

        presenter.onAttach()

        verify(viewContract, times(1)).setCount(5)
    }

    @Test
    fun onIncrement(){
        presenter.onIncrement()

        verify(viewContract, times(1)).setCount(1)
    }

    @Test
    fun onDecrement(){
        presenter.onDecrement()

        verify(viewContract, times(1)).setCount(-1)
    }
}