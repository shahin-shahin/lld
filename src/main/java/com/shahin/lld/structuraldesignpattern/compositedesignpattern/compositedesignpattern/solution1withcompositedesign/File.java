package com.shahin.lld.structuraldesignpattern.compositedesignpattern.compositedesignpattern.solution1withcompositedesign;

public class File implements FileSystem{
    String fileName;

    public File(String name){
        this.fileName = name;
    }

    public void ls(){
        System.out.println("file name " + fileName);
    }
}
