package behavioral.iterator.impl;

import behavioral.iterator.model.Channel;
import behavioral.iterator.model.ChannelCollection;
import behavioral.iterator.model.ChannelIterator;
import behavioral.iterator.model.ChannelTypeEnum;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

    List<Channel> channels ;

    public ChannelCollectionImpl() {
        this.channels = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel channel) {
        this.channels.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        this.channels.remove(channel);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum channelTypeEnum) {
        ChannelIterator channelIterator = new ChannelIteratorImpl(channelTypeEnum, channels);
        return channelIterator;
    }
}
