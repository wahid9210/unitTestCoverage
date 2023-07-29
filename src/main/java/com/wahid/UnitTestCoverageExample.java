package com.wahid;

public class UnitTestCoverageExample {

    public String getMessage(String name)
    {
        StringBuilder s=new StringBuilder();
        if(name==null || name.length()==0)
        {
            s.append("Wahid Wahid Empty Empty");
        }
        else {
            s.append("Hello Mr/Mrs "+name);
        }
        return s.toString();
    }


}
