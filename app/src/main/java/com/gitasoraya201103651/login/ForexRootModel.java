package com.gitasoraya201103651.login;

import com.google.gson.annotations.SerializedName;

public class ForexRootModel
{
    @SerializedName("rates")
    private ForexRatesModel RatesModel;

    public  ForexRootModel () {}

    public ForexRatesModel getForexRatesModel() {return RatesModel;}

    public void setRatesModel(ForexRatesModel ratesModel) {
        this.RatesModel = RatesModel;
    }
}
