package com.company;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream {
    public MyObjectOutputStream() throws IOException {
        super();
    }
    public MyObjectOutputStream(OutputStream o) throws IOException {
        super(o);
    }
    public void writeStreamHeader(){}
    // This overrides the method in the parent class, so that he does not write to the file header when calling writeObject()
}