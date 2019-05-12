package com.sydoruk1ua.lessons.lesson20.strings;

import java.util.List;

public abstract class SentenceElementA {
    private List<Symbol> symbolList;

    public SentenceElementA(List<Symbol> symbolList) {
        this.symbolList = symbolList;
    }

    public List<Symbol> getSymbolList() {
        return symbolList;
    }

    public void setSymbolList(List<Symbol> symbolList) {
        this.symbolList = symbolList;
    }
}
