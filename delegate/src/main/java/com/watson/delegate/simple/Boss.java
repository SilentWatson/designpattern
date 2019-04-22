package com.watson.delegate.simple;

public class Boss {
    private Leader leader;
    public Boss(Leader leader){
        this.leader = leader;
    }
    public void command(String command){
        leader.doing(command);
    }
}
