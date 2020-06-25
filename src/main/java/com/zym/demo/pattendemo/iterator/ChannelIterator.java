package com.zym.demo.pattendemo.iterator;

import java.util.List;

public class ChannelIterator implements Iterator {

    private List<Channel> channelList;

    private int cursor;

    public ChannelIterator(List<Channel> channelList) {
        cursor = 0;
        this.channelList = channelList;
    }

    public List<Channel> getChannelList() {
        return channelList;
    }

    public void setChannelList(List<Channel> channelList) {
        this.channelList = channelList;
    }

    public int getCursor() {
        return cursor;
    }

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }

    @Override
    public void next() {
        if (cursor < channelList.size()) {
            cursor++;
        }
    }

    @Override
    public boolean isLast() {
        return cursor == channelList.size();
    }

    @Override
    public void previous() {
        if (cursor > 0) {
            cursor--;
        }
    }

    @Override
    public Channel getNextItem() {
        return cursor == channelList.size() ? channelList.get(cursor) : channelList.get(++cursor);
    }

    @Override
    public Channel getPreviousItem() {
        return cursor == 0 ? channelList.get(cursor) : channelList.get(--cursor);
    }
}
