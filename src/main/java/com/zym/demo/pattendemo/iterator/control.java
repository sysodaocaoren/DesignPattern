package com.zym.demo.pattendemo.iterator;

import java.util.ArrayList;
import java.util.List;

public class control {

    private List<Channel> channelList = new ArrayList<Channel>();

    public void addChannel(Channel channel){
        channelList.add(channel);
    }

    public ChannelIterator createIterator(){
        return new ChannelIterator(channelList);
    }
}
