package com.cydeo.solid.dependencyInversion.good;

public class XmlReader implements Reader {


    @Override
    public String getUsername() {
        return "<username>mikesmith</username>";
    }
}
