package behavioral.iterator.impl;

import behavioral.iterator.model.Channel;
import behavioral.iterator.model.ChannelIterator;
import behavioral.iterator.model.ChannelTypeEnum;

import java.util.List;

public class ChannelIteratorImpl implements ChannelIterator {

    private ChannelTypeEnum channelTypeEnum;
    private List<Channel> channels;
    private int position;

    public ChannelIteratorImpl(ChannelTypeEnum channelTypeEnum, List<Channel> channels) {
        this.channelTypeEnum = channelTypeEnum;
        this.channels = channels;
    }

    @Override
    public boolean hasNext() {
        while (position < channels.size()){
            Channel channelCurrent = channels.get(position);
            if(channelCurrent.getTYPE().equals(this.channelTypeEnum)
                    || channelTypeEnum.equals(ChannelTypeEnum.ALL)){
                return true;
            }else{
                position ++;
            }
        }
        return false;
    }

    @Override
    public Channel next() {
        Channel channelCurrent = channels.get(position);
        position++;
        return channelCurrent;
    }
}
